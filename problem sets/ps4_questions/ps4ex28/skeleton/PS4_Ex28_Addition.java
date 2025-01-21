/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #28: PS4_Ex28_Addition.java
 * 
 * This program computes the sum of two integers in a recursive way.
 * 
 * <Type your name here>
 */

import java.util.*;

class Addition {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two positive integers: ");
    int int1 = sc.nextInt();
    int int2 = sc.nextInt();
    System.out.println("Sum = " + add(int1, int2, 0));
  }

  // Add two integers recursively by adding digits in corresponding
  // columns together with carry.
  public static int add(int num1, int num2, int carry) {
    if (num1 < 10) {// implicitly implied num2 <10 by assumption
      return num1 + num2 + carry;
    } else {
      int singleSum = (num1 % 10) + (num2 % 10) + carry;
      return add(num1 / 10, num2 / 10, singleSum / 10) * 10 + singleSum % 10;
    }
  }
}