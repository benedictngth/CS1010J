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

class PlayChess {
  
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
    *            Write your code below this line            *
    *********************************************************/
  
  // <Write a short description of the method here>
  public static int gamesWin(double[][] scores, int p) {
    
    return 0;  // stub
  }
  
  // <Write a short description of the method here>
  public static double[] totalScore(double[][] scores) {
    double[] total = new double[10];  // stub
    return total;  // stub
  }
  
  // <Write a short description of the method here>
  public static boolean beat(double[][] scores, int a, int b) {
    
    return true;  // stub
  }
  
  // <Write a short description of the method here>
  public static boolean stronger(double[][] scores, int a, int b) {
    
    return true;  // stub
  }
  
  // <Write a short description of the method here>
  public static int comparePlayer(double[][] scores, int a, int b) {
    
    return 0;  // stub
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