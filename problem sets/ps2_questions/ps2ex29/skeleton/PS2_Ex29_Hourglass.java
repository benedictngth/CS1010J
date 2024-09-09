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
    int hg1 = sc.nextInt(); // durations of hourglasses; assume hg1 < hg2
    int hg2 = sc.nextInt();
    int totalTime = sc.nextInt();

    int flips1; // number of flips needed for hourglass 1
    int flips2 = totalTime / hg2;
    int remainTime = totalTime % hg2;

    // case where remains time = shorter hour glass
    if (remainTime % hg1 == 0) {
      flips1 = remainTime / hg1;
      System.out.println(flips1 + " flip(s) for " + hg1 + "-minute hourglass and " +
          flips2 + " flip(s) for " + hg2 + "-minute hourglass.");
      // case where remain time + one previous longer hourglass rolls back = n * short
      // time hourglass
    } else {
      while ((remainTime < totalTime && (remainTime) % hg1 != 0)) {
        remainTime += hg2;
        flips2--;
      }

      // System.out.println(remainTime);
      if (remainTime < totalTime) {
        flips1 = remainTime / hg1;
        System.out.println(flips1 + " flip(s) for " + hg1 + "-minute hourglass and " +
            flips2 + " flip(s) for " + hg2 + "-minute hourglass.");

      } else {
        System.out.println("Impossible!");
      }
    }

  }
}