/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #27: PS3_Ex27_Contour.java
 * 
 * <Fill in a short description of this program>
 * 
 * <Replace this with your name>
 */

import java.util.*;
import java.lang.*;

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
    int[] countPeakValley = getPeaksValleys(map, peaksandvalleys);

    System.out.println("Number of peaks = " + countPeakValley[0]);
    System.out.println("Number of valleys = " + countPeakValley[1]);
    System.out.println("Peaks and Valleys map");
    printArray(peaksandvalleys);
    boolean[][] hike = new boolean[row][col];
    getHikeTrail(0, 0, map, hike);
    System.out.println("Hiking map");
    printBoolArray(hike);
  }

  // <Write a short description of the method here>
  public static int[] getPeaksValleys(int[][] map, int[][] peaksandvalleys) {
    int rowLength = map.length, columnLength = map[0].length;
    int numValley = 0, numPeak = 0;
    for (int row = 1; row < rowLength - 1; row++) {
      for (int column = 1; column < columnLength - 1; column++) {
        if (getPeakValue(map, row, column)) {
          numPeak++;
          peaksandvalleys[row][column] = 1;
        }
        if (getValleyValue(map, row, column)) {
          numValley++;
          peaksandvalleys[row][column] = 2;
        }
      }
    }
    return new int[] { numPeak, numValley };
  }

  public static boolean getPeakValue(int[][] map, int row, int column) {
    int pt = map[row][column];

    for (int rowIncrement = -1; rowIncrement < 2; rowIncrement++) {
      for (int columnIncrement = -1; columnIncrement < 2; columnIncrement++) {
        if (!(rowIncrement == 0 && columnIncrement == 0)) {
          int diff = map[row + rowIncrement][column + columnIncrement] - pt;
          if (diff >= 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  public static boolean getValleyValue(int[][] map, int row, int column) {
    int pt = map[row][column];

    for (int rowIncrement = -1; rowIncrement < 2; rowIncrement++) {
      for (int columnIncrement = -1; columnIncrement < 2; columnIncrement++) {
        if (!(rowIncrement == 0 && columnIncrement == 0)) {
          int diff = map[row + rowIncrement][column + columnIncrement] - pt;
          if (diff <= 0) {
            return false;
          }
        }
      }
    }
    // System.out.println(pt);
    return true;
  }

  // <Write a short description of the method here>
  public static void getHikeTrail(int i, int j, int[][] map, boolean[][] hike) {
    // visited notde
    // System.out.println(i + " " + j);
    if (hike[i][j]) {
      return;
    }
    // System.out.println(i + " " + j);
    hike[i][j] = true; // visit node
    // printBoolArray(hike);
    // account for the edges pts
    int startRowIncrement = i == 0 ? 0 : -1;
    int endRowIncrement = i == map.length - 1 ? 0 : 1;
    int startColumnIncrement = j == 0 ? 0 : -1;
    int endColumnIncretment = j == map[0].length - 1 ? 0 : 1;
    // System.out.println(startRowIncrement + " " + endRowIncrement + " " +
    // startColumnIncrement + " " + endColumnIncretment);

    // check north south direction
    for (int rowIncrement = startRowIncrement; rowIncrement < endRowIncrement + 1; rowIncrement++) {
      if (rowIncrement != 0) {
        int diff = Math.abs(map[i + rowIncrement][j] - map[i][j]);
        // System.out.println(diff);
        if (diff <= 2) {
          getHikeTrail(i + rowIncrement, j, map, hike);
        }
      }
    }
    // check east west direction
    for (int columnIncrement = startColumnIncrement; columnIncrement < endColumnIncretment + 1; columnIncrement++) {
      if (columnIncrement != 0) {
        int diff = Math.abs(map[i][j + columnIncrement] - map[i][j]);
        // System.out.println(diff);
        if (diff <= 2) {
          getHikeTrail(i, j + columnIncrement, map, hike);
        }
      }
    }

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

  public static void printBoolArray(boolean[][] array) {
    int numRows = array.length, numCols = array[0].length;
    for (int row = 0; row < numRows; row++) {
      for (int col = 0; col < numCols; col++) {
        System.out.print(array[row][col] ? "1 " : "0 ");
      }
      System.out.println();
    }
  }
}