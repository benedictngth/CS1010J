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
  private Fraction simplify() {
    int numer = this.numer;
    int denom = this.denom;
    boolean negative = false;
    if (numer < 0) {
      numer = -numer;
      negative = true;
    } else if (denom < 0) {
      denom = -denom;
      negative = true;
    }
    while (euclidGcd(numer, denom) != 1) {
      int gcd = euclidGcd(numer, denom);
      numer /= gcd;
      denom /= gcd;
    }
    if (negative) {
      return new Fraction(-numer, denom);
    }
    return new Fraction(numer, denom);

  }

  // Add this Fraction object with another and return
  // the sum as a new Fraction object in simplified form
  public Fraction add(Fraction another) {
    int newDenom = this.denom * another.denom;
    int newNumer = this.numer * (another.denom) + another.numer * (this.denom);
    return new Fraction(newNumer, newDenom).simplify();
  }

  // Return 'this' - 'another' as a new Fraction object
  public Fraction minus(Fraction another) {
    int newDenom = this.denom * another.denom;
    int newNumer = this.numer * another.denom - another.numer * this.denom;

    return new Fraction(newNumer, newDenom).simplify();
  }

  // Return 'this' * 'another' as a new Fraction object
  public Fraction times(Fraction another) {
    int newNumer = this.numer * another.numer;
    int newDenom = this.denom * another.denom;

    return new Fraction(newNumer, newDenom).simplify();
  }

  // Return 'this' / 'another' as a new Fraction object
  public Fraction divide(Fraction another) {
    int newNumer = this.numer * another.denom;
    int newDenom = this.denom * another.numer;

    return new Fraction(newNumer, newDenom).simplify();
  }

  // return "numerator/denominator"
  public String toString() {
    return this.numer + "/" + this.denom; // stub
  }

  // Check if this object equals another
  public boolean equals(Fraction another) {
    Fraction thisSimplify = this.simplify();
    Fraction anotherSimplify = another.simplify();

    return (thisSimplify.numer == anotherSimplify.numer && thisSimplify.denom == anotherSimplify.denom);
  }

  // Check if this object is larger than another
  public boolean largerThan(Fraction another) {
    return this.numer * another.denom > another.numer * this.denom;
  }
}