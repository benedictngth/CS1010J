/*
 * CS1010J PA Practice Paper 3 Ex2
 * PlayChess.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

public class PlayChess {

  // Main method is given. Do NOT modify it!
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double[][] scores = readScores(sc);
    double[] total = totalScore(scores);
    printScores(total);

    // allow user to compare 3 times
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter ID of the two players to compare: ");
      int a = sc.nextInt();
      int b = sc.nextInt();

      int result = comparePlayer(scores, a, b);
      if (result > 0) {
        System.out.println("Player " + a + " is stronger than player " + b);
      } else if (result < 0) {
        System.out.println("Player " + b + " is stronger than player " + a);
      } else {
        System.out.println("Two players are as competent as each other");
      }
    }
  }

  // Read game scores into 2D array
  public static double[][] readScores(Scanner sc) {
    System.out.print("Enter the number of players: ");
    int n = sc.nextInt();
    double[][] scores = new double[n][n];
    System.out.print("Enter the scores: ");
    for (int row = 0; row < scores.length; row++) {
      for (int col = 0; col < scores[row].length; col++) {
        scores[row][col] = sc.nextDouble();
      }
    }
    return scores;
  }

  // Print players and their total scores
  public static void printScores(double[] total) {
    System.out.println("Player  Score");
    for (int i = 0; i < total.length; i++) {
      System.out.println("  " + i + "      " + total[i]);
    }
  }

  /**********************************************************
   * Write your code below this line *
   *********************************************************/

  // returns nimber of points
  public static double points(double[][] scores, int p) {
    double points = 0.0;
    // when players is white
    for (int i = 0; i < scores.length; i++) {
      if (i != p) {
        // player is white
        points += scores[p][i];
        // players is black; win is when opponent (white) is 0
        points += 1.0 - scores[i][p];
      }

    }
    return points;
  }

  // <Write a short description of the method here>
  public static double[] totalScore(double[][] scores) {
    double[] total = new double[scores.length];
    for (int i = 0; i < total.length; i++) {
      total[i] = points(scores, i);
    }
    return total;
  }

  // finds whether A beats B
  public static boolean beat(double[][] scores, int a, int b) {
    // WD, DW, WW
    if ((scores[a][b] == 1 && scores[b][a] == 0.5) || (scores[a][b] == 0.5 && scores[b][a] == 0)
        || scores[a][b] == 1 && scores[b][a] == 0) {
      return true;
    }
    return false;
  }

  // <Write a short description of the method here>
  public static boolean stronger(double[][] scores, int a, int b) {
    double[] total = totalScore(scores);
    if (total[a] > total[b]) {
      return true;
    } else if (beat(scores, a, b)) {
      return true;
    } else if (total[a] == total[b] && !beat(scores, a, b) && !beat(scores, b, a)
        && gameWin(scores, a) > gameWin(scores, b)) {
      return true;
    }
    return false;
  }

  public static int gameWin(double[][] scores, int p) {
    int gameWin = 0;
    // when players is white
    for (int i = 0; i < scores.length; i++) {
      // player is white
      if (scores[p][i] == 1) {
        gameWin++;
      }
      ;
      // players is black; win is when opponent (white) is 0
      if (scores[i][p] == 0) {
        gameWin++;
      }
    }
    return gameWin;
  }

  // <Write a short description of the method here>
  public static int comparePlayer(double[][] scores, int a, int b) {

    // check a stronger than b
    if (stronger(scores, a, b)) {
      return 1;
    } else if (stronger(scores, b, a)) {
      return -1;
    } else {
      return 0;
    } // both returns false

  }
}

/*
 * sample run #1 inputs
 * 5
 * 0 0.5 1 0 0.5
 * 0 0 0.5 0 0.5
 * 0.5 1 0 1 0
 * 1 1 0.5 0 0.5
 * 1 0.5 1 0.5 0
 */

/*
 * sample run #2 inputs
 * 4
 * 0 0.5 0.5 0.5
 * 0.5 0 0.5 0.5
 * 0.5 0.5 0 0.5
 * 0.5 0.5 0.5 0
 */