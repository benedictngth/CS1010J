/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #27: PS2_Ex27_ReverseNumber.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;
import java.lang.*;

class ReverseNumber {
  public static void main(String[] args) {

    System.out.print("Enter the range: ");
    Scanner sc = new Scanner(System.in);
    int lower = sc.nextInt();
    int upper = sc.nextInt();

    System.out.println("There are " + countReverse(lower, upper) + " reverse numbers.");
  }

  // Count the number of reverse integers in the range [low, high]
  public static int countReverse(int low, int high) {
    int sum = 0;
    for (int i = low; i <= high; i++) {
      if (isReverse(i)) {
        sum++;
      }
    }
    return sum;
  }

  // Check whether a number equals to its reverse
  public static boolean isReverse(int num) {
    int originalNum = num;
    int place = intLength(num);
    int digit;
    int reverseNum = 0;
    while (num != 0) {
      digit = num % 10;
      reverseNum += digit * Math.pow(10, place - 1); // putting it in the correct digit place
      num /= 10;
      place--;
    }
    return originalNum == reverseNum; // stub, to be replaced by your code
  }

  public static int intLength(int num) {
    int length = 0;
    while (num != 0) {
      num /= 10;
      length++;
    }
    return length;
  }
}