/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #21: PS2_Ex21_Legendre.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;
import java.lang.*;

class Legendre {

  public static void main(String[] args) {

    System.out.print("Enter n: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (testConjecture(n)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    ;

  }

  // Verify if there is at least one prime number in
  // each range (1^2 to 2^2), (2^2 to 3^2), (n^2 to (n+1)^2)
  public static boolean testConjecture(int n) {
    for (int i = 1; i < n; i++) {
      if (!hasPrime((int) Math.pow(n, 2), (int) Math.pow(n + 1, 2))) {
        return false;
      }
    }
    return true; // all contains a prime
  }

  // Check whether there is any prime in range [low, high],
  // return true if so, or false otherwise
  public static boolean hasPrime(int low, int high) {
    for (int i = low; i <= high; i++) {
      if (isPrime(i)) {
        return true;
      }
    }
    return false; // range does not contain a prime number
  }

  public static boolean isPrime(int num) {
    // edge cases
    if (num == 1) {
      return false;
    }
    if (num == 2 || num == 3) {
      return true;
    }
    if (num % 2 == 0 || num % 3 == 0) {
      return false;
    }
    int i = 5;
    // prime numbers are 6k +- 1
    while (i * i <= num) {
      // find all cases where num is divible by prime divisors
      if (num % i == 0 || num % i + 2 == 0) {
        return false;
      }
      i += 6;
    }
    return true;

  }

}