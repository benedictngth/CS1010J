/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #24: PS2_Ex24_Tray.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;

class Tray {

  public static void main(String[] args) {
    double length, width, perimeter;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of tray: ");
    length = sc.nextDouble();
    width = sc.nextDouble();
    // always fold the longer side to reduce the total perimeter
    for (int fold = 0; fold < 3; fold++) {
      if (length >= width) {
        length /= 2;
      } else {
        width /= 2;
      }
    }

    System.out.println("Minimum perimeter after folding = " + (2 * length + 2 * width));
  }
}