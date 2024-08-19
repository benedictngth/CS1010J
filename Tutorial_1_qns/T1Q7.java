import java.util.Scanner;

class T1Q7 {

  public static void Main(String[] args) {

    // ask user to enter a value into num1
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");

    int num1 = sc.nextInt();
    double num2 = num1 + 1.2; // do computation
    System.out.println("num2 = " + num2);
  }
}