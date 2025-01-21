/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #11: PS4_Ex11_ICCheckCode.java
 * 
 * This program reads a NRIC number and produces its check code.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class ICCheckCode {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter prefix of NRIC: ");
    char prefix = sc.nextLine().toUpperCase().charAt(0);
    
    System.out.print("Enter 7-digit of NRIC number: ");
    int num = sc.nextInt();
    
    char code = generateCode(prefix, num);
    
    System.out.println("Check code is " + code);
  }
  
  // Generate check code according to the given algorithm
  public static char generateCode(char prefix, int num) {
    
    int total = 0;
    int[] weight = {2, 3, 4, 5, 6, 7, 2};
    
    for (int i = 0; i < 7; i++) {
      total += weight[i] * (num%10);
      num /= 10;
    }

    if (prefix == 'T') {
      total = total + 4;
    }
    
    int index = total % 11;
    
    return "JZIHGFEDCBA".charAt(index);
  }
}