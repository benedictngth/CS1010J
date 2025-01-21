/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #28: PS4_Ex28_Addition.java
 * 
 * This program computes the sum of two integers in a recursive way.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Addition {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter two positive integers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    
    System.out.println("Sum = " + add(num1, num2, 0));
  }
  
  // Add two integers recursively by adding digits in corresponding
  // columns together with carry.
  public static int add(int num1, int num2, int carry) {
    
    // base case: one of the operands is 0
    // can handle the case two integers are of different length
    if (num1 == 0) {
      return num2 + carry;
    } else if (num2 == 0) {
      return num1 + carry;
    }
    
    int sum = num1%10 + num2%10 + carry;  // add last two digits
    carry = sum / 10;  // sum may be a two-digit integer
    sum %= 10;
    
    return sum + 10 * add(num1/10, num2/10, carry);
  }
}