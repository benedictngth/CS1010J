/*
 * CS1010J PA Practice Paper 4 Ex2
 * Queens.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

class Queens {
  
  // Main method is complete and you MUST NOT change it
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
  
  /**********************************************************
    *            Write your code below this line            *
    *********************************************************/
  
  // <Write a short description of the method here>
  public static int[][] readBoard() {
    
    // create scanner, create board, read values and return board
    
    System.out.print("Enter the size of the board: ");
    
    
    System.out.println("Enter the " + "*" + " board:");
    
  }
  
  
  // <Write a short description of the method here>
  public static boolean canAttack(int[][] board, int r, int c) {
    
    
    return false;  // stub
  }
  
  
  // <Write a short description of the method here>
  public static boolean isGoodArrangement(int[][] board) {
    
    
    return false;  // stub
  }
  
  
  // <Write a short description of the method here>
  public static boolean twoMoreQueens(int[][] board) {
    
    
    return false;  // stub
  }
}
/*
 // input for sample run #1
 7
 0 0 0 1 0 0 0
 1 0 0 0 0 0 0
 0 0 0 0 0 0 0
 0 0 0 0 0 0 0
 0 1 0 0 0 0 0
 0 0 0 0 0 0 1
 0 0 0 0 0 0 0
 
 // input for sample run #2
 4
 1 0 0 0
 0 0 0 1
 0 0 0 0
 0 0 0 0
 
 // input for sample run #3
 6
 0 0 0 1 0 0
 0 1 0 0 0 0
 0 0 0 0 1 0
 0 0 0 0 0 1
 0 0 0 0 0 0
 0 0 1 0 0 0
 */