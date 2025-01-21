/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #31: PS4_Ex31_Matrix.java
 * 
 * The Matrix class keeps a square matrx 'mtx' as its attribute,
 * and contains methods to reflect it or roate it.
 *   - rotate(deg): to rotate the matrix clockwise
 *   - reflectX() : to reflect the matrix across the x-axis
 *   - reflectY() : to reflect the matrix across the y-axis
 *   - toString() : to return String representation of the matrix
 * 
 * Author: Zhou Lifeng
 */

import java.util.Arrays;

class Matrix {
  
  private int[][] mtx;
  
  // Constructor
  public Matrix(int[][] inMtx) {
    
    int len = inMtx.length;
    mtx = new int[len][len];
    
    // just be a bit defensive to create
    // my own matrix of the same values
    for (int row = 0; row < len; row++) {
      // copyOf method returns a new (1D) array of the same values
      // its use is non-examinable.
      mtx[row] = Arrays.copyOf(inMtx[row], len);
    }
  }
  
  // Reflect the matrix object across the x-axis
  public void reflectX() {
    
    for (int row = 0; row < mtx.length/2; row++) {
      for (int col = 0; col < mtx.length; col++) {
        int swap = mtx[row][col];
        mtx[row][col] = mtx[mtx.length-row-1][col];
        mtx[mtx.length-row-1][col] = swap;
      }
    }
  }
  
  // Reflect the matrix object across the y-axis
  public void reflectY() {
    
    for (int row = 0; row < mtx.length; row++) {
      for (int col = 0; col < mtx.length/2; col++) {
        int swap = mtx[row][col];
        mtx[row][col] = mtx[row][mtx.length-col-1];
        mtx[row][mtx.length-col-1] = swap;
      }
    }
  }
  
  // Rotate the matrix by certain degree clockwise
  public void rotate(int degree) {
    for (int round = 0; round < degree/90; round++) {
      rotate90();
    }
  }
  
  // Rotate the matrix by 90 degree clockwise
  public void rotate90() {
    
    int[][] backup = new int[mtx.length][mtx.length];
    for (int row = 0; row < mtx.length; row++) {
      backup[row] = java.util.Arrays.copyOf(mtx[row], mtx.length);
    }
    
    for (int row = 0; row < mtx.length; row++) {
      for (int col = 0; col < mtx.length; col++) {
        mtx[row][col] = backup[mtx.length-col-1][row];
      }
    }
  }
  
  // Return string representation of values row by row
  public String toString() {
    
    String out = "";
    for (int row = 0; row < mtx.length; row++) {
      for (int col = 0; col < mtx[row].length; col++) {
        out += mtx[row][col] + " ";
      }
      out += "\n";
    }
    
    return out;
  }
}