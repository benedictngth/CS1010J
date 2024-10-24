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

    sc.close(); // just to avoid compilation warning from DrJava

    if (containsDuplicate(arr)) {
      System.out.println("Array contains duplicate integer");
    } else {
      System.out.println("Array doesn't contain duplicate integer");
    }

    rearrange(arr);

    System.out.println("Rearranged array: " + Arrays.toString(arr));
  }

  // <Write a short description of the method here>
  public static boolean containsDuplicate(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }
    return false;
  }

  // <Write a short description of the method here>\
  // create a copy and reconstruct the array according to the neg, zero and pos
  // integer rel pos
  public static void rearrange(int[] arr) {
    int negLength = 0, posLength = 0, zeroLength = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        negLength++;
      } else if (arr[i] == 0) {
        zeroLength++;
      } else {
        posLength++;
      }
    }
    int[] negDigit = new int[negLength];
    int[] zeroDigit = new int[zeroLength];
    int[] posDigit = new int[posLength];
    int negI = 0, zeroI = 0, posI = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        negDigit[negI] = arr[i];
        negI++;
      } else if (arr[i] == 0) {
        zeroDigit[zeroI] = arr[i];
        zeroI++;
      } else {
        posDigit[posI] = arr[i];
        posI++;
      }
    }
    int arrI = 0;
    // iterate through all 3 arrays to reconstruct array
    for (int i = 0; i < negDigit.length; i++) {
      arr[arrI] = negDigit[i];
      arrI++;
    }
    for (int i = 0; i < zeroDigit.length; i++) {
      arr[arrI] = zeroDigit[i];
      arrI++;
    }
    for (int i = 0; i < posDigit.length; i++) {
      arr[arrI] = posDigit[i];
      arrI++;
    }
  }
}