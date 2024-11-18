/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: OperateLifts.java
 * 
 * This program receives instructions on two
 * lifts and move them from one level to another.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class OperateLifts {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Create two lifts
    Lift lift1 = new Lift();
    Lift lift2 = new Lift();
    
    System.out.print("How many instructions? ");
    int num = sc.nextInt();
    
    System.out.println("Enter " + num + " instructions:");
    for (int i = 0; i < num; i++) {
      int no = sc.nextInt();   // lift number
      int from = sc.nextInt(); // from level
      int to = sc.nextInt();   // to level
      if (no == 1) {
        lift1.move(from, to);
      } else { // operate on lift 2 - assuming no input error
        lift2.move(from, to);
      }
    }
    
    System.out.println("lift 1 took " + lift1.getTime()
                         + " seconds and ended at level " + lift1.getLevel());
    System.out.println("lift 2 took " + lift2.getTime()
                         + " seconds and ended at level " + lift2.getLevel());
  }
}