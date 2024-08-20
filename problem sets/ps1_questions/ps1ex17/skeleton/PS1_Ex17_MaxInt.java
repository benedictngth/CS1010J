/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #17: PS1_Ex17_MaxInt.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;

class MaxInteger {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.print("Enter three integers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    System.out.println("Maximum input integer is " + getMax(a, b, c));
  }

  // returns the max integer among the 3 values
  public static int getMax(int num1, int num2, int num3) {
    if (num1 > num2 && num1 > num3) {
      return num1;
    } else if (num2 > num1 && num2 > num3) {
      return num2;
    } else {
      return num3;
    }
  }
}