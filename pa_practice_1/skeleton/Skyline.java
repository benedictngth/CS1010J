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
  
  // <Write a short description of the method here>
  public static int[][] readMap() {
    
    System.out.print("Enter the size of map: ");
    
    int[][] map = new int[0][0]; // stub
    System.out.println("Enter " +  "*" +  " map: ");
    
    return map;
  }
  
  
  // <Write a short description of the method here>
  public static int[] checkHeights(int[][] map) {
    
    int[] heights = new int[0]; // stub
    
    return heights;
  }
  
  
  // <Write a short description of the method here>
  public static int findMaximumHeight(int[] heights) {
    
    return 0;
  }
  
  
  // Print skyline of the map
  public static void printSkyline(int[] heights) {
    System.out.print('#');
    System.out.print(' ');
    System.out.println();
  }
}

/* input for sample run #1
 5 6
 10 10 10 10 10 10
 10 40 40 10 20 20
 70 10 10 80 20 20
 0  0  0  0  0  0
 0  0  0  0  0  0
 */

/* input for sample run #2
 10 10
 0   0   0   0   0   0   0   0   0   0
 90  90  70  70   0  40  40   0  80  80
 90  90  70  70   0  40  40   0  80  80
 90  90  70  70   0  40  40   0 130 130
 90  90  70  70   0  40  40   0 130 130
 0   0   0   0   0   0   0   0   0   0
 20  20   0 120 120  20  20  20  80  80
 20  20   0 120 120  20  20  20  80  80
 20  20   0 120 120   0   0   0   0   0
 20  20   0 120 120   0   0   0   0   0
 */