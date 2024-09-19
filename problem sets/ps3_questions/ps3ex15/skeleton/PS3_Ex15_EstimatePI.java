/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #15: PS3_Ex15_EstimatePI.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;
import java.lang.*;
import java.text.*;

class EstimatePI {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the list: ");
    int size = sc.nextInt();
    System.out.print("Enter " + size + " elements: ");

    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // stores number of pairs with no common fact
    int noCF = 0;
    int pairs = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        pairs++;
        if (gcd(arr[i], arr[j]) == 1) {
          noCF++;
        }
      }
    }
    1
    

    DecimalFormat df = new DecimalFormat("0.0000");
    double pi = Math.sqrt((double) 6 / ((double) noCF / pairs));
    System.out.println("Estimated pi = " + df.format(pi));

  }

  public static int gcd(int a, int b) {
    if (a == 0) {
      return b;
    } else {
      return gcd(b % a, a);
    }
  }
}