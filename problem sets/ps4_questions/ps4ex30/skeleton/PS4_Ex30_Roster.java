/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #30: PS4_Ex30_Roster.java
 * 
 * This program reads student number and major, and prints
 * out the student roster in ascending order of student matric.
 * 
 * <Type your name here>
 */

import java.util.*;

class Roster {
  
  public static void main(String[] args) {
    
    // read student info
    Student[] roster = readRoster();
    
    // sort roster accoding to ascending order of student number
    sortRoster(roster);
    
    // print roster
    printRoster(roster); 
  }
  
  // Read student number and major of students and return an array of Student objects.
  public static Student[] readRoster() {
    
    System.out.print("Enter the number of students in class: ");
    
    Student[] roster = new Student[1];  // stub
    
    System.out.println("Enter student number and major of " + " students:");
    
    return roster;
  }
  
  // Sort roster according to ascending order of matric
  public static void sortRoster(Student[] roster) {
    
    
  }
  
  // Print the roster
  public static void printRoster(Student[] roster) {
    System.out.println("Sorted list:");
    for (int i = 0; i < roster.length; i++) {
      System.out.println(roster[i]);
    }
  }
}