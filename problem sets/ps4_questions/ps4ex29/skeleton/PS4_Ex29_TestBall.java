/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #29: PS4_Ex29_TestBall.java
 * 
 * This program:
 * i.  Create an array of three balls with given colour and radius.
 * ii. Check whether any two balls have the same color and radius.
 * iv. Print out the radius of the biggest ball.
 * 
 * <Type your name here>
 */

import java.util.*;

class TestBall {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    Ball[] balls = new Ball[3];  // 3 balls
    
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter colour and radius of ball " + (i+1) + ": ");

    }
    
    
    System.out.println("Three balls are all the same");
    
    System.out.println("1st and 2nd balls are the same");
    
    System.out.println("2nd and 3rd balls are the same");
    
    System.out.println("1st and 3rd balls are the same");
    
    System.out.println("Three balls are all different");
    
    
    System.out.println("The largest radius is: ");
  }
}