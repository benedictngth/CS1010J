class T11Q1 {
  
  // Part (d)
  public static void main(String[] args) {
    
    Point[] points = createPoints();
    for (int i = 0; i < points.length; i++) {
      System.out.println(points[i]);
    }
    System.out.println("Smallest point = " + points[smallest(points)]);
  }
  
  // Part (b)
  // Return the index of first smallest point in the array
  public static int smallest(Point[] points) {
    
    /* fill in your code below */
    int index = 0;  // index of the smallest point
    for (int i = 1; i < points.length; i++) {
      if ( points[i].lessThan(points[index]) ) {
        index = i;
      }
    } 
    return index;
  }
  
  // Part (c)
  // Create an array of 10 points, whereby the 1st point has coordinates (0, 0),
  //  2nd point has coordinates (0, 1)...
  public static Point[] createPoints() {
    
    /* fill in your code below */
    Point[] points = new Point[10];
    for (int i = 0; i < points.length; i++) {
      points[i] = new Point(0, i);
    }
    return points;
  }
}

class Point {
  
  private double x, y;  // x- and y- coordinates
  
  // Construct a point of coordinates (inX, inY)
  public Point(double inX, double inY) {
    x = inX;
    y = inY;
  }
  
  // Part (a) 
  // Return true if 'this' point is less than 'another', or false otherwise.
  // A point is smaller than another if its x-coordinate if smaller,
  // or in the case x-coordinate is the same, its y-coordinate is smaller.
  public boolean lessThan(Point another) {
    
    /* fill in your code below */
    return x < another.x || x == another.x && y < another.y;
  }
  
  // Return the string representation of a point in the format [x, y]
  public String toString() {
    return "[" + x + ", " + y + "]";
  }
}