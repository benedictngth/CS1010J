/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #19: PS4_Ex19_RecursiveSum.java
 * 
 * This program prints f(x) whose value
 * is given by the recursive formula.
 * 
 * <Type your name here>
 */

import java.util.*;

class RecursiveSum {
  
  public static void main(String[] args) {  // complete
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter x (x >= 0): ");
    int x = scanner.nextInt();
    
    System.out.println("f(x) = " + f(x));
  }
  
  // Calculate f(x) according to recursive formula
  // Pre-cond: x >= 0
  public static int f(int x) {
    
    return 0;  // stub
  }
}