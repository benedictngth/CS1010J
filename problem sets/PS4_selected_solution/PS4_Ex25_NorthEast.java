/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #25: PS4_Ex25_NorthEast.java
 * 
 * This program counts the number of valid north-east paths.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class NorthEast {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter rows and columns apart: ");
    int row = scanner.nextInt();
    int col = scanner.nextInt();
    
    System.out.println("Number of NE-paths = " + ne(row, col));
  }
  
  // Count the number of valid north-east paths
  // Pre-cond: x >= 0, y >= 0
  public static int ne(int x, int y) {
    
    if (x == 0 || y == 0) {
      return 1;
    } else {
      return ne(x-1, y) + ne(x, y-1);
    }
  }
}