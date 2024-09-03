/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #10: PS2_Ex10_Collatz.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;

class Collatz {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a natural number: ");
    int n = sc.nextInt();
    int numIterations = countIterations(n);

    System.out.println("Number of iterations = " + numIterations);
  }

  // Calculate how many rounds are needed to process n till 1
  public static int countIterations(int n) {
    int sum = 0;
    while (n != 1) {
      n = n % 2 == 0 ? n / 2 : 3 * n + 1;
      sum++;
    }

    return sum; // stub, to be replaced by your code
  }
}