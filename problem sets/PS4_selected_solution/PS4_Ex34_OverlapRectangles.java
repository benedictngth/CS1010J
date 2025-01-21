/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #34: PS4_Ex34_OverlapRectangles.java
 * 
 * This program reads in a number of rectangles and computes the
 * overlap of all rectangles. This program uses the Rectangle class.
 * 
 * Author: Lifeng
 */

import java.util.*;
import java.awt.Point;

class OverlapRectangles {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("How many rectangles? ");
    int num = scanner.nextInt();
    
    System.out.print("Enter 2 opposite vertices of first rectangle: ");
    Rectangle rec = readRec(scanner);
    
    for (int i = 1; i < num; i++) {
      System.out.print("Enter 2 opposite vertices of the next rectangle: ");
      Rectangle next = readRec(scanner);
      if (rec != null) {
        rec = rec.intersect(next);
      }
    }
    
    if (rec != null) {
      System.out.println("Overlap rectangle: " + rec);
      System.out.println("Overlap area = " + rec.getArea());
    } else {
      System.out.println("No overlap");
    }
  }
  
  // Read data of a rectangle, create a Rectangle object and return it
  public static Rectangle readRec(Scanner scanner) {
    
    // (x1, y1) and (x2, y2) are two corners of a rectangle
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();
    
    return new Rectangle(new Point(x1, y1), new Point(x2, y2));
  }
}