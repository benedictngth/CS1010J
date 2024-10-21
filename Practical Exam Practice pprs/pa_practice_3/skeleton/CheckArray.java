/*
 * CS1010J PA Practice Paper 3 Ex1
 * CheckArray.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

class CheckArray {
  
  // Main method is complete and you MUST NOT change it
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of elements: ");
    int size = sc.nextInt();
    
    int[] arr = new int[size];
    
    System.out.print("Enter elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Number of Armstrong number = " + countAN(arr));
    System.out.println("Second largest element = " + getSecondLargest(arr));
  }
    
  // <Write a short description of the method here>
  public static boolean isAN(int num) {

    return true;  // stub
  }
  
  // <Write a short description of the method here>
  public static int countAN(int[] arr) {

    return 0;  // stub
  }
  
  // <Write a short description of the method here>
  public static int getSecondLargest(int[] arr) {
    
    return 0;  // stub
  }
}