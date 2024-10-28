/*
 * CS1010J PA Practice Paper 3 Ex1
 * CheckArray.java
 * 
 * This program counts the number of Armstrong numbers
 * in the given array and also reports the second
 * largest integer in the given array.
 * 
 * Written by Zhou Lifeng
 */

import java.util.*;

class CheckArray_solution {

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

  // Return true if num is a Armstrong number, or false otherwise.
  public static boolean isAN(int num) {
    int sum = 0, toProcess = num;
    while (toProcess > 0) {
      int digit = toProcess % 10;
      sum += digit * digit * digit;
      toProcess /= 10;
    }
    return sum == num;
  }

  // Return the number of Armstrong numbers in the given array.
  public static int countAN(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (isAN(arr[i])) {
        count++;
      }
    }
    return count;
  }

  // Return the second largest integer in the given array.
  public static int getSecondLargest(int[] arr) {

    int max = Math.max(arr[0], arr[1]);
    int secondMax = Math.min(arr[0], arr[1]);

    for (int i = 2; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }

    return secondMax;
  }
}