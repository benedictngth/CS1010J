/*
 * CS1010J PA Practice Paper 4 Ex1
 * CommonElement.java
 * 
 * This program reports a common element in two sorted arrays
 * 
 * Written by Zhou Lifeng
 */

import java.util.*;

class CommonElement {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int[] arr1 = readArray("1st", sc);
    int[] arr2 = readArray("2nd", sc);
    
    int common = findCommon(arr1, arr2);
    
    System.out.println("Common element is: " + common);
    
  }
  
  // Return the common element in two arrays
  public static int findCommon(int[] arr1, int[] arr2) {
    
    int idx1 = 0, idx2 = 0;
    
    while (idx1 < arr1.length && idx2 < arr2.length) {
      if (arr1[idx1] == arr2[idx2]) {
        break;
      } else if (arr1[idx1] > arr2[idx2]) {
        idx1++;
      } else {
        idx2++;
      }
    }
    
    return arr1[idx1];  // common element found
  }
  
  // Read an array and return it
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
}