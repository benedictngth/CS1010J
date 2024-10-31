/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #16: PS4_Ex16_Palindromes.java
 * 
 * This program reads a list of input strings, reports
 * how many of them are palindrome if we disregard case
 * and all non-letter characters.
 * 
 * <Type your name here>
 */

import java.util.*;

class Palindromes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many strings? ");
    int numStr = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter " + numStr + " strings, each on a line:");
    int palim = 0;
    for (int i = 0; i < numStr; i++) {
      String nextString = sc.nextLine();
      if (isPalindrome(nextString.toLowerCase())) {
        palim++;
      }
    }

    System.out.println("Number of palindromes = " + palim);
  }

  // Check a single string 'str'.
  // Return true if str is a palindrome, or false otherwise.
  public static boolean isPalindrome(String str) {
    int startIdx = 0;
    int endIdx = str.length() - 1;
    while (startIdx < endIdx) {
      if (!Character.isLetter(str.charAt(startIdx))) {
        startIdx++;
      } else if (!Character.isLetter(str.charAt(endIdx))) {
        endIdx--;
      } else if (str.charAt(startIdx) != str.charAt(endIdx)) {
        return false;
      } else {
        startIdx++;π
        endIdx--;
      }
    }
    return true; // stub
  }
}