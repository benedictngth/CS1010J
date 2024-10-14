class TestQ1 {
  
  public static void main(String[] args) {
    
    Q1 obj;                                 // Line 1
    obj.one = 1;                            // Line 2
    obj.two = 2;                            // Line 3
    System.out.println( obj.changeOne() );  // Line 4
    System.out.println( obj.changeTwo() );  // Line 5
  }
}

class Q1 {
  
  private int one;
  private int two;
  
  public Q1() {
    one = 1;
    two = 2;
  }
  
  public int changeOne() {
    one++;
    return one;
  }
  
  private int changeTwo() {
    two++;
    return two;
  }
}