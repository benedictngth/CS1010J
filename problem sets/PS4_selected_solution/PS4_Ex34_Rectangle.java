/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #34: PS4_Ex34_Rectangle.java
 * 
 * The Rectangle class keeps the bottom-left and
 * top-right corners as attributes.
 * Both corners are instances of java.awt.Point class.
 * 
 * Author: Zhou Lifeng
 */

import java.awt.Point;

class Rectangle {
  
  // bottom-left and top-right corners
  private Point vertex1, vertex2;
  
  // Constructor
  // Given points p1 and p2 are two opposite corners but not necessarily
  // the bottom-left and top-right ones.
  // So we rearrange the given data to find and store
  // the bottom-left and top-right vertices.
  public Rectangle(Point p1, Point p2) {
    
    // java.awt.Point class has two attributes x and y, both are public!
    int bottomLeftX = Math.min(p1.x, p2.x);
    int bottomLeftY = Math.min(p1.y, p2.y);
    int topRightX   = Math.max(p1.x, p2.x);
    int topRightY   = Math.max(p1.y, p2.y);
    
    vertex1 = new Point(bottomLeftX, bottomLeftY);
    vertex2 = new Point(topRightX, topRightY);
  }
  
  // Return a new Rectangle which is the intersection of 'this' and 'another'
  public Rectangle intersect(Rectangle another) {
    
    // Instead of using keyword 'null', another way is to return
    // a new rectangle that has zero area in the case two rectangles disjoint.
    // Since the area is zero, user may assume it mean two given rectangles do not overlap.
    if (another == null) {
      return null;
    }
    
    // two rectangles disjoint
    if (this.vertex2.x < another.vertex1.x || this.vertex2.y < another.vertex1.y ||
        this.vertex1.x > another.vertex2.x || this.vertex1.y > another.vertex2.y) {
      return null;
    }
    
    // If 2 rectangles overlap, the overlap area is also a rectangle. 
    // Its bottom-left vertex is at point (bottomLeftX, bottomLeftY)
    // and its top-right vertex be at point (topRightX, topRightY).
    
    int bottomLeftX = Math.max(this.vertex1.x, another.vertex1.x);
    int bottomLeftY = Math.max(this.vertex1.y, another.vertex1.y);
    int topRightX   = Math.min(this.vertex2.x, another.vertex2.x);
    int topRightY   = Math.min(this.vertex2.y, another.vertex2.y);
    
    // The other way to check the position of two rectangles: disjoint or intersect        
    //if (bottomLeftX > topRightX || bottomLeftY > topRightY) {
    //   return null;
    //}
    
    return new Rectangle(new Point(bottomLeftX, bottomLeftY), new Point(topRightX, topRightY));
  }
  
  // Return area of a Rectangle
  public int getArea() {
    return (vertex2.x - vertex1.x) * (vertex2.y - vertex1.y);
  }
  
  // Return string representation of a Rectangle in the format, e.g. "[(7, 7); (8, 8)]"
  public String toString() {
    return "[(" + vertex1.x + ", " + vertex1.y + "); (" + vertex2.x + ", " + vertex2.y + ")]";
  }
}