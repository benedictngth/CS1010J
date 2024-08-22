/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #23: PS1_Ex23_SAT.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class SAT {

  public static void main(String[] args) {
    int verbal, maths, writing;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Enter scores: ");
    verbal = sc.nextInt();
    maths = sc.nextInt();
    writing = sc.nextInt();

    System.out.println("The SAT score is in the " + computePercentile(verbal, maths, writing) + " percentile.");
    System.out.println("The IQ score is " + df.format(computeIQScore(verbal, maths)));

    if ((verbal > 600 && maths > 600 && writing > 600) || computeIQScore(verbal, maths) >= 120) {
      System.out.println("Wow, this is amazing!");
    }

  }

  // <Write a short description of the method here>
  public static int computePercentile(int verbal, int maths, int writing) {

    int satScore = verbal + maths + writing;
    return satScore < 1500 ? 10 : satScore < 2000 ? 50 : satScore < 2200 ? 95 : 99;
  }

  // <Write a short description of the method here>
  public static double computeIQScore(int verbal, int maths) {
    return (0.095 * maths) + (0.003 * verbal) + 50.241;
  }
}