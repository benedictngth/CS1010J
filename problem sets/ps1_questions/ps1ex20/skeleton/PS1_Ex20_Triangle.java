/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #20: PS1_Ex20_Triangle.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;

class Triangle {

  public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    // check whether it is a triangle
    if (a + b <= c || a + c <= b || b + c <= a) {
      System.out.println("Not a triangle");
    } else if (a == b && b == c) {
      System.out.println("Equilateral");
    } else if ((a == b) || (a == c) || (b == c)) {
      System.out.println("Isosceles");
    } else {
      System.out.println("Scalene");
    }
  }

}