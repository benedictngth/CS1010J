/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #14: PS3_Ex14_SetContainment.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class SetContainment {

  public static void main(String[] args) {

    // Note: CodeCrunch only accepts one Scanner object!
    // So create 'sc' here and pass it to scanArray method twice
    Scanner sc = new Scanner(System.in);

    System.out.print("Size of 1st array? ");
    int sizeA = sc.nextInt();
    int[] arrA = scanArray(sizeA, sc);

    System.out.print("Size of 2nd array? ");
    int sizeB = sc.nextInt();
    int[] arrB = scanArray(sizeB, sc);

    if (isSubset(arrA, arrB)) {
      System.out.println("1st array is a subset of 2nd array");
    } else {
      System.out.println("1st array is not a subset of 2nd array");
    }

  }

  // Read elements into an array and return it
  public static int[] scanArray(int size, Scanner sc) {
    System.out.print("Enter " + size + " values: ");
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    return array;
  }

  public static boolean isSubset(int[] arrA, int[] arrB) {
    // loops through all the elements
    for (int posA = 0; posA < arrA.length; posA++) {

      boolean found = false;
      // for loop iterates while arrA element does not exist within B
      for (int posB = 0; posB < arrB.length && !found; posB++) {
        if (arrA[posA] == arrB[posB]) {
          found = true;
        }
      }
      // breaks the function upon element not being in arrB
      if (!found) {
        return false;
      }
    }
    // all elements exist in arrB
    return true;
  }
}