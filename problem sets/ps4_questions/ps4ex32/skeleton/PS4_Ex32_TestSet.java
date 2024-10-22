/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #32: PS4_Ex32_Set.java
 * 
 * This program reads two set of integers and checks
 * if these two sets are identical.
 * 
 * <Type your name here>
 */

import java.util.*;

class TestSet {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    Set set1 = readSet(scanner, "Set 1: ");
    Set set2 = readSet(scanner, "Set 2: ");
    
    System.out.println("Set 1 has " +  " element(s): " );
    System.out.println("Set 2 has " +  " element(s): " );
    
    
    System.out.println("Two sets are identical");
    
    System.out.println("Two sets have different values");
  }
  
  // Return a set of data
  public static Set readSet(Scanner scanner, String index) {
    
    System.out.print("Enter the number of elements in " + index);
    
    Set set = new Set(1);  // stub
    System.out.print("Enter " +  " element(s): ");
    
    return set;
  }
}