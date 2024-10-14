/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #23: PS3_Ex23_SquareMatrix.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class SquareMatrix {

  public static boolean diagonalMtx(int[][] mtx, int size) {
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size; column++) {
        if (column != row && mtx[row][column] != 0) { // outside main diagonal and element is 0
          return false;
        }
      }
    }
    return true;
  }

  public static boolean upperTriangularMtx(int[][] mtx, int size) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i > j && mtx[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the square matrix: ");
    int size = sc.nextInt();
    int[][] mtx = new int[size][size];
    System.out.println("Enter elements row by row:");
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size; column++) {
        mtx[row][column] = sc.nextInt();
      }
    }

    if (diagonalMtx(mtx, size)) {
      System.out.println("Given matrix is a diagonal matrix.");
      System.out.println("Given matrix is an upper triangular matrix.");
    } else {
      System.out.println("Given matrix is not a diagonal matrix.");
      if (upperTriangularMtx(mtx, size)) {
        System.out.println("Given matrix is an upper triangular matrix.");
      } else {
        System.out.println("Given matrix is not an upper triangular matrix.");
      }
    }

  }
}