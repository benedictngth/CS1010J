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
 * <Type your name here>
 */

class Matrix {
  
  private int[][] mtx;
  
  // Constructor
  public Matrix(int[][] inMtx) {
    
  }
  
  // Reflect the matrix object across the x-axis
  public void reflectX() {
    
  }
  
  // Reflect the matrix object across the y-axis
  public void reflectY() {
    
  }
  
  // Rotate the matrix by certain degree clockwise
  public void rotate(int degree) {
    
  }
  
  // Add more member methods as appropriate
  
  
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