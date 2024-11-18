/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #27: PS4_Ex27_OddDigitSum.java
 * 
 * This program checks if the sum of all digits of
 * a given number is odd.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class OddDigitSum {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();
    
    if ( isDigitSumOdd(number) ) {
      System.out.println("Sum of digits for " + number + " is odd");
    } else {
      System.out.println("Sum of digits for " + number + " is even");
    }
  }
  
  // Return ture if the sum of all digits is odd, or false otherwise.
  // Pre-cond: num > 0
  public static boolean isDigitSumOdd(int num) {
    
    if (num < 10) {  // single digit
      return num%2 == 1;
    }
    
    int digit = num % 10;
    
    if (digit%2 == 0) {  // this digit is even
      // even + odd = odd; even + even = even -> 'even' digit won't affect result
      return isDigitSumOdd(num/10);
    } else {  // this digit is odd
      // odd + odd = even; odd + even = odd -> 'odd' digit turns over result
      return !isDigitSumOdd(num/10);
    }
  }
}