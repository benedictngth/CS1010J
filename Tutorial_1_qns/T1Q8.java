class T1Q8 {
  
  public static void main(String[] args) {
    void func(5);
    void func(3-7);
  }
  
  public static void func(y) {
    if (y < 0) {
      System.out.println("Nothing");
    } else {
      System.out.println("Something");
    }
  }
}