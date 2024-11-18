/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #26: PS4_Ex26_Food.java
 * 
 * This program computes the number of ways to have 
 * fast-food meals and health-food meals out of n meals.
 * 
 * <Type your name here>
 */

import java.util.*;

class Food {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter total number of meals: ");
    int meals = sc.nextInt();
    System.out.println("Number of combinations = " + (enumerate(meals)));
  }

  // Compute the number of ways to take the n meals
  // provided there are NO two consecutive fast-food meals.
  public static int enumerate(int n) {
    if (n == 1) {
      return 2;
    } else if (n == 2) {
      return 3;
    } else {
      // enumerate (n-1) current n is a H food hence next option can be H/F
      // enumerate (n-2) current n is a F food hence next option is only H and 1
      // option only
      return enumerate(n - 1) + enumerate(n - 2);
    }
  }
}