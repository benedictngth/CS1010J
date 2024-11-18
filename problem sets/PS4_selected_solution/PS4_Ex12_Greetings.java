/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #12: PS4_Ex12_Greetings.java
 * 
 * This program reads age, name and gender of a person,
 * prints out corresponding greeting message.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Greetings {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Your age? ");
    int age = scanner.nextInt();
    
    scanner.nextLine(); // read and ignore <Enter>
    
    System.out.print("Your name? ");
    String name = scanner.nextLine();
    
    System.out.print("Your gender? ");
    String gender = scanner.next();
    
    if (age < 18) {  // teen
      if ( gender.equals("Male") ) {
        System.out.println("Hello boy " + name);
      } else {  // female
        System.out.println("Hey girl " + name);
      }
    } else { // adult
      if ( gender.equals("Male") ) {
        System.out.println("Hello Mr. " + name);
      } else { // female
        System.out.println("Hey Ms. " + name);
      }
    }
  }
}