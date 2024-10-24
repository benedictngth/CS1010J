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

    if (canFormColourBomb(board)) {
      System.out.println("At least one Colour Bomb can be created after swapping");
    } else {
      System.out.println("No Colour Bomb can be created after swapping");
    }
  }

  // create board
  public static int[][] readBoard() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the board: ");
    int size = sc.nextInt();
    System.out.println("Enter the board:");
    int[][] board = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        board[i][j] = sc.nextInt();
      }
    }
    return board;
  }

  // swaps two elements of te board
  public static void swap(int[][] board, int r1, int c1, int r2, int c2) {
    int temp = board[r1][c1];
    board[r1][c1] = board[r2][c2];
    board[r2][c2] = temp;
  }

  // <Write a short description of the method here>
  public static boolean hasStraightFive(int[][] board) {
    int size = board.length;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        // check north direction
        // if (i - 4 >= 0 && checkDirectionVert(board, j, i - 4, i)) {
        // return true;
        // }
        // check south direction
        if (i + 4 < size && checkDirectionVert(board, j, i, i + 4)) {
          return true;
        }
        // check east direction
        else if (j + 4 < size && checkDirectionHori(board, i, j, j + 4)) {
          return true;
        }
        // check west direction
        // else if (j - 4 >= 0 && checkDirectionHori(board, i, j - 4, j)) {
        // return true;
        // }
      }
    }
    return false;
  }

  public static boolean checkDirectionVert(int[][] board, int j, int startI, int endI) {
    for (int i = startI; i < endI; i++) {
      if (board[i][j] != board[i + 1][j]) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkDirectionHori(int[][] board, int i, int startJ, int endJ) {
    for (int j = startJ; j < endJ; j++) {
      if (board[i][j] != board[i][j + 1]) {
        return false;
      }
    }
    return true;
  }

  // swap all the possible pos and check whether theres 5 in a row
  public static boolean canFormColourBomb(int[][] board) {
    int size = board.length;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        // use of if for all cases since check for all regardless whether conditional is
        // true or false
        // check north swap
        if (i - 1 >= 0) {
          swap(board, i, j, i - 1, j);
          if (hasStraightFive(board)) {
            return true;
          }
          swap(board, i - 1, j, i, j);
        }
        // check south swap
        if (i + 1 < size) {
          swap(board, i, j, i + 1, j);
          if (hasStraightFive(board)) {
            return true;
          }
          swap(board, i + 1, j, i, j);
        }
        // check east swap
        if (j + 1 < size) {
          swap(board, i, j, i, j + 1);
          if (hasStraightFive(board)) {
            return true;
          }
          swap(board, i, j + 1, i, j);
        }
        // west swap
        if (j - 1 >= 0) {
          swap(board, i, j, i, j - 1);
          if (hasStraightFive(board)) {
            return true;
          }
          swap(board, i, j - 1, i, j);
        }

      }
    }
    return false;
  }
}

/*
 * sample run #1 inputs
 * 6
 * 1 2 1 1 4 5
 * 4 1 2 3 3 3
 * 3 1 3 3 1 2
 * 1 1 2 4 3 2
 * 4 3 3 3 2 3
 * 6 1 1 1 4 1
 */

/*
 * sample run #2 inputs
 * 7
 * 1 5 2 3 1 4 4
 * 4 1 2 2 2 2 6
 * 3 1 2 3 1 2 5
 * 1 1 2 4 3 2 2
 * 3 3 3 4 2 3 5
 * 2 1 1 3 4 3 6
 * 1 1 1 5 1 1 1
 */