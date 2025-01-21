/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #05: PS4_Ex05_TestMyPoint.java
 * 
 * This class demonstrates the use of MyPoint class.
 * It reads a double seed and generates 2 points p and q as follows:
 *   p's x-coordinate: divide seed by 17 and take the quotient
 *   p's y-coordinate: divide seed by 53 and take the remainder
 *   q's x-coordinate: divide seed by 11 and take the quotient
 *   q's y-coordinate: divide seed by 41 and take the remainder
 * It then computes, by invoking appropriate member methods of the MyPoint class,
 * the Euclidean distance between the two points, and the area of the
 * rectangle bounded by these 2 points as the opposite corners.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;
import java.text.*;

class TestMyPoint {
  
  public static void main (String [] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter seed: ");
    double seed = scanner.nextDouble();
    
    MyPoint p = new MyPoint(seed/17, seed%53);
    System.out.println("p = " + p);
    
    MyPoint q = new MyPoint(seed/11, seed%41);
    System.out.println("q = " + q);
    
    DecimalFormat df = new DecimalFormat("0.00000");
    System.out.println("Distance = " + df.format(p.distanceTo(q)));
    System.out.println("Area = " + df.format(p.computeRectArea(q)));
  }
}