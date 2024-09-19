/*
* CS1010J Programming Methodology
* Problem Set 3 Exercise #16: PS3_Ex16_RabbitJumps.java
* 
* <Fill in a short description of this program>
* 
* 
* <Type your name here>
*/

import java.util.*;

class RabbitJumps {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rocks: ");
    int numRocks = sc.nextInt();
    int[] rocks = new int[numRocks + 1];
    System.out.print("Enter locations of " + numRocks + " rocks: ");
    for (int rock = 1; rock < numRocks + 1; rock++) {
      rocks[rock] = sc.nextInt();
    }
    int maxJump = 50;

    boolean jump = true;
    int curPos = 0;
    int numJump = 0;
    while (curPos + 1 < numRocks + 1 && jump) {
      // not possible to jump
      if (rocks[curPos + 1] - rocks[curPos] > maxJump) {
        jump = false;
      } else {
        int tempPos = curPos;
        // shift curPos forward while multiple jumps are possible
        while (tempPos + 2 < numRocks + 1 && rocks[tempPos + 2] - rocks[curPos] <= maxJump) {
          tempPos++;
        }
        // replace if multiple jumps are possible
        if (tempPos > curPos) {
          curPos = tempPos;
        }
        curPos++;
        numJump++;
      }
    }

    if (jump) {
      System.out.println(numJump + " jumps");
    } else {
      System.out.println("Impossible");
    }

  }
}
