/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #15: PS4_Ex15_PigLatin.java
 * 
 * This program reads in a sentence comprising words,
 * and converts the it into Pig Latin.
 * Pig Latin is a language game primarily used in English.
 * It is usually used by children, who often use it to
 * converse in (perceived) privacy from adults,
 * or simply for amusement. (From Wikipedia)
 * 
 * <Type your name here>
 */

import java.util.*;

class PigLatin {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();
    String[] words = sentence.split(" ");
    String pigSentence = "";
    for (int i = 0; i < words.length; i++) {
      words[i] = convert(words[i]);
    }
    System.out.println("Converted: " + String.join(" ", words));

  }

  // Convert a single word.
  // For a word starting with a consonant, move that first consonant
  // to the end of the word and append "ay".
  // For a word starting with a vowel, simply append "way" to the word.
  // Return the converted word.
  public static String convert(String word) {
    char firstLetter = word.charAt(0);
    switch (firstLetter) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        return word + "way";

      default:
        return word.substring(1, word.length()) + firstLetter + "ay";
    }
  }
}