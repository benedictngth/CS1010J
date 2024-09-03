/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #20: PS2_Ex20_UCard.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;

class UCard {

  public static void main(String[] args) {

    System.out.print("Enter uCard Number: ");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int checkDigit = luhnah(input);
    System.out.println("The check number is " + checkDigit);

    // no remainder when checkdigit divided by 7
    if (checkDigit % 7 == 0) {
      System.out.println("Valid");
      printBranch(input);
    } else {
      System.out.println("Invalid");
    }
  }

  // <returns check digit based on luhnah algo>
  public static int luhnah(int uCardNo) {
    int pos = 0;
    int checkSum = 0;
    while (uCardNo > 0) {
      int digit = uCardNo % 10;
      // check if its every second digit and multiply the digit
      if (pos % 2 != 0) {
        digit *= 2;
        while (digit > 0) {
          checkSum += digit % 10;
          digit /= 10;
        }
      } else {
        checkSum += digit;
      }
      uCardNo /= 10;
      pos++;
    }
    return checkSum; // stub, to be replaced by your code
  }

  // <Write a short description of the method here>
  public static void printBranch(int uCard) {
    // divide until left with first two digits
    while (uCard >= 100) {
      uCard /= 10;
    }
    if (uCard <= 35 && uCard >= 31) {
      System.out.println("Issued by East branch");
    } else if (uCard <= 55 && uCard >= 51) {
      System.out.println("Issued by West branch");
    } else {
      System.out.println("Issued by Central branch");
    }
  }
}