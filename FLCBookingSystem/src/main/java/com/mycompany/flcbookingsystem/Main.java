package com.mycompany.flcbookingsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FLCSystem system = new FLCSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== FLC Booking System =====");
            System.out.println("1. Book Lesson");
            System.out.println("2. Change/Cancel Booking");
            System.out.println("3. Attend Lesson");
            System.out.println("4. Monthly Lesson Report");
            System.out.println("5. Monthly Champion Exercise Report");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    system.bookLesson(sc);
                    break;
                case 2:
                    system.changeOrCancelBooking(sc);
                    break;
                case 3:
                    system.attendLesson(sc);
                    break;
                case 4:
                    system.monthlyReport(sc);
                    break;
                case 5:
                    system.championReport(sc);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
