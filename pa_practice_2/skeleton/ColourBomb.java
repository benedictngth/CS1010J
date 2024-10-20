/*
 * CS1010J PA Practice Paper 2 Ex2
 * ColourBomb.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

class ColourBomb {
  
  public static void main(String[] args) {
    
    /*******************************************************
      * Main method is complete and you MUST NOT change it *
      *******************************************************/    
    int[][] board = readBoard();
    
    if ( canFormColourBomb(board) ) {
      System.out.println("At least one Colour Bomb can be created after swapping");
    } else {
      System.out.println("No Colour Bomb can be created after swapping");
    }
  }
  
  
  // <Write a short description of the method here>
  public static int[][] readBoard() {

    // create a scanner; create a board; read ints into board; return board
    
    System.out.print("Enter the size of the board: ");
    System.out.println("Enter the board:");
    

  }
  
  
  // <Write a short description of the method here>
  public static void swap(int[][] board, int r1, int c1, int r2, int c2) {
    
  }
  
  
  // <Write a short description of the method here>
  public static boolean hasStraightFive(int[][] board) {
    
    return false; // stub
  }
  
  
  // <Write a short description of the method here>
  public static boolean canFormColourBomb(int[][] board) {
    
    return false; // stub
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