/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #24: PS4_Ex24_LargestDigitPair.java
 * 
 * This program determines the largest pair of digits
 * of a positive integer num.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class LargestDigitPair {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int num = scanner.nextInt();
    
    System.out.println("Largest pair of digits in " + num + " is " + largestDigitPair(num));
  }
  
  // Return the largest digit pairs in num
  // Pre-cond: num > 0
  public static int largestDigitPair(int num) {
    
    if (num < 100) {  // two digits or less
      return num;
    }
    
    // use a variable 'pair' to store result
    // so as to avoid repeated method calls
    int pair = largestDigitPair(num/100);
    
    if (pair > num%100) {
      return pair;
    } else {
      return num%100;
    }
  }
}