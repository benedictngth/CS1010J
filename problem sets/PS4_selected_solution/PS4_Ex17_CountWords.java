/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #17: PS4_Ex17_CountWords.java
 * 
 * This program reads a sentence and
 * counts the number of words in it.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class CountWords {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();
    
    int count = wordCount(sentence);
    
    System.out.println("Word count = " + count);
  }
  
  // Count the number of words in sentence
  public static int wordCount(String sentence) {
    
    int count = 0;
    boolean startOfNewWord = true;
    
    for (int i = 0; i < sentence.length(); i++) {
      if ( startOfNewWord && Character.isLetter(sentence.charAt(i)) ) {
        count++;
        startOfNewWord = false;
      } else if (sentence.charAt(i) == ' ') {
        startOfNewWord = true;
      }
    }
    
    return count;
  }
}