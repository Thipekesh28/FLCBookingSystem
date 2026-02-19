package com.mycompany.flcbookingsystem;

import java.util.*;

public class FLCSystem {

    private List<Member> members = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    private int bookingCounter = 1;

    public FLCSystem() {
        createMembers();
        createLessons();
    }

    private void createMembers() {
        members.add(new Member(1, "John"));
        members.add(new Member(2, "Mary"));
        members.add(new Member(3, "David"));
        members.add(new Member(4, "Emma"));
    }

    private void createLessons() {

        int lessonId = 1;

        String[] types = {"Yoga", "Zumba", "BoxFit", "Aquacise"};
        double[] prices = {10, 12, 15, 13};

        for (int month = 5; month <= 6; month++) {
            for (int weekend = 1; weekend <= 4; weekend++) {

                lessons.add(new Lesson(lessonId++, types[0], "Saturday", "Morning", prices[0], month));
                lessons.add(new Lesson(lessonId++, types[1], "Saturday", "Afternoon", prices[1], month));
                lessons.add(new Lesson(lessonId++, types[2], "Saturday", "Evening", prices[2], month));

                lessons.add(new Lesson(lessonId++, types[3], "Sunday", "Morning", prices[3], month));
                lessons.add(new Lesson(lessonId++, types[0], "Sunday", "Afternoon", prices[0], month));
                lessons.add(new Lesson(lessonId++, types[1], "Sunday", "Evening", prices[1], month));
            }
        }
    }

    // ================= BOOK =================
    public void bookLesson(Scanner sc) {

        System.out.print("Enter Member ID: ");
        int memberId = sc.nextInt();

        Member member = findMember(memberId);
        if (member == null) {
            System.out.println("Member not found!");
            return;
        }

        displayLessons();

        System.out.print("Enter Lesson ID: ");
        int lessonId = sc.nextInt();

        Lesson lesson = findLesson(lessonId);
        if (lesson == null) {
            System.out.println("Invalid lesson!");
            return;
        }

        if (lesson.isFull()) {
            System.out.println("Lesson is full!");
            return;
        }

        if (isDuplicateBooking(member, lesson)) {
            System.out.println("Duplicate booking not allowed!");
            return;
        }

        Booking booking = new Booking(bookingCounter++, member, lesson);
        lesson.addBooking(booking);
        bookings.add(booking);

        System.out.println("Booking successful! Booking ID: " + booking.getBookingId());
    }

    // ================= CHANGE OR CANCEL =================
    public void changeOrCancelBooking(Scanner sc) {

        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();

        Booking booking = findBooking(id);
        if (booking == null) {
            System.out.println("Booking not found!");
            return;
        }

        System.out.println("1. Change Booking");
        System.out.println("2. Cancel Booking");

        int choice = sc.nextInt();

        if (choice == 2) {
            booking.getLesson().removeBooking(booking);
            booking.setStatus("cancelled");
            System.out.println("Booking cancelled.");
            return;
        }

        displayLessons();
        System.out.print("Enter New Lesson ID: ");
        int newLessonId = sc.nextInt();

        Lesson newLesson = findLesson(newLessonId);

        if (newLesson == null || newLesson.isFull()) {
            System.out.println("Cannot change. Lesson invalid or full.");
            return;
        }

        booking.getLesson().removeBooking(booking);
        newLesson.addBooking(booking);

        booking.setLesson(newLesson);
        booking.setStatus("changed");

        System.out.println("Booking changed successfully!");
    }

    // ================= ATTEND =================
    public void attendLesson(Scanner sc) {

        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Booking booking = findBooking(id);
        if (booking == null) {
            System.out.println("Booking not found!");
            return;
        }

        booking.setStatus("attended");

        System.out.print("Enter Rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();

        System.out.print("Write Review: ");
        String review = sc.nextLine();

        booking.setRating(rating);
        booking.setReview(review);

        System.out.println("Lesson attended successfully!");
    }

    // ================= MONTHLY REPORT =================
    public void monthlyReport(Scanner sc) {

        System.out.print("Enter Month (5 or 6): ");
        int month = sc.nextInt();

        for (Lesson lesson : lessons) {

            if (lesson.getMonth() == month) {

                int count = 0;
                int totalRating = 0;

                for (Booking b : lesson.getBookings()) {
                    if (b.getStatus().equals("attended")) {
                        count++;
                        totalRating += b.getRating();
                    }
                }

                double average = count == 0 ? 0 : (double) totalRating / count;

                System.out.println("Lesson ID: " + lesson.getLessonId()
                        + " | " + lesson.getExerciseType()
                        + " | Members: " + count
                        + " | Avg Rating: " + average);
            }
        }
    }

    // ================= CHAMPION REPORT =================
    public void championReport(Scanner sc) {

        System.out.print("Enter Month (5 or 6): ");
        int month = sc.nextInt();

        Map<String, Double> incomeMap = new HashMap<>();

        for (Lesson lesson : lessons) {

            if (lesson.getMonth() == month) {

                for (Booking b : lesson.getBookings()) {

                    if (b.getStatus().equals("attended")) {

                        incomeMap.put(
                                lesson.getExerciseType(),
                                incomeMap.getOrDefault(lesson.getExerciseType(), 0.0)
                                + lesson.getPrice()
                        );
                    }
                }
            }
        }

        double maxIncome = 0;
        String champion = "";

        for (String type : incomeMap.keySet()) {
            double income = incomeMap.get(type);
            System.out.println(type + " Income: £" + income);

            if (income > maxIncome) {
                maxIncome = income;
                champion = type;
            }
        }

        System.out.println("Champion Exercise Type: " + champion);
    }

    // ================= HELPERS =================
    private Member findMember(int id) {
        for (Member m : members)
            if (m.getMemberId() == id) return m;
        return null;
    }

    private Lesson findLesson(int id) {
        for (Lesson l : lessons)
            if (l.getLessonId() == id) return l;
        return null;
    }

    private Booking findBooking(int id) {
        for (Booking b : bookings)
            if (b.getBookingId() == id) return b;
        return null;
    }

    private boolean isDuplicateBooking(Member member, Lesson lesson) {
        for (Booking b : bookings) {
            if (b.getMember().equals(member)
                    && b.getLesson().equals(lesson)
                    && !b.getStatus().equals("cancelled")) {
                return true;
            }
        }
        return false;
    }

    private void displayLessons() {
        for (Lesson l : lessons) {
            System.out.println("ID: " + l.getLessonId()
                    + " | " + l.getExerciseType()
                    + " | " + l.getDay()
                    + " | " + l.getTime()
                    + " | Month: " + l.getMonth()
                    + " | £" + l.getPrice());
        }
    }
    
    // ================= GUI METHODS =================

    public List<Lesson> getAllLessons() {
        return lessons;
    }

    public String bookLessonGUI(int memberId, int lessonId) {

        Member member = findMember(memberId);
        if (member == null) return "Member not found!";

        Lesson lesson = findLesson(lessonId);
        if (lesson == null) return "Invalid lesson!";

        if (lesson.isFull()) return "Lesson is full!";

        if (isDuplicateBooking(member, lesson))
            return "Duplicate booking not allowed!";

        Booking booking = new Booking(bookingCounter++, member, lesson);
        lesson.addBooking(booking);
        bookings.add(booking);

        return "Booking successful! ID: " + booking.getBookingId();
    }

}
