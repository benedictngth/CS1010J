/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #11: PS1_Ex11_Root.java
 * 
 * <Fill in a short description of this program>
 * 
 * <Type your name here>
 */

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

class Root {

  public static void main(String[] args) {
    double a, b, c;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.print("Enter coefficients (a b c): ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    double biggerRoot = getRoot(a, b, c);
    System.out.println("Bigger root is " + df.format(biggerRoot));

  }

  // Take the three coefficients and return the bigger root
  public static double getRoot(double a, double b, double c) {
    double rootOne, rootTwo;

    rootOne = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    rootTwo = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

    return rootOne > rootTwo ? rootOne : rootTwo;

  }
}
