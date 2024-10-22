/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #20: PS4_Ex20_Conway.java
 * 
 * This program prints conway sequence a(n).
 * 
 * <Type your name here>
 */

import java.util.*;

class Conway {
  
  public static void main(String[] args) {  // complete
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter n (n > 0): ");
    int n = scanner.nextInt();
    
    System.out.println("a(n) = " + a(n));
  }
  
  // Compute a(n) according to the recursive formula
  // Pre-cond: n > 0
  public static int a(int n) {
    
    return 0;  // stub
  }
}