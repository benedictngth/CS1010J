/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #27: PS3_Ex27_Contour.java
 * 
 * <Fill in a short description of this program>
 * 
 * <Replace this with your name>
 */

import java.util.*;

class Contour {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of rows and cols: ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    
    int[][] map = new int[row][col];
    
    System.out.println("Enter the data:");
    scanArray(map, sc);
    
    int[][] peaksandvalleys = new int[row][col];
    int[] countPeakValley = new int[2];
    
    System.out.println("Number of peaks = ");
    System.out.println("Number of valleys =");
    System.out.println("Peaks and Valleys map");
    
    int[][] hike = new int[row][col];
    
    System.out.println("Hiking map");
  }
  
  // <Write a short description of the method here>
  public static void getPeaksValleys(int[][] map, int[][] peaksandvalleys, int[] countPeakValley) {
    
    
  }
  
  // <Write a short description of the method here>
  public static void getHikeTrail(int[][] map, int[][] hike) {
    
    
  }
  
  // Provided method; don't modify it
  // Read in the data for the contour map
  public static void scanArray(int[][] array, Scanner sc) {
    int numRows = array.length, numCols = array[0].length;
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        array[row][col] = sc.nextInt();
      }
    }
  }
  
  // Provided method; don't modify it
  // Print the 2D map
  public static void printArray(int[][] array) {
    int numRows = array.length, numCols = array[0].length;
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        System.out.print(array[row][col] + " ");
      }
      System.out.println();
    }
  }
}