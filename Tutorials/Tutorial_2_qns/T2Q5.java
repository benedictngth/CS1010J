import java.util.*;

class T2Q5 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter two values: ");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();      
    
    if (num1/num2 < 90.2) {
      if (num1/num2 < 32.2) {
        System.out.println("Paper");
      } else if (num1/num2 >= 45.8) {
        System.out.println("Ruler");
      } else {
        System.out.println("Pencil");
      }
    } else {
      if (num1/num2 >= 100.0) {
        System.out.println("Unknown");
      } else if (num1/num2 < 100.0) {
        System.out.println("Eraser");
      } else {
        System.out.println("Clip");
      } 
    }
  }  // end main
}