//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long naan = sc.nextLong();
//        int direction = sc.nextInt();
//
//        long answer = garebigame.find_plate_value(naan, direction);
//
//        System.out.println(answer);
//    }
//}
//
//
// class garebigame {
//
//    public static boolean wins_in_2_rounds(long naan, long plates) {
//        long n = naan;
//        long p = plates;
//
//        // round 1
//        long eat = Math.min(n, p);
//        n -= eat;
//        p -= eat;
//
//        if (n == 0 && p > 0) {
//            n = naan / 2;
//        } else if (p == 0 && n > 0) {
//            p = plates / 2;
//        }
//
//        // round 2
//        eat = Math.min(n, p);
//        n -= eat;
//        p -= eat;
//
//        return (n == 0 && p == 0);
//    }
//
//    public static long find_plate_value(long naan, int direction) {
//        long start = (direction == 1) ? naan + 1 : 1;
//        long end = (direction == 1) ? naan * 2 : naan - 1;
//
//        for (long plates = start; plates <= end; plates++) {
//            if (wins_in_2_rounds(naan, plates)) {
//                return plates;
//            }
//        }
//
//        return -1;
//    }
//}
//

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        int a = scan.nextInt();

        double b = scan.nextDouble();
        scan.nextLine();

        String c = scan.nextLine();

        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s + c);

        scan.close();
    }
}