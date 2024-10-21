class T8Q1 {
  
  public static void main(String[] args) {
    test1();
    test2();
    test3();
  }
  
  // Part (b)
  public static void test1() {
    
    Point p1 = new Point(0, 0);
    Point p2 = new Point(4.5, 5.2);
    
    System.out.println(p1);
    System.out.println(p2);
  }
  
  // Part (c)
  // Compute the distance between two points
  public static double distanceBetween(Point p1, Point p2) {
    
    /* fill in your code below */
    double xDiff = p1.getX() - p2.getX();
    double yDiff = p1.getY() - p2.getY();
    
    return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
  }
  
  // Part (e)
  public static void test2() {
    
    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    
    System.out.println(distanceBetween(p1, p2));
    
    System.out.println(p1.distanceTo(p2));
    
    System.out.println(p2.distanceTo(p1));
    
  }
  
  // Part (h)
  public static void test3() {
    
    Point p1 = new Point(0, 0);
    Point p2 = new Point(8, 8);
    
    Point p3 = p1.getMidPoint(p2);
    System.out.println(p3);
    
    for (int i = 0; i < 3; i++) {
      p2 = p1.getMidPoint(p2);
    }
    System.out.println(p2);
  }
}

class Point {
  
  private double x, y;  // x- and y- coordinates
  
  // Part (a)
  
  // Construct a point of coordinates (inX, inY)
  public Point(double inX, double inY) {
    /* fill in your code below */
    x = inX;
    y = inY;
  }
  
  // Return the x-coordinate of a point
  public double getX() {
    /* fill in your code below */
    return x;
  }
  
  // Return the y-coordinate of a point
  public double getY() {
    /* fill in your code below */
    return y;
  }
  
  // Return the string representation of a point
  // in the format [x, y]
  public String toString() {
    /* fill in your code below */
    return "[" + x + ", " + y + "]";
  }
  
  // Part (d)
  // Compute the distance between 'this' point and 'another' point
  public double distanceTo(Point another) {
    /* fill in your code below */
    double xDiff = x - another.x;
    double yDiff = y - another.y;
    
    return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
  }
  
  // Part (f)
  // Return true if 'this' point is close enough to 'another',
  // or false otherwise. Two points are close enough if their
  // distance is no more than 0.000001.
  public boolean equals(Point another) {
    // keywoard 'this' means this object
    // its use is optional here
    return this.distanceTo(another) <= 0.00001;
  }
  
  // Part (g)      
  // Return a third point that lays middle in the line
  // with 'this' and 'another' points as end points.
  public Point getMidPoint(Point another) {
    
    double midX = (this.x + another.x ) / 2;
    double midY = (this.y + another.y ) / 2;
    
    return new Point(midX, midY);
  }
}