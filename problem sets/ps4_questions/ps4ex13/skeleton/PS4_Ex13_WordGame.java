/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #13: PS4_Ex13_WordGame.java
 * 
 * This program reads in a word and computes
 * the total points of all the letters in the word.
 * 
 * <Type your name here>
 */

import java.util.*;

class WordGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = sc.nextLine();
    System.out.println("Total score = " + computeScore(word));
  }

  // Compute total score of letters in a word
  public static int computeScore(String word) {
    char[][] pt = new char[][] { { 'A', 'E', 'I', 'N', 'O', 'R', 'S', 'T', 'U' }, { 'D', 'G' }, { 'B', 'C', 'M', 'P' },
        { 'F', 'H', 'V', 'W', 'Y' }, { 'K' }, { 'J', 'X' }, { 'Q', 'Z' } };
    int pts = 0;
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      for (int j = 0; j < pt.length; j++) {
        for (int h = 0; h < pt[j].length; h++) {
          if (pt[j][h] == letter) {
            if (j == 5) {
              pts += 8;
            } else if (j == 6) {
              pts += 10;
            } else {
              pts += (j + 1);
            }
          }
        }
      }
    }
    return pts; // stub
  }
}