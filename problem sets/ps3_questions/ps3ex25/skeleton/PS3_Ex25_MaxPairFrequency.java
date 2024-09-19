/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #25: PS3_Ex25_MaxPairFrequency.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class MaxPairFrequency {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the matrix: ");
    int rows = sc.nextInt(), columns = sc.nextInt();
    int[][] mtx = new int[rows][columns];
    int[] pairs = new int[10];
    System.out.println("Enter elements row by row:");
    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns; column++) {
        mtx[row][column] = sc.nextInt();
      }
    }
    // vertical pairs
    for (int column = 0; column < columns; column++) {
      for (int row = 0; row < rows - 1; row++) {
        if (mtx[row][column] == mtx[row + 1][column]) {
          pairs[mtx[row][column]]++;
        }
      }
    }
    // horizontal pairs
    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns - 1; column++) {
        if (mtx[row][column] == mtx[row][column + 1]) {
          pairs[mtx[row][column]]++;
        }
      }
    }
    int maxPairs = 0;
    for (int i = 0; i < 10; i++) {
      if (maxPairs < pairs[i]) {
        maxPairs = pairs[i];
      }
    }
    System.out.println("Maximum number of pairs = " + maxPairs);
  }
}