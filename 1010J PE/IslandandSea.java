/*
 * CS1010J AY2024/25 Semester 1
 * Practical Assessment Ex2: IslandandSea.java
 * 
 * Fill in your student number: A0309074E
 * 
 * Write a short and meaningful program description below:
 * contains 3 methods to find size of sea, size of island and size of square island
 * 
 * 
 * 
 */

import java.util.Scanner;

class IslandandSea {
  // main() method is complete and given. Do NOT modify it!
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of the map: ");
    int n = input.nextInt();
    int[][] map = new int[n][n];

    System.out.print("Enter the map: ");
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        map[row][col] = input.nextInt();
      }
    }

    System.out.println("Area of the sea = " + seaArea(map));
    System.out.println("Perimeter of the island = " + islandPerimeter(map));
    System.out.println("Length of the largest square area = " + largestSquareArea(map));
  }

  /**********************************************************
   * Write your code below this line *
   *********************************************************/

  //
  public static int seaArea(int[][] map) {
    int sea = 0;
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        if (map[i][j] == 0) {
          sea++;
        }
      }
    }
    return sea;
  }

  // find island perimeter
  public static int islandPerimeter(int[][] map) {
    int peri = 0; // stores total perimeter of island
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        // is island
        if (map[i][j] == 1) {
          // check north
          if (i == 0 || (i - 1 >= 0 && map[i - 1][j] == 0)) {
            peri++;
          }
          // check south
          if (i == map.length - 1 || (i + 1 < map.length && map[i + 1][j] == 0)) {
            peri++;
          }
          // check east
          if (j == map.length - 1 || (j + 1 < map.length && map[i][j + 1] == 0)) {
            peri++;
          }
          // check west
          if (j == 0 || (j - 1 >= 0 && map[i][j - 1] == 0)) {
            peri++;
          }
        }
      }
    }
    return peri;
  }

  // find the largest island shape of square
  public static int largestSquareArea(int[][] map) {
    int maxLength = 1;
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        // is an island tile
        if (map[i][j] == 1) {
          int maxRow = 1; // max number of consecutive islands in the same col
          int curRow = i;
          while (map[curRow + 1][j] < map.length && map[curRow + 1][j] == 1) {
            maxRow++;
            curRow++;
          }
          // check whether there is an island sqaure of maxRow from map[i][j] as the top
          // left corner
          boolean isSquare = true;
          for (int row = i; row < map.length && row < i + maxRow; row++) {
            for (int col = j; col < map.length && col < j + maxRow; col++) {
              if (map[row][col] == 0) {
                isSquare = false;
              }
            }
          }
          if (isSquare && maxRow > maxLength) {
            maxLength = maxRow;
          }
        }
      }
    }
    return maxLength;
  }

}

/*
 * sample run #1 inputs
 * 5
 * 0 0 1 1 1
 * 0 0 1 1 1
 * 0 0 1 1 1
 * 0 0 0 0 0
 * 0 0 0 0 0
 */

/*
 * sample run #2 inputs
 * 5
 * 0 0 1 0 0
 * 0 1 1 1 1
 * 0 0 1 1 0
 * 0 0 1 1 0
 * 0 0 0 0 0
 */

/*
 * sample run #3 inputs
 * 4
 * 0 0 0 0
 * 0 1 0 0
 * 0 1 1 0
 * 0 0 0 0
 */
