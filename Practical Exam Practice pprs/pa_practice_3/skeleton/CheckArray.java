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

public class CheckArray {

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

  //
  public static boolean isAN(int num) {
    int oriNum = num; // stores a copy of original number
    int armStrong = 0;
    while (num != 0) {
      int digit = num % 10;
      armStrong += Math.pow(digit, 3);
      num /= 10;
    }
    return oriNum == armStrong; // stub
  }

  // number of armstrong numbers
  public static int countAN(int[] arr) {
    int numArmstrong = 0;
    for (int i = 0; i < arr.length; i++) {
      if (isAN(arr[i])) {
        numArmstrong++;
      }
    }
    return numArmstrong;
  }

  // finds second largest number
  public static int getSecondLargest(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int greaterThan = 0; // store number of greater numbers
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          greaterThan++;
        }
      }
      if (greaterThan == 1) { // if there is exactly one larger number
        return arr[i];
      }
    }
    return 0;
  }
}