/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: OperateLifts.java
 * 
 * This program receives instructions on two
 * lifts and move them from one level to another.
 * 
 * <Type your name here>
 */

import java.util.*;

class OperateLifts {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Lift liftOne = new Lift();
    Lift liftTwo = new Lift();

    System.out.print("How many instructions? ");
    int numInstructions = sc.nextInt();
    System.out.println("Enter " + numInstructions + " instructions:");
    for (int i = 0; i < numInstructions; i++) {
      int lift = sc.nextInt();
      int initialLvl = sc.nextInt();
      int finalLvl = sc.nextInt();
      if (lift == 1) {
        liftOne.move(initialLvl, finalLvl);
      } else {
        liftTwo.move(initialLvl, finalLvl);
      }
    }
    System.out.println("lift 1 took " + liftOne.getTime() + " seconds and ended at level " + liftOne.getLevel());
    System.out.println("lift 2 took " + liftTwo.getTime() + " seconds and ended at level " + liftTwo.getLevel());
  }
}