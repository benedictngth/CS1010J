class T11Q2 {
  
  // Part (d)
  public static void main(String[] args) {
    
    Point point1 = new Point(3, 0);
    Point point2 = new Point(3, 4);
    Line  line1 = new Line(point1, point2);
    Line  line2 = new Line(new Point(0, 0), point2);
    
    System.out.println(line1.getLength());
    System.out.println(line2.getLength());
  }
}

class Point {
  
  private double x, y;  // x- and y- coordinates
  
  // Construct a point of coordinates (inX, inY)
  public Point(double inX, double inY) {
    x = inX;
    y = inY;
  }
  
  // Compute the distance between 'this' point and 'another' point
  public double distanceTo(Point another) {
    /* fill in your code below */
    double xDiff = x - another.x;
    double yDiff = y - another.y;
    
    return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
  }
  
  // Return the string representation of a point in the format [x, y]
  public String toString() {
    return "[" + x + ", " + y + "]";
  }
  
  // Part (a) 
  // Return true if 'this' point is less than 'another', or false otherwise.
  // A point is smaller than another if its x-coordinate if smaller,
  // or in the case x-coordinate is the same, its y-coordinate is smaller.
  public boolean lessThan(Point another) {
    
    /* fill in your code below */
    return (x < another.x) || (x == another.x && y < another.y);
  }
}

class Line {
  
  Point end1, end2;
  
  // Create a line with p1 and p2 as endpoints
  public Line(Point p1, Point p2) {
    end1 = p1;
    end2 = p2;
  }
  
  // Return the length of this line
  public double getLength() {
    /* fill in your code below */
    return end1.distanceTo(end2);
  }
}