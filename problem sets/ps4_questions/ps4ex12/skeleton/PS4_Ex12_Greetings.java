/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #12: PS4_Ex12_Greetings.java
 * 
 * This program reads age, name and gender of a person,
 * prints out corresponding greeting message.
 * 
 * <Type your name here>
 */

import java.util.*;

class Greetings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Your age? ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.print("Your name? ");
    String name = sc.nextLine();
    System.out.print("Your gender? ");
    String gender = sc.nextLine();
    if (age < 18) {
      if (gender.equals("Male")) {
        System.out.println("Hello boy " + name);
      } else {
        System.out.println("Hey girl " + name);
      }
    } else {
      if (gender.equals("Male")) {
        System.out.println("Hello Mr. " + name);
      } else {
        System.out.println("Hey Ms. " + name);
      }
    }

  }
}