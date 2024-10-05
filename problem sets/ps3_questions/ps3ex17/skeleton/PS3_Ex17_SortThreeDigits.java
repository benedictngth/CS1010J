/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #17: PS3_Ex17_SortThreeDigits.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class SortThreeDigits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int size = sc.nextInt();
    System.out.print("Enter " + " elements: ");
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sortArray(arr);

    System.out.print("Sorted array: " + Arrays.toString(arr));

  }

  // Bubble sort the given array according to the first 3 digits
  public static void sortArray(int[] arr) {
    int lastIndex = arr.length - 1;
    while (lastIndex > 0) {
      int lastExchangeIndex = 0;
      // only bubbling the unsorted portion of the array
      for (int i = 0; i < lastIndex; i++) {
        if (firstThree(arr[i]) > firstThree(arr[i + 1])) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          lastExchangeIndex = i; // place of last swap
        }
      }
      lastIndex = lastExchangeIndex;
    }
  }

  // Compare num1 with num2 according to their first 3 digits.
  // Return true if num1 is bigger, or false otherwise
  public static int firstThree(int num) {
    while (num > 999) {
      num /= 10;
    }
    return num; // stub
  }
}