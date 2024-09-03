/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #22: PS2_Ex22_Goldbach.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;

class Goldbach {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    if (testConjecture(n)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

  }

  // Verify that every even number in range [4, n]
  // an be expressed as the sum of two primes.
  public static boolean testConjecture(int n) {
    int firstDigit = 1, secondDigit;
    while (firstDigit <= n / 2) {
      secondDigit = n - firstDigit;
      if (isPrime(firstDigit) && isPrime(secondDigit)) {
        return true;
      }
      firstDigit++;
    }
    return false; // stub, to be replaced by your code
  }

  // Check if num is prime or not, return true if so, false otherwise.
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