/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #09: PS3_Ex09_Pair.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class Pair {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of distinct elements: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter " + " elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter key: ");
    int key = sc.nextInt();

    if (checkPair(arr, key)) {
      System.out.println("Exist");
    } else {
      System.out.println("Not exist");
    }

  }

  // <Write a short description of the method here>
  public static boolean checkPair(int[] arr, int key) {
    int left = 0;
    int right = arr.length - 1; // last element of list

    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == key) {
        return true; // key is found
      } else if (sum < key) {
        left++;
      } else { // sum > key
        right--;
      }
    }
    return false; // stub
  }
}