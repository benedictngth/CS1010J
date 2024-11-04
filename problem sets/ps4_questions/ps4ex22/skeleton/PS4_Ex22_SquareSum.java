/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #22: PS4_Ex22_SquareSum.java
 * 
 * This program reads a positive integer,
 * and returns the sum of all its digits in square.
 * 
 * <Type your name here>
 */

import java.util.*;

class SquareSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num = sc.nextInt();
    System.out.println("Square sum of all digits is " + squareSum(num));
  }

  // Calculate the square sum of all digits in a given number
  // Pre-cond: number > 0
  public static int squareSum(int num) {
    if (num == 0) {
      return 0;
    } else {
      int digit = num % 10;
      return squareSum(num / 10) + digit * digit;
    }
  }
}