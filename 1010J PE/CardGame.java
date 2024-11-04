/*
 * CS1010J AY2024/25 Semester 1
 * Practical Assessment Ex1: CardGame.java
 * 
 * Fill in your student number: A0309074E
 * 
 * Write a short and meaningful program description below:
 * finds winner of card game between 2 players dealt 3 card each
 * 
 * 
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

class CardGame {
  // main() method is complete and given. Do NOT modify it!
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] player1 = new int[3];
    System.out.print("Enter three cards of player 1: ");
    for (int i = 0; i < 3; i++) {
      player1[i] = input.nextInt();
    }

    int[] player2 = new int[3];
    System.out.print("Enter three cards of player 2: ");
    for (int i = 0; i < 3; i++) {
      player2[i] = input.nextInt();
    }

    int result = playGame(player1, player2);

    if (result == 1) {
      System.out.println("Player 1 is the winner");
    } else if (result == -1) {
      System.out.println("Player 2 is the winner");
    } else {
      System.out.println("The game is a draw");
    }
  }

  /**********************************************************
   * Write your code below this line *
   *********************************************************/

  // return the num of digits of card
  public static int numOfDigits(int card) {
    int numDigits = 0;
    while (card > 0) {
      numDigits++;
      card /= 10;
    }
    return numDigits;
  }

  // return who wins for the card
  public static int compareCards(int card1, int card2) {
    int[] card1Arr = new int[numOfDigits(card1)];
    int[] card2Arr = new int[numOfDigits(card2)];
    inttoArr(card1, card1Arr);
    inttoArr(card2, card2Arr);
    int p1 = 0, p2 = 0, cardLength; // cardLength is the maxLength of both cards
    if (card1Arr.length > card2Arr.length) {
      p1 += card1Arr.length - card2Arr.length; // adds addtional number of digits card2 does not have
      cardLength = card2Arr.length;
    } else if (card1Arr.length < card2Arr.length) {
      p2 += card2Arr.length - card1Arr.length;
      cardLength = card1Arr.length;
    } else {
      cardLength = card1Arr.length; // same length
    }

    for (int i = 0; i < cardLength; i++) {
      if (card1Arr[i] > card2Arr[i]) {
        p1++;
      } else if (card1Arr[i] < card2Arr[i]) {
        p2++;
      }
    }
    if (p1 > p2) {
      return 1;
    } else if (p2 > p1) {
      return -1;
    } else { // draw with same number of winning digits
      return 0;
    }
  }

  public static void inttoArr(int digit, int[] arr) {
    int idx = 0;
    while (digit > 0) {
      arr[arr.length - 1 - idx] = digit % 10;
      idx++;
      digit /= 10;
    }
  }

  // returns who win the best of 3 card
  public static int playGame(int[] player1, int[] player2) {
    // tracks score
    int p1 = 0;
    int p2 = 0;
    for (int i = 0; i < player1.length; i++) {
      if (compareCards(player1[i], player2[i]) == 1) {
        p1++;
      } else if (compareCards(player1[i], player2[i]) == -1) {
        p2++;
      }
    }
    if (p1 > p2) {
      return 1;
    } else if (p2 > p1) {
      return -1;
    } else {
      return 0;
    }
  }
}
