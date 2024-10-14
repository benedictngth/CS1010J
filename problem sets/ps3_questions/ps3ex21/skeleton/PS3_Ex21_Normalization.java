/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #21: PS3_Ex21_Normalization.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;
import java.text.*;

class Normalization {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the matrix: ");
    int row = sc.nextInt();
    int column = sc.nextInt();
    int[][] mtx = new int[row][column];
    System.out.println("Enter elements row by row:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        mtx[i][j] = sc.nextInt();
      }
    }
    int[] minMax = getMinMax(mtx, row, column);

    double[][] normMtx = normaliseMtx(mtx, minMax[0], minMax[1]);
    printMatrix(normMtx);
  }

  public static double[][] normaliseMtx(int[][] mtx, int min, int max) {
    double[][] normMtx = new double[mtx.length][mtx[0].length];
    int diff = max - min;
    for (int i = 0; i < normMtx.length; i++) {
      for (int j = 0; j < normMtx[0].length; j++) {
        normMtx[i][j] = ((double) mtx[i][j] - min) / (diff);
      }
    }

    return normMtx;
  }

  // Print out a matrix
  public static void printMatrix(double[][] mtx) {
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("Normalized matrix:");
    for (int i = 0; i < mtx.length; i++) {
      for (int j = 0; j < mtx[0].length; j++) {
        System.out.print(df.format(mtx[i][j]) + " ");
      }
      System.out.println();
    }
  }

  public static int[] getMinMax(int[][] mtx, int rows, int columns) {
    int max = mtx[0][0];
    int min = mtx[0][0];

    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns; column++) {
        max = mtx[row][column] > max ? mtx[row][column] : max;

        min = mtx[row][column] < min ? mtx[row][column] : min;
      }
    }
    int[] arr = { min, max };
    return arr;
  }
}