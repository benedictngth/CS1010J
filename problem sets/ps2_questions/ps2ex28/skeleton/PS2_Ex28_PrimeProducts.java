/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #28: PS2_Ex28_PrimeProducts.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;
import java.lang.*;

class PrimeProducts {

  public static void main(String[] args) {

    // storage of prime numbers
    // divide by prime numbers in ascending order while number != 1

    System.out.print("Enter integer: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num < 0) {
      System.out.print(num + " = -1");
      num = -num;
    } else {
      System.out.print(num + " = 1");
    }
    // while the number is divisible by to for cases where number is even
    while (num % 2 == 0) {
      System.out.print(" * 2");
      num /= 2;
    }
    // case where num is odd and is a square number at the end or not
    for (int i = 3; i <= Math.sqrt(num); i += 2) {
      while (num % i == 0) {
        System.out.print(" * " + i);
        num /= i;
      }
    }
    // remaining prime number
    if (num > 1) {
      System.out.print(" * " + num);
    }
    System.err.println();

  }
}