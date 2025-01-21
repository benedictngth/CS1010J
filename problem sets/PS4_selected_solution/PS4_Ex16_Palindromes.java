/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #16: PS4_Ex16_Palindromes.java
 * 
 * This program reads a list of input strings, reports
 * how many of them are palindrome if we disregard case
 * and all non-letter characters.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Palindromes {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("How many strings? ");
    int num = scanner.nextInt();
    
    scanner.nextLine(); // read and drop <Enter>
    
    System.out.println("Enter " + num + " strings, each on a line:");
    
    int count = 0;
    for (int i = 0; i < num; i++) {
      String input = scanner.nextLine();
      if ( isPalindrome(input) ) {
        count++;
      }
    }        
    
    System.out.println("Number of palindromes = " + count);
  }
  
  // Check a single string 'str'.
  // Return true if str is a palindrome, or false otherwise.
  public static boolean isPalindrome(String str) {
    
    int left = 0, right = str.length()-1;
    
    while (left < right) {
      if ( !Character.isLetter(str.charAt(left)) ) {
        left++;
      } else if ( !Character.isLetter(str.charAt(right)) ) {
        right--;
      } else if ( Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)) ) {
        return false;
      } else {
        left++;
        right--;
      }
    }
    
    return true;
  }
}