/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: PS1_Ex08_Coins.java
 * 
 * Min coins for amount
 * 
 * 
 * <Benedict>
 */

import java.util.Scanner;

class Coins {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int numCoin = 0, pos = 0;
    int[] denomination = { 100, 50, 20, 10, 5, 1 };
    System.out.print("Enter amount in cents: ");
    int amt = sc.nextInt();

    while (amt > 0) {
      numCoin += amt / denomination[pos]; // finds max number of coins for the denomination
      amt %= denomination[pos]; // finds remaining amount after removing max number coins
      pos++; // moves to next smallest denomination
    }

    System.out.println("Minimum number of coins needed: " + numCoin);
  }
}