/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #05: PS4_Ex05_MyPoint.java
 * 
 * This class provides various routines to
 * manipulate points in the coordinate plane (x, y).
 * 
 * Author: Lifeng
 */

import java.text.*;

class MyPoint {
  
  // The x- and y- coordinates of a point
  private double xCoord, yCoord;
  
  // Constructor
  public MyPoint(double xInit, double yInit) {
    xCoord = xInit;
    yCoord = yInit;
  }
  
  // Return the x-coordinate of a point
  public double getX() {
    return xCoord;
  }
  
  // Return the y-coordinate of a point
  public double getY() {
    return yCoord;
  }
  
  // Change the value of the x-coordinate of a point
  public void setX(double x) {
    xCoord = x;
  }
  
  // Change the value of the y-coordinate of a point
  public void setY(double y) {
    yCoord = y;
  }
  
  // Compute the Euclidean distance between 'this' and 'another' points
  public double distanceTo(MyPoint another) {
    return Math.sqrt(Math.pow(this.getX() - another.getX(), 2) +
                     Math.pow(this.getY() - another.getY(), 2) );
  }
  
  // Compute the area of a rectangle whose sides are
  // parallel to the x- or y-axis and has 'this' and
  // 'another' points as two opposite corners.
  public double computeRectArea(MyPoint another) {
    return Math.abs(this.getX() - another.getX()) *
      Math.abs(this.getY() - another.getY());
  }
  
  // Return string representation of a point
  // Format: (x, y) where x and y are shown in 3 decimal places
  public String toString() {
    DecimalFormat df = new DecimalFormat("0.000");
    return "(" +df.format(getX()) + ", " + df.format(getY()) + ")";
  }
}