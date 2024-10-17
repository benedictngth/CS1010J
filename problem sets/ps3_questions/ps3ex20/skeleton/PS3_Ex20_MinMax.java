/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #20: PS3_Ex20_MinMax.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class MinMax {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
    int rows = sc.nextInt(), columns = sc.nextInt();
    int[][] grid = new int[rows][columns];
    System.out.println("Enter elements row by row:");
    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns; column++) {
        grid[row][column] = sc.nextInt();
      }
    }
    int[] arr = getMinMax(grid, rows, columns);
    System.out.println("Min = " + arr[0]);
    System.out.println("Max = " + arr[1]);
  }

  // Return the minimum and maximum values in a matrix
  public static int[] getMinMax(int[][] mtx, int rows, int columns) {
    int max = mtx[0][0];
    int min = mtx[0][0];

    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns; column++) {
        max = mtx[row][column] > max ? mtx[row][column] : max;
        // Math.min(mtx[row][column], min)
        // Math.max(mtx[row][column], max)
        min = mtx[row][column] < min ? mtx[row][column] : min;
      }
    }
    int[] arr = { min, max };
    return arr;
  }
}