/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #09: PS4_Ex09_Fraction.java
 * 
 * A class to describe Fraction. A fraction has two attributes:
 * numerator and denominator.
 * 
 * Author: Zhou Lifeng
 */

class Fraction {
  
  // Attributes
  private int numer, denom;
  
  // Constructor
  public Fraction(int numerator, int denominator) {
    numer = numerator;
    denom = denominator;
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
    
    // assume div will not be zero
    int div = euclidGcd(Math.abs(numer), Math.abs(denom));
    
    return new Fraction(numer/div, denom/div);
  }
  
  // Add this Fraction object with another and return
  // the sum as a new Fraction object in simplified form
  public Fraction add(Fraction another) {
    
    // use of 'this' keyword is optional here and its purpose is to
    // improve the readability of the code.
    // 'this' means this object (host object which invokes this method)        
    int numerator = this.numer * another.denom + this.denom * another.numer;
    int denominator = this.denom * another.denom;
    
    return new Fraction(numerator, denominator).simplify();
  }
  
  // Return 'this' - 'another' as a new Fraction object
  public Fraction minus(Fraction another) {
    
    int numerator = this.numer * another.denom - this.denom * another.numer;
    int denominator = this.denom * another.denom;
    
    return new Fraction(numerator, denominator).simplify();
  }
  
  // Return 'this' * 'another' as a new Fraction object
  public Fraction times(Fraction another) {
    
    int numerator = this.numer * another.numer;
    int denominator = this.denom * another.denom;
    
    return new Fraction(numerator, denominator).simplify();
  }
  
  // Return 'this' / 'another' as a new Fraction object
  public Fraction divide(Fraction another) {
    
    int numerator = this.numer * another.denom;
    int denominator = this.denom * another.numer;
    
    if (denominator < 0) {  // ensure denominator is positive
      numerator = -numerator;
      denominator = -denominator;
    }
    
    return new Fraction(numerator, denominator).simplify();
  }
  
  // Return "numerator/denominator"
  public String toString() {
    return numer + "/" + denom;
  }
  
  // Check if this object equals another
  public boolean equals(Fraction another) {
    
    Fraction frac1 = this.simplify();
    Fraction frac2 = another.simplify();
    
    return frac1.numer == frac2.numer && frac1.denom == frac2.denom;
  }
  
  // Check if this object is larger than another
  public boolean largerThan(Fraction another) {
    return (double)this.numer/denom > (double)another.numer/denom;
  }
}