/*
 * CS1010J PA Practice Paper 3 Ex2
 * PlayChess.java
 * 
 * This program checks if a Colour Bomb can be created
 * after swapping a candy with one of its neighbours.
 * 
 * Written by Zhou Lifeng
 */

import java.util.*;

class PlayChess {
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
  
  // Return the number of games player p wins
  public static int gamesWin(double[][] scores, int p) {
    int win = 0;
    for (int i = 0; i < scores.length; i++) {
      if (i!= p && scores[p][i]==1) {
        win++;
      }
      if (i!= p && scores[i][p]==0) {
        win++;
      }
    }
    return win;
  }
  
  // Return the array 'total', which contains the total score of each player. 
  // total[a] will be the total score of player a
  public static double[] totalScore(double[][] scores) {
    double[] total = new double[scores.length];
    for (int row = 0; row < scores.length; row++) {
      for (int col = 0; col < scores[row].length; col++) {
        if (row != col) {
          total[row] += scores[row][col] + 1 - scores[col][row];
        }
      }
    }
    return total;
  }
  
  // Return true if player a beats player b, or false otherwise
  public static boolean beat(double[][] scores, int a, int b) {
    return scores[a][b] + 1 - scores[b][a] >= 1.5;
    // return (scores[a][b]==1 || scores[b][a]==0) && scores[a][b]>0 && scores[b][a]<1;
  }
  
  // Return true if player a is stronger than player b, or false otherwise
  public static boolean stronger(double[][] scores, int a, int b) {
    double[] total = totalScore(scores);
    
    if (total[a] > total[b]) {
      return true;
    }
    if (total[a] < total[b]) { // a is NOT stronger than b
      return false;
    }
    if (beat(scores, a, b)) { // a beats b
      return true;
    }
    if (beat(scores, b, a)) { // a is NOT stronger than b
      return false;
    }
    if (gamesWin(scores, a) > gamesWin(scores, b)) {
      return true;
    }
    return false;  // a is NOT stronger than b
  }
  
  // Compare two players a and b, to see who is stronger than the other
  public static int comparePlayer(double[][] scores, int a, int b) {
    if (stronger(scores, a, b)) {
      return 1;
    } else if (stronger(scores, b, a)) {
      return -1;
    } else {
      return 0;
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
}

/* sample run #1 inputs
 5
 0  0.5    1    0  0.5
 0    0  0.5    0  0.5
 0.5  1    0    1    0
 1    1  0.5    0  0.5
 1  0.5    1  0.5    0
 */

/* sample run #2 inputs
 4
 0   0.5 0.5 0.5
 0.5   0 0.5 0.5
 0.5 0.5   0 0.5
 0.5 0.5 0.5   0
 */