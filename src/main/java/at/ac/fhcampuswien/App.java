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
            } else {
                if (i == daysInMonth) {
                    System.out.println();
                }
            }
        }
    }

    public static long[] lcg(long seed) {
        long[] lcg = new long[10];
        final long M = (long) Math.pow(2, 31);
        final long A = 1103515245;
        final long C = 12345;

        for (int i = 0; i < lcg.length; i++) {
            lcg[i] = (A * seed + C) % M;
            seed = lcg[i];
        }

        return lcg;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);

        int n;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Guess number %d: ", i + 1);
            n = scanner.nextInt();

            if (i == 9) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            }

            if (n == numberToGuess) {
                System.out.println("You won wisenheimer!");
                return;
            }

            if (n > numberToGuess) System.out.println("The number AI picked is lower than your guess.");
            if (n < numberToGuess) System.out.println("The number AI picked is higher than your guess.");
        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        return random.nextInt(1, 101);
    }

    public static boolean swapArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }

        return true;
    }

    public static String camelCase(String s) {
        String camelCaseSentence = "";
        char[] chars = s.toCharArray();

        char c;
        boolean isUpperCaseLetter;
        boolean isLowerCaseLetter;
        for (int i = 0; i < chars.length; i++){
            c = chars[i];
            isUpperCaseLetter = c > 64 && c < 91;
            isLowerCaseLetter = c > 96 && c < 123;

            if (i == 0){
                if(isUpperCaseLetter) camelCaseSentence += c;
                if(isLowerCaseLetter) camelCaseSentence += (char) (c-32);
            }else{
                boolean isLastCharSpace = chars[i-1] == 32;
                if (isLastCharSpace){
                    if(isUpperCaseLetter) camelCaseSentence += c;
                    if(isLowerCaseLetter) camelCaseSentence += (char) (c-32);
                }else{
                    if (isUpperCaseLetter) camelCaseSentence += (char) (c+32);
                    if (isLowerCaseLetter) camelCaseSentence += c;
                }
            }
        }

        return camelCaseSentence;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}