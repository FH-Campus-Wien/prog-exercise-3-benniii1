package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void oneMonthCalendar(int daysInMonth, int firstWeekdayOfMonth) {
        for (int i = 1; i < firstWeekdayOfMonth; i++) {
            System.out.print("   ");
        }

        int countUntilLineBreak = 0;
        int firstRowComplete = 8 - firstWeekdayOfMonth;
        for (int i = 1; i <= daysInMonth; i++) {
            if (i < 10) {
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i + " ");
            }

            if (i == firstRowComplete) {
                System.out.println();
                countUntilLineBreak = 0;
                continue;
            } else {
                countUntilLineBreak++;
            }

            if (countUntilLineBreak % 7 == 0) {
                System.out.println();
            }else {
                if (i == daysInMonth){
                    System.out.println();
                }
            }
        }

//        if (firstWeekdayOfMonth != 1) System.out.println();
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        oneMonthCalendar(30, 6);
    }
}