/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #14: PS1_Ex14_AM_GM.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

class Means {

  public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.print("Enter 3 positive integers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    double arithMean = computeAM(a, b, c);
    System.out.println("Arithmetic mean = " + df.format(computeAM(a, b, c)));
    System.out.println("Geometric mean = " + df.format(computeGM(a, b, c)));
  }

  // <Write a short description of the method here>
  public static double computeAM(int a, int b, int c) {

    return (a + b + c) / (3.0); // stub, to be replaced by your code
  }

  // <Write a short description of the method here>
  public static double computeGM(int a, int b, int c) {
    return Math.cbrt((double) (a * b * c));
  }
}