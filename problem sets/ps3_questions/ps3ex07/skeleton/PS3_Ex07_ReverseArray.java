/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #07: PS3_Ex07_ReverseArray.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class ReverseArray {
  
  public static void main(String[] args) {
    
    int[] arr = readArray();
    
    reverseArray(arr);
    
    System.out.print("Reversed: ");
    // Refer to lecture 7 notes how to use Arrays.toString
    // to print out an array        
  }
  
  // Read and return an array
  public static int[] readArray() {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("How many values in the array? ");
    
    System.out.print("Enter " + " values: ");
    
  }
  
  // <Write a short description of the method here>
  public static void reverseArray(int[] arr) {
    
    // Can you avoid defining additional array?
  }
}