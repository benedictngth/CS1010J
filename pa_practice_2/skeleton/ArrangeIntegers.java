/*
 * CS1010J PA Practice Paper 2 Ex1
 * ArrangeIntegers.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

class ArrangeIntegers {
  
  /*******************************************************
    * Main method is complete and you MUST NOT change it *
    *******************************************************/
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of integers: ");
    int size = sc.nextInt();
    
    int[] arr = new int[size];
    
    System.out.print("Enter " + size + " integers: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    sc.close();  // just to avoid compilation warning from DrJava
    
    if ( containsDuplicate(arr) ) {
      System.out.println("Array contains duplicate integer");
    } else {
      System.out.println("Array doesn't contain duplicate integer");
    }
    
    rearrange(arr);
    
    System.out.println("Rearranged array: " + Arrays.toString(arr));
  }
  
  
  // <Write a short description of the method here>
  public static boolean containsDuplicate(int[] arr) {
    
    return false; // stub
  }
  
  
  // <Write a short description of the method here>
  public static void rearrange(int[] arr) {
    
  }
}