/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #04: PS3_Ex04_Coins.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class Coins {
  
  public static void main(String[] args) {
    
    System.out.print("Enter amount in dollars: ");
    
    int[] denoms = {100, 50, 20, 10, 5, 1};
    
    System.out.println("Minimum number of coins needed: ");
    System.out.println("Denoms " + "c: " );
    
  }
  
  // <Write a short description of the method here>
  public static int[] computeCoins(double amount, int[] denoms) {
    
    // counts[0] will be the number of coins used for $1, etc.
    int[] counts = new int[denoms.length];  // all 0 by default
    
    return counts;
  }
}