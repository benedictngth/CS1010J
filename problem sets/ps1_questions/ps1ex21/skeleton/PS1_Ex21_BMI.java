/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #21: PS1_Ex21_BMI.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;
import java.lang.Math;

class BMI {

  public static void main(String[] args) {
    int gender;
    double height, weight;
    Scanner sc = new Scanner(System.in);
    // getting inputs from user
    System.out.print("Enter your gender (0 for female, 1 for male): ");
    gender = sc.nextInt();
    System.out.print("Enter your weight (kg) and height (m): ");
    weight = sc.nextDouble();
    height = sc.nextDouble();
    int bodyType = bodyType(gender, weight, height);
    if (bodyType == -1) {
      System.out.println("Stuff yourself with more food!");
    } else if (bodyType == 0) {
      System.out.println("Great! Maintain it!");
    } else {
      System.out.println("Time to join the gym!");
    }
  }

  // <Write a short description of the method here>
  public static int bodyType(int gender, double weight, double height) {
    double bmi = weight / (Math.pow(height, 2));
    if (gender == 0) {
      return bmi <= 19.0 ? -1 : bmi > 24.0 ? 1 : 0;
    } else {
      return bmi <= 20.0 ? -1 : bmi > 25.0 ? 1 : 0;

    }
  }
}