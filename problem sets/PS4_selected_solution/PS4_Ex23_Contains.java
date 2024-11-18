/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #23: PS4_Ex23_Contains.java
 * 
 * This program checks if digit 'k' appears in 'number'.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Contains {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();
    
    System.out.print("Enter a single digit integer k: ");
    int k = scanner.nextInt();
    
    if ( contains(number, k) ) {
      System.out.println(k + " appears in " + number);
    } else {
      System.out.println(k + " doesn't appear in " + number);
    }
  }
  
  // Check if k appears in any digit of number
  // Return true if so, or false otherwise
  // Pre-cond: number > 0, k < 10 && k >= 0
  public static boolean contains(int number, int k) {
    
    if (number == 0) {           // base case 1: not found
      return false;
    } else if (number%10 == k) { // base case 2: found
      return true;
    } else {
      return contains(number/10, k);
    }
  }
}