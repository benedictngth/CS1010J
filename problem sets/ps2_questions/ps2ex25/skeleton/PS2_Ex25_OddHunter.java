/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #25: PS2_Ex25_OddHunter.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class OddHunter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = sc.nextInt();
    int sum = sumOdd(n);
    while (containsOdd(sum)) {
      sum += sumOdd(sum);
    }

    System.out.println("Answer = " + sum);

  }

  public static int sumOdd(int n) {
    int sum = 0;
    while (n != 0) {
      int digit = n % 10;
      if (containsOdd((digit))) {
        sum += digit;
      }
      n /= 10;
    }
    return sum;
  }

  public static boolean containsOdd(int n) {
    while (n > 0) {
      int digit = n % 10;
      if ((digit % 2) == 1) {
        return true;
      }
      n /= 10;
    }
    return false;
  }
}