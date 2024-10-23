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
    this.numer = numerator;
    this.denom = denominator;

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
  private Fraction simplify(Fraction fraction) {

    while (euclidGcd(fraction.numer, fraction.denom) != 1) {
      int gcd = euclidGcd(fraction.numer, fraction.denom);
      fraction.numer /= gcd;
      fraction.denom /= gcd;
    }

    return fraction;
  }

  // Add this Fraction object with another and return
  // the sum as a new Fraction object in simplified form
  public Fraction add(Fraction another) {
    int oriDenom = this.denom;
    this.denom *= another.denom;

    this.numer = this.numer * another.numer * oriDenom;

    return simplify();
  }

  // Return 'this' - 'another' as a new Fraction object
  public Fraction minus(Fraction another) {
    this.denom *= another.denom;

    this.numer = this.numer - another.numer * oriDenom;

    return simplify();
  }

  // Return 'this' * 'another' as a new Fraction object
  public Fraction times(Fraction another) {
    this.numer *= another.numer;
    this.denom *= another.denom;

    return simplify();
  }

  // Return 'this' / 'another' as a new Fraction object
  public Fraction divide(Fraction another) {
    this.numer *= another.denom;
    this.denom *= another.numer;

    return simplify();
  }

  // return "numerator/denominator"
  public String toString() {
    return this.numer + "/" + this.denom; // stub
  }

  // Check if this object equals another
  public boolean equals(Fraction another) {

    return true; // stub
  }

  // Check if this object is larger than another
  public boolean largerThan(Fraction another) {
    return false; // stub
  }
}