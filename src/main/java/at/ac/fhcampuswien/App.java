package at.ac.fhcampuswien;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
    }

    public static long[] lcg(long seed){
        long[] lcg = new long[10];
        final long M = (long) Math.pow(2, 31);
        final long A = 1103515245;
        final long C = 12345;

        for (int i = 0; i < lcg.length; i++){
            lcg[i] = (A * seed + C) % M;
            seed = lcg[i];
        }

        return lcg;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
//        oneMonthCalendar(30, 6);

//        long[] lcg = lcg(0);
//        for (long n : lcg) {
//            System.out.println(n);
//        }
    }
}