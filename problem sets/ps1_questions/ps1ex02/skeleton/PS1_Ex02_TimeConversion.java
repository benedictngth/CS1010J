/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #02: PS1_Ex02_TimeConversion.java
 * 
 * This program prints out time in hours and minutes.
 * 
 * <Ng Tze Han, Benedict>
 */

import java.util.Scanner; // to use Scanner for data input

class TimeConversion {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter time in minutes: ");
    int minutes;
    int hours;

    int input = sc.nextInt();
    minutes = input % 60;
    hours = input / 60;

    System.out.println(hours + " hours and " + minutes + " minutes");
  }
}