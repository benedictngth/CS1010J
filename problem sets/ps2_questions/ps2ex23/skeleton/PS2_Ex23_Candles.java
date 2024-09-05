/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #23: PS2_Ex23_Candles.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;

class Candles {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter n, number of candles: ");
    int n = sc.nextInt();

    System.out.print("Enter k, number of residuals to make a new candle: ");
    int k = sc.nextInt();

    int burnCandle = 0;

    // repeats while there are enough candles to make a new residual candle
    // while (n >= k) { while total number is enough to produce a new residual
    // n -= k; // subtract residual
    // n++; //add residual candle
    // burnCandle += k; add total candles burnt

    // }
    // burnCandle += n; add excess candles burnt

    int totalCandles = n;
    int leftoverWax = n;

    // Burn the candles and recycle the wax to create new candles
    while (leftoverWax >= k) { // stops when not enough leftOver to produce new candles
      int newCandles = leftoverWax / k; // new candles being produced by residual
      totalCandles += newCandles; // add news candles
      leftoverWax = leftoverWax % k + newCandles; // new leftOver by residual
    }

    System.out.println("Peter will burn this number of candles: " + totalCandles);
  }
}