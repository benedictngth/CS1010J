/*
 * CS1010J PA Practice Paper 1 Ex2
 * Skyline.java
 * 
 * This program prints out the skyline of a map
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Skyline {
  
  public static void main(String[] args) {
    int[][] map = readMap();
    int[] heights = checkHeights(map);
    printSkyline(heights);
  }
 
  
  // Read and return the map
  public static int[][] readMap() {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the size of map: ");
    int numRows = input.nextInt();
    int numCols = input.nextInt();
    
    int[][] map = new int[numRows][numCols];
    System.out.println("Enter " + numRows + "*" + numCols + " map: ");
    for (int r = 0; r < numRows; r++) {
      for (int c = 0; c < numCols; c++) {
        map[r][c] = input.nextInt();
      }
    }
    
    input.close();
    
    return map;
  }
  
  
  // Return an array that contains the maximum height of each column
  public static int[] checkHeights(int[][] map) {
    
    int numRows = map.length, numCols = map[0].length;
    
    // Store the maximum height of each column; default value: 0
    int[] heights = new int[numCols];
    
    for (int c = 0; c < numCols; c++) {
      for (int r = 0; r < numRows; r++) {
        if (map[r][c] > heights[c]) {
          heights[c] = map[r][c];
        }
      }
    }
    
    return heights;
  }
  
  
  // Return the maximum height in the map
  public static int findMaximumHeight(int[] heights) {
    
    int max = 0;
    
    for (int i = 0; i < heights.length; i++) {
      if (max < heights[i]) {
        max = heights[i];
      }
    }
    
    return max;
  }
  
  
  // Print skyline of the map
  public static void printSkyline(int[] heights) {
    
    int maxHeight = findMaximumHeight(heights);
    int numCols = heights.length, numRows = maxHeight/10;
    
    for (int r = numRows; r > 0; r--) {
      for (int c = 0; c < numCols; c++) {
        if (heights[c]/10 >= r) {
          System.out.print('#');
        } else {
          System.out.print(' ');
        }
      }
      System.out.println(); // change line after a row
    }
  }
}