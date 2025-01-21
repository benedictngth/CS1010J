/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #30: PS4_Ex30_Student.java
 * 
 * The Student class has two attributes: student number and major, both are strings.
 * 
 * Author: Zhou Lifeng
 */

class Student {
  
  private String stuNumber, major;
  
  // Constructor
  public Student(String number, String major) {
    this.stuNumber = number;
    this.major = major;
  }
  
  // Return student number
  public String getStuNumber() {
    return stuNumber;
  }
  
  // Return string representation
  public String toString() {
    return "[" + stuNumber + ", " + major + "]";
  }
}