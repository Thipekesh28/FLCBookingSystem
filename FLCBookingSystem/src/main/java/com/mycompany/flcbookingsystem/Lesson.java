package com.mycompany.flcbookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    private int lessonId;
    private String exerciseType;
    private String day;
    private String time;
    private double price;
    private int month;
    private List<Booking> bookings;

    public Lesson(int lessonId, String exerciseType, String day,
                  String time, double price, int month) {

        this.lessonId = lessonId;
        this.exerciseType = exerciseType;
        this.day = day;
        this.time = time;
        this.price = price;
        this.month = month;
        this.bookings = new ArrayList<>();
    }

    public boolean isFull() {
        return bookings.size() >= 4;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        bookings.remove(booking);
    }

    public int getLessonId() {
        return lessonId;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
