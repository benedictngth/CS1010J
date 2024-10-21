/*
 * CS1010J PA Practice Paper 4 Ex1
 * CommonElement.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

class CommonElement {
  
  // Main method is complete and you MUST NOT change it
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int[] arr1 = readArray("1st", sc);
    int[] arr2 = readArray("2nd", sc);
    
    int common = findCommon(arr1, arr2);
    
    System.out.println("Common element is: " + common);
    
  }
  
  // Read an array and return it - complete and NOT to be changed
  public static int[] readArray(String seq, Scanner sc) {
    
    System.out.print("Enter the number of elements in " + seq + " array: ");
    int num = sc.nextInt();
    int[] arr = new int[num];
    
    System.out.print("Enter elements: ");
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    
    return arr;
  }
  
  /**********************************************************
    *            Write your code below this line            *
    *********************************************************/
  
  // <Write a short description of the method here>
  public static int findCommon(int[] arr1, int[] arr2) {
    
    
    return 0;  // stub
  }
}