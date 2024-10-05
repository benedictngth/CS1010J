/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #13: PS3_Ex13_SoftToys.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class SoftToys {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How long will the campaign last: ");
    int days = sc.nextInt();

    System.out.print("Enter type of toys in each day: ");
    int[] types = new int[days];

    for (int i = 0; i < days; i++) {
      types[i] = sc.nextInt();
    }
    int day = whichDay(types);
    if (day == -1) {
      System.out.println("Kitty is unable to collect all types of toys");
    } else {
      System.out.println("Kitty is able to collect all types of toys on day " + day);
    }

  }

  // <Write a short description of the method here>
  public static int whichDay(int[] types) {

    boolean[] collectedTypes = new boolean[5];
    if (types.length < 8) {
      return -1;
    } else {

      for (int day = 0; day < types.length; day += 2) {
        // if soft toys collect - change to true
        collectedTypes[types[day] - 1] = true;
        if (day >= 8) {
          boolean collected = true;
          for (int i = 0; i < collectedTypes.length; i++) {
            if (!collectedTypes[i]) {
              collected = false;
            }
          }
          if (collected) {
            return day;
          }
        }
      }
      return -1;
    }
  }
}