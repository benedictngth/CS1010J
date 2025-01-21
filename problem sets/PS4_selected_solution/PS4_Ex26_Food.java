/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #26: PS4_Ex26_Food.java
 * 
 * This program computes the number of ways to have 
 * fast-food meals and health-food meals out of n meals.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Food {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter total number of meals: ");
    int n = scanner.nextInt();
    
    System.out.println("Number of combinations = " + enumerate(n));
  }
  
  // Compute the number of ways to take the n meals
  // provided there are NO two consecutive fast-food meals.
  public static int enumerate(int n) {
    
    if (n == 1) {  // 1 meal, 2 choices
      return 2;
    } else if (n == 2) {  // 2 meals, 3 choices
      return 3;
    } else {
      // if this meal is health-food meal, next one can be either health or fast-food meal.
      // Therefore the number of choices is enumerate(n-1).
      // if this meal is fast-food meal, next meal must be health-food meal,
      // the number of choices is enumerate(n-2)
      return enumerate(n-1) + enumerate(n-2);
    }
  }
}