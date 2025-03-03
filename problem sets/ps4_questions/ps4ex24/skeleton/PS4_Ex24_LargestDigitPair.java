/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #24: PS4_Ex24_LargestDigitPair.java
 * 
 * This program determines the largest pair of digits
 * of a positive integer num.
 * 
 * <Type your name here>
 */

import java.util.*;

class LargestDigitPair {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int integer = sc.nextInt();
    System.out.println("Largest pair of digits in " + " is " + largestDigitPair(integer));
  }

  // Return the largest digit pairs in num
  // Pre-cond: num > 0
  public static int largestDigitPair(int num) {
    if (num < 100) {
      return num;
    } else {
      return largestDigitPair(num / 100) > num % 100 ? largestDigitPair(num / 100) : num % 100;
    }
  }
}