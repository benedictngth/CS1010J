/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #30: PS2_Ex30_Food.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class Food {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter budget: $");
    int budget = sc.nextInt();

    System.out.print("Enter fast-food cost per meal: $");
    int ffCost = sc.nextInt();

    System.out.print("Enter health-food cost per meal: $");
    int hfCost = sc.nextInt();

    int bestHfMeal = 0;
    int bestffMeal = 0;
    int bestCost = 0;

    for (int ffMeal = 0; ffMeal * ffCost <= budget; ffMeal++) {
      int ffTotalCost = ffMeal * ffCost;

    }

    System.out.println("Number of fast-food meals = ");
    System.out.println("Number of health-food meals = ");
  }
}