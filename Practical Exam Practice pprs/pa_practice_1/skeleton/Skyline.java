/*
 * CS1010J PA Practice Paper 1 Ex2
 * Skyline.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

class Skyline {

  public static void main(String[] args) {
    /*******************************************************
     * main method is complete and you MUST NOT change it *
     *******************************************************/
    int[][] map = readMap();
    int[] heights = checkHeights(map);
    printSkyline(heights);
  }

  /******* Write your code below this line *******/

  // let user input map
  public static int[][] readMap() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of map: ");
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int[][] map = new int[rows][columns]; // create new map
    System.out.println("Enter " + rows + "*" + columns + " map: ");
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < columns; col++) {
        map[row][col] = sc.nextInt();
      }
    }
    return map;
  }

  // return one-d array of max height of each column
  public static int[] checkHeights(int[][] map) {

    int[] heights = new int[map[0].length]; // length of num of columns
    for (int col = 0; col < map[0].length; col++) {
      int maxHeight = 0;
      for (int row = 0; row < map.length; row++) {
        if (map[row][col] > maxHeight) {
          maxHeight = map[row][col];
        }
      }
      heights[col] = maxHeight;
    }
    return heights;
  }

  // find tallest building for array
  public static int findMaximumHeight(int[] heights) {
    int maxHeight = 0;
    for (int i = 0; i < heights.length; i++) {
      if (heights[i] > maxHeight) {
        maxHeight = heights[i];
      }
    }
    return maxHeight;
  }

  // Print skyline of the map
  public static void printSkyline(int[] heights) {
    int maxHeight = findMaximumHeight(heights);
    int[][] skyline = new int[maxHeight / 10][heights.length];
    for (int i = 0; i < heights.length; i++) {
      int length = heights[i] / 10; // length of building in col
      for (int j = 0; j < length; j++) {
        skyline[(maxHeight / 10 - 1) - j][i] = 1; // last pos up for height
      }
    }

    for (int row = 0; row < skyline.length; row++) {
      for (int col = 0; col < skyline[0].length; col++) {
        if (skyline[row][col] == 0) {
          System.out.print(" ");
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
  }
}

/*
 * input for sample run #1
 * 5 6
 * 10 10 10 10 10 10
 * 10 40 40 10 20 20
 * 70 10 10 80 20 20
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 */

/*
 * input for sample run #2
 * 10 10
 * 0 0 0 0 0 0 0 0 0 0
 * 90 90 70 70 0 40 40 0 80 80
 * 90 90 70 70 0 40 40 0 80 80
 * 90 90 70 70 0 40 40 0 130 130
 * 90 90 70 70 0 40 40 0 130 130
 * 0 0 0 0 0 0 0 0 0 0
 * 20 20 0 120 120 20 20 20 80 80
 * 20 20 0 120 120 20 20 20 80 80
 * 20 20 0 120 120 0 0 0 0 0
 * 20 20 0 120 120 0 0 0 0 0
 */