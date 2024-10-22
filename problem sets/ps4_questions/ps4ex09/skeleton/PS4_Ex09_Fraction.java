/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #09: PS4_Ex09_Fraction.java
 * 
 * A class to describe Fraction. A fraction has two attributes:
 * numerator and denominator.
 * 
 * <Type your name here>
 */

class Fraction {
  
  // Attributes
  private int numer, denom;
  
  // Constructor
  public Fraction(int numerator, int denominator) {
    
  }
  
  // Private helper method to calculate
  // and return greatest common divisor
  private int euclidGcd(int a, int b) {
    
    int remainder;
    while (b > 0) {
      remainder = a % b;
      a = b;
      b = remainder;
    }   
    return a;
  }
  
  // Return a new Fraction object that is simplified from 'this' object
  // 'this' (the calling) fraction object should not be modified.
  private Fraction simplify() {
    
    Fraction result = new Fraction(0, 0);  // stub
    
    
    return result;  // stub
  }
  
  // Add this Fraction object with another and return
  // the sum as a new Fraction object in simplified form
  public Fraction add(Fraction another) {
    
    Fraction result = new Fraction(0, 0);  // stub
    
    
    return result;  // stub
  }
  
  // Return 'this' - 'another' as a new Fraction object
  public Fraction minus(Fraction another) {
    
    Fraction result = new Fraction(0, 0);  // stub
    
    
    return result;  // stub
  }
  
  // Return 'this' * 'another' as a new Fraction object
  public Fraction times(Fraction another) {
    
    Fraction result = new Fraction(0, 0);  // stub
    
    
    return result;  // stub
  }
  
  // Return 'this' / 'another' as a new Fraction object
  public Fraction divide(Fraction another) {
    
    Fraction result = new Fraction(0, 0);  // stub
    
    
    return result;  // stub
  }
  
  // return "numerator/denominator"
  public String toString() {
    return "";  // stub
  }
  
  // Check if this object equals another
  public boolean equals(Fraction another) {
    
    return false;  // stub
  }
  
  // Check if this object is larger than another
  public boolean largerThan(Fraction another) {
    return false;  // stub
  }
}