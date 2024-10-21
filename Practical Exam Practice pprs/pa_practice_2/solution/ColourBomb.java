/*
 * CS1010J PA Practice Paper 2 Ex2
 * ColorBomb.java
 * 
 * This program checks if a Color Bomb can be created
 * after swapping a candy with one of its neighbours.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class ColorBomb {
  
  public static void main(String[] args) {
    
    int[][] board = readBoard();
    
    if ( canFormColorBomb(board) ) {
      System.out.println("At least one Color Bomb can be created after swapping");
    } else {
      System.out.println("No Color Bomb can be created after swapping");
    }
  }
  
  
  // Read and return a game board
  public static int[][] readBoard() {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of the board: ");
    int size = sc.nextInt();
    int[][] board = new int[size][size];
    
    System.out.println("Enter the board:");
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        board[row][col] = sc.nextInt();
      }
    }
    
    sc.close(); // to avoid compilation warning from DrJava
    
    return board;
  }
  
  
  // Swap the candy at row r1, column c1 with the candy at row r2, column c2
  public static void swap(int[][] board, int r1, int c1, int r2, int c2) {
    int swap = board[r1][c1];
    board[r1][c1] = board[r2][c2];
    board[r2][c2] = swap;
  }
  
  
  // Return true if the board contains five candies
  // of the same type in a row or column
  public static boolean hasStraightFive(int[][] board) {
    
    int size = board.length;
    
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        // check the same row
        if (col+4 < size &&
            board[row][col]==board[row][col+1] &&
            board[row][col]==board[row][col+2] &&
            board[row][col]==board[row][col+3] &&
            board[row][col]==board[row][col+4]) {
          return true;
        }
        // check the same column
        if (row+4 < size &&
            board[row][col]==board[row+1][col] &&
            board[row][col]==board[row+2][col] &&
            board[row][col]==board[row+3][col] &&
            board[row][col]==board[row+4][col]) {
          return true;
        }
      }
    }
    
    return false;
  }
  
  
  // Return true if a Color Bomb can be created after swapping a candy
  // with one of its adjacent (left, right, top or bottom) candies.
  public static boolean canFormColorBomb(int[][] board) {
    
    int size = board.length;
    
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if (row > 0) {
          swap(board, row, col, row-1, col);
          if ( hasStraightFive(board) ) {
            return true;
          }
          swap(board, row, col, row-1, col);  // swap back
        }
        
        if (col > 0) {
          swap(board, row, col, row, col-1);
          if ( hasStraightFive(board) ) {
            return true;
          }
          swap(board, row, col, row, col-1);  // swap back
        }
        
        if (row < size-1) {
          swap(board, row, col, row+1, col);
          if ( hasStraightFive(board) ) {
            return true;
          }
          swap(board, row, col, row+1, col);  // swap back
        }
        
        if (col < size-1) {
          swap(board, row, col, row, col+1);
          if ( hasStraightFive(board) ) {
            return true;
          }
          swap(board, row, col, row, col+1);  // swap back
        }
      }
    }
    
    return false;
  } 
}

/* sample run #1 inputs
 6
 1 2 1 1 4 5
 4 1 2 3 3 3
 3 1 3 3 1 2
 1 1 2 4 3 2
 4 3 3 3 2 3
 6 1 1 1 4 1
 */

/* sample run #2 inputs
 7
 1 5 2 3 1 4 4
 4 1 2 2 2 2 6
 3 1 2 3 1 2 5
 1 1 2 4 3 2 2
 3 3 3 4 2 3 5
 2 1 1 3 4 3 6
 1 1 1 5 1 1 1
 */