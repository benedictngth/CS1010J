class T1Q8 {

  public static void main(String[] args) {
    func(5);
    func(3 - 7);
  }

  public static void func(int y) {
    if (y < 0) {
      System.out.println("Nothing");
    } else {
      System.out.println("Something");
    }
  }
}