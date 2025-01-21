/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #31: PS4_Ex31_Transform.java
 * 
 * This program creates a Matrix object, reflects it across the x- or y- axis,
 * or rotates it by d degree clockwise where d can be 90, 180, or 270.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Transform {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the size of the square matrix: ");
    int size = scanner.nextInt();
    
    int[][] inMtx = new int[size][size];
    
    System.out.println("Enter elements row by row:");
    
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        inMtx[row][col] = scanner.nextInt();
      }
    }
    
    Matrix mtx = new Matrix(inMtx);
    
    System.out.print("Enter the number of commands: ");
    int num = scanner.nextInt();
    
    for (int i = 0; i < num; i++) {
      System.out.print("Enter command: ");
      String cmd = scanner.next();
      
      if ( cmd.equals("Rotate") ) {
        int degree = scanner.nextInt();
        mtx.rotate(degree);
      } else if ( cmd.equals("Reflect") ) {
        String direction = scanner.next();
        if (direction.equals("x")) {
          mtx.reflectX();
        } else {
          mtx.reflectY();
        }
      }
    }
    
    System.out.print(mtx);
  }
}