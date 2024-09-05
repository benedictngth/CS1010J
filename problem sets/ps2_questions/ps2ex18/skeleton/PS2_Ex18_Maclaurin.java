/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #18: PS2_Ex18_Maclaurin.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

class Maclaurin {

  public static void main(String[] args) {

    System.out.print("Enter x and n: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();

    DecimalFormat df = new DecimalFormat("0.000");
    System.out.println(df.format(computeMaclaurin(x, n)));
  }

  // <Write a short description of the method here>
  public static double computeMaclaurin(int x, int n) {
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      // System.out.println(Math.pow((double) x, (double) i) / factorial(i));
      sum += Math.pow((double) x, (double) i) / factorial(i);
    }

    return sum; // stub, to be replaced by your code
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  };
}