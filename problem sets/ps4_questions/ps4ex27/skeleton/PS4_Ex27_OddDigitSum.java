/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #27: PS4_Ex27_OddDigitSum.java
 * 
 * This program checks if the sum of all digits of
 * a given number is odd.
 * 
 * <Type your name here>
 */

import java.util.*;

class OddDigitSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();

    if (isDigitSumOdd(num)) {
      System.out.println("Sum of digits for " + " is odd");
    } else {
      System.out.println("Sum of digits for " + num + " is even");
    }

  }

  // Return ture if the sum of all digits is odd, or false otherwise.
  // Pre-cond: num > 0
  public static boolean isDigitSumOdd(int num) {
    // one digit
    if (num < 10) {
      return num % 2 == 1;
    } else {
      // even + odd = odd (T)
      // odd + odd = even (F)
      // even + even = even (F)

      return isDigitSumOdd(num % 10) == !isDigitSumOdd(num / 10);
    }

  }
}