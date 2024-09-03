/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #29: PS2_Ex29_Hourglass.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class Hourglass {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter 3 inputs: ");
    int hg1 = sc.nextInt();   // durations of hourglasses; assume hg1 < hg2
    int hg2 = sc.nextInt();       
    
    int flips1;    // number of flips needed for hourglass 1
    int flips2;    // number of flips needed for hourglass 2
    
    
    
    System.out.println("Impossible!");
    
    System.out.println(flips1 + " flip(s) for " + hg1 + "-minute hourglass and " +
                       flips2 + " flip(s) for " + hg2 + "-minute hourglass.");
  }
}