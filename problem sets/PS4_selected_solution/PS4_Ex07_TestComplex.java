/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #07: PS4_Ex07_TestComplex.java
 * 
 * This program does addition, minus, multiplication and division
 * on two complex numbers.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class TestComplex {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int real, imag; // real and imaginary part
    
    real = scanner.nextInt();
    imag = scanner.nextInt();
    
    Complex comp1 = new Complex(real, imag);
    
    System.out.println("Complex number " + comp1 + " created");
    
    String cmd = scanner.next();
    
    while ( !cmd.equals("q") ) {
      real = scanner.nextInt();
      imag = scanner.nextInt();
      Complex comp2 = new Complex(real, imag);
      
      // or cmd.equals("+") ... equals("-")...
      switch (cmd.charAt(0)) {
        case '+':
          comp1.add(comp2);
          System.out.println("After addition: " + comp1);
          break;
        case '-':
          comp1.minus(comp2);
          System.out.println("After subtraction: " + comp1);
          break;
        case '*':
          comp1.multiple(comp2);
          System.out.println("After multiplication: " + comp1);
          break;
        case '/':
          comp1.divide(comp2);
          System.out.println("After division: " + comp1);
          break;
      }
      cmd = scanner.next();  // read next command
    }
  }
}