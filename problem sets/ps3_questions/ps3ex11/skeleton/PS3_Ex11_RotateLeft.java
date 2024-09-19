/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #11: PS3_Ex11_RotateLeft.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class RotateLeft {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int numElement = sc.nextInt();
    int[] array = new int[numElement];
    System.out.print("Enter " + " elements: ");
    for (int i = 0; i < numElement; i++) {
      array[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(rotateLeft(array)));
  }

  // <Write a short description of the method here>
  public static int[] rotateLeft(int[] arr) {
    int firstElement = arr[0];
    // shift every element forward by one
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = firstElement;
    return arr;
  }
}