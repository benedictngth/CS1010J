/*
 * CS1010J PA Practice Paper 4 Ex2
 * Queens.java
 * 
 * This program checks if queens on a chess board are placed in
 * a good arrangement or bad arrangement and further test if two
 * more queens can be placed on a well arranged board.
 * 
 * Written by Zhou Lifeng
 */

import java.util.*;

class Queens {
  
  public static void main(String[] args) {
    
    int[][] board = readBoard();
    
    if ( isGoodArrangement(board) ) {
      System.out.println("Good arrangement");
      if ( twoMoreQueens(board) ) {
        System.out.println("Two more queens can be placed on the chess board");
      } else {
        System.out.println("Cannot place two more queens on the chess board");
      }
    } else {
      System.out.println("Bad arrangement");
    }
  }
  
  // Read a board of size n*n and return it
  public static int[][] readBoard() {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of the board: ");
    int n = sc.nextInt();
    
    int[][] board = new int[n][n];
    
    System.out.println("Enter the " + n + "*" + n + " board:");
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        board[row][col] = sc.nextInt();
      }
    }
    
    sc.close();  // just to avoid compilation warning from DrJava
    
    return board;
  }
  
  // Check if a queen on square [r, c] can attack any other queen
  // Return true if so, or false otherwise
  public static boolean canAttack(int[][] board, int r, int c) {
    
    int size = board.length;
    //System.out.println("Check queen on [" + r + ", " + c + "]");
    
    // check the same row
    for (int col = 0; col < size; col++) {
      if (col != c && board[r][col] == 1) {
        //System.out.println("\tWhen checking row, detect attack at[" + r + ", " + col + "]");
        return true;
      }
    }
    
    // check the same column
    for (int row = 0; row < size; row++) {
      if (row != r && board[row][c] == 1) {
        //System.out.println("\tWhen checking row, detect attack at[" + row + ", " + c + "]");
        return true;
      }
    }
    
    // check diagonal down
    int row = r+1, col = c+1;
    while (row < size && col < size) {
      if (board[row][col] == 1) {
        //System.out.println("\tWhen checking diagonal, detect attack at[" + row + ", " + col + "]");
        return true;
      }
      row++;
      col++;
    }
    
    // check diagonal up
    row = r-1;
    col = c-1;
    while (row >= 0 && col >= 0) {
      if (board[row][col] == 1) {
        //System.out.println("\tWhen checking diagonal, detect attack at[" + row + ", " + col + "]");
        return true;
      }
      row--;
      col--;
    }
    
    // check anti-diagonal down
    row = r+1;
    col = c-1;
    while (row < size && col >= 0) {
      if (board[row][col] == 1) {
        //System.out.println("\tWhen checking anti-diagonal, detect attack at[" + row + ", " + col + "]");
        return true;
      }
      row++;
      col--;
    }
    
    // check anti-diagonal up
    row = r-1;
    col = c+1;
    while (row >= 0 && col < size) {
      if (board[row][col] == 1) {
        //System.out.println("\tWhen checking anti-diagonal, detect attack at[" + row + ", " + col + "]");
        return true;
      }
      row--;
      col++;
    }
    
    return false;
  }
  
  // Check if a given board is a good arrangement
  // Return true if so, or false otherwise
  public static boolean isGoodArrangement(int[][] board) {
    
    int size = board.length;
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if ( board[row][col] == 1 && canAttack(board, row, col) ) {
          return false;
        }
      }
    }
    
    return true;
  }
  
  // Check if two more queens can be placed on the board and
  // still results in a good arrangement.
  // Return true if so, or false otherwise
  public static boolean twoMoreQueens(int[][] board) {
    
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[0].length; col++) {
        if ( board[row][col] == 0 && !canAttack(board, row, col) ) {
          board[row][col] = 1;
          for (int m = 0; m < board.length; m++) {
            for (int n = 0; n < board[0].length; n++) {
              if ( board[m][n] == 0 && !canAttack(board, m, n) ) {
                board[row][col] = 0; // find it! (optional to) restore the change
                return true;
              }
            }
          }
          board[row][col] = 0; // not a good arrangement, restore the change
        }
      }
    }
    
    return false;
  }
}