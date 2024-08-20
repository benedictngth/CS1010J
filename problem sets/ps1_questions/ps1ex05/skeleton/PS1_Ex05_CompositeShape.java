/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #05: PS1_Ex05_CompositeShape.java
 * 
 * This program computes the area of the given composite shape.
 * 
 * <Type your name here>
 */

import java.util.Scanner;
import java.text.DecimalFormat; // to format real number output
import java.lang.Math; //for PI value

class CompositeShape {

  public static void main(String[] args) {
    double length, width, area, radius;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0000");

    System.out.print("Enter length of rectangle: ");
    length = sc.nextDouble();

    System.out.print("Enter width of rectangle: ");
    width = sc.nextDouble();

    radius = length / 2;
    area = length * width + 0.5 * Math.PI * Math.pow(radius, 2);

    System.out.println("Area = " + df.format(area));
  }
}
