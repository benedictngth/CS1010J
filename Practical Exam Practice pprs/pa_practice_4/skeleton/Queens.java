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

    if (isGoodArrangement(board)) {
      System.out.println("Good arrangement");
      if (twoMoreQueens(board)) {
        System.out.println("Two more queens can be placed on the chess board");
      } else {
        System.out.println("Cannot place two more queens on the chess board");
      }
    } else {
      System.out.println("Bad arrangement");
    }
  }

  /**********************************************************
   * Write your code below this line *
   *********************************************************/

  // reads user input of board and return board of 2d array
  public static int[][] readBoard() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the board: ");
    int size = sc.nextInt();
    int[][] board = new int[size][size];
    System.out.println("Enter the " + size + "*" + size + " board:");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        board[i][j] = sc.nextInt();
      }
    }
    return board;
  }

  // if the queen in row r and column c has line of sight to other queens
  public static boolean canAttack(int[][] board, int r, int c) {
    // check nouth-south
    for (int i = 0; i < board.length; i++) {
      if (i != r && board[i][c] == 1) {
        return true;
      }
    }
    // check east-west direction
    for (int j = 0; j < board.length; j++) {
      if (j != c && board[r][j] == 1) {
        return true;
      }
    }
    // check south-east diagonal
    for (int row = r + 1, col = c + 1; row < board.length && col < board.length; row++, col++) {
      if (board[row][col] == 1) {
        return true;
      }
    }
    // check north-west diagonal
    for (int row = r - 1, col = c - 1; row >= 0 && col >= 0; row--, col--) {
      if (board[row][col] == 1) {
        return true;
      }
    }
    // check south=west diagonal
    for (int row = r + 1, col = c - 1; row < board.length && col >= 0; row++, col--) {
      if (board[row][col] == 1) {
        return true;
      }
    }
    // check north east diagonal
    for (int row = r - 1, col = c + 1; row >= 0 && col < board.length; row--, col++) {
      if (board[row][col] == 1) {
        return true;
      }
    }

    return false; // stub
  }

  // //check for all quesns on the board whether they can attack each other
  public static boolean isGoodArrangement(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 1 && canAttack(board, i, j)) {
          return false;
        }
      }
    }

    return true;
  }

  // find whether addtional queens can be placed while maintaing good arrangement
  public static boolean twoMoreQueens(int[][] board) {
    // attempt to find a good arrangement for 1 queen first
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 0) {
          board[i][j] = 1;
          if (isGoodArrangement(board)) {
            for (int r = 0; r < board.length; r++) {
              for (int c = 0; c < board.length; c++) {
                if (board[r][c] == 0) {
                  board[r][c] = 1;
                  if (isGoodArrangement(board)) {
                    return true;
                  } else {
                    board[r][c] = 0; // reset back queen
                  }
                }
              }
            }
          } else {
            board[i][j] = 0; // resets back queen
          }
        }
      }
    }
    return false; // stub
  }
}
/*
 * // input for sample run #1
 * 7
 * 0 0 0 1 0 0 0
 * 1 0 0 0 0 0 0
 * 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0
 * 0 1 0 0 0 0 0
 * 0 0 0 0 0 0 1
 * 0 0 0 0 0 0 0
 * 
 * // input for sample run #2
 * 4
 * 1 0 0 0
 * 0 0 0 1
 * 0 0 0 0
 * 0 0 0 0
 * 
 * // input for sample run #3
 * 6
 * 0 0 0 1 0 0
 * 0 1 0 0 0 0
 * 0 0 0 0 1 0
 * 0 0 0 0 0 1
 * 0 0 0 0 0 0
 * 0 0 1 0 0 0
 */