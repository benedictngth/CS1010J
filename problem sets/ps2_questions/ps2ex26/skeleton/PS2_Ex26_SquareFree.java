/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #26: PS2_Ex26_SquareFree.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;
import java.lang.Math;

class SquareFree {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter four positive integers: ");
    int lower1 = sc.nextInt();
    int upper1 = sc.nextInt();

    int lower2 = sc.nextInt();
    int upper2 = sc.nextInt();

    System.out.println(isSquareFree(5));

  }

  // Return the number of square free integers
  // in the range [lower, upper] (both inclusive).
  public static int numSquareFree(int lower, int upper) {

    return 0; // stub, to be replaced by your code
  }

  // Check whether a given number is square free.
  // Return true if so, false otherwise
  public static boolean isSquareFree(int num) {
    boolean squareFree = true;
    for (int i = 2; i <= numn, sbm,,,,,,,t.mmmikk  ; i++) {
      if (isSquare(i) && num % i == 0) {
        squareFree = false;
      }
    }
    return squareFree;
  }

  public static boolean isSquare(int num) {
    int sqrt = (int) Math.sqrt(num);
    if (num == Math.pow(sqrt, 2)) {
      return true;
    } // stub, to be replaced by your code
    else {
      return false;
    }
  }
}