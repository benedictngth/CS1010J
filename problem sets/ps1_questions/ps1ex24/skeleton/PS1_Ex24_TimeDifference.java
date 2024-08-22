/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #24: PS1_Ex24_TimeDifference.java
 * 
 * <Finds time difference between two timings
 * 
 * <Type your name here>
 */

import java.text.DecimalFormat;
import java.util.Scanner;

class TimeDifference {

  public static void main(String[] args) {
    int startHr, startMin, startSec, endHr, endMin, endSec, diffHr, diffMin, diffSec;
    Scanner sc = new Scanner(System.in);
    startHr = sc.nextInt();
    startMin = sc.nextInt();
    startSec = sc.nextInt();

    endHr = sc.nextInt();
    endMin = sc.nextInt();
    endSec = sc.nextInt();

    if (startSec > endSec) {
      endMin--; // carry over a minute
      diffSec = endSec + 60 - startSec;
    } else {
      diffSec = endSec - startSec;
    }

    if (startMin > endMin) {
      endHr--; // carry over an hr
      diffMin = endMin + 60 - startMin;
    } else {
      diffMin = endMin - startMin;
    }

    diffHr = endHr - startHr;

    // To show output as two digits with possible leading zero.
    // For example, df.format(8) will show 8 as 08
    DecimalFormat df = new DecimalFormat("00");

    System.out.println("Time difference: " + df.format(diffHr) + ":" + df.format(diffMin) + ":" + df.format(diffSec));
  }
}
