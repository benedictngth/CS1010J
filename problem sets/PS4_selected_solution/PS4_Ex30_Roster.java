/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #30: PS4_Ex30_Roster.java
 * 
 * This program reads student number and major, and prints
 * out the student roster in ascending order of student matric.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class Roster {
  
  public static void main(String[] args) {
    
    // read student info
    Student[] roster = readRoster();
    
    // sort roster accoding to ascending order of  student number
    sortRoster(roster);
    
    // print roster
    printRoster(roster);
  }
  
  // Read matric and major of students and return an array of Student objects.
  public static Student[] readRoster() {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number of students in class: ");
    int size = scanner.nextInt();
    
    Student[] roster = new Student[size];
    
    System.out.println("Enter student number and major of " + size + " students:");
    
    String matric, major;
    for (int i = 0; i < size; i++) {
      matric = scanner.next();
      major = scanner.nextLine().trim();
      roster[i] = new Student(matric, major);
    }
    
    return roster;
  }
  
  // Sort roster according to ascending order of matric
  public static void sortRoster(Student[] roster) {
    
    for (int end = roster.length-1; end > 0; end--) {
      for (int i = 0; i < end; i++) { // one pass
        if ( roster[i].getStuNumber().compareTo(roster[i+1].getStuNumber()) > 0 ) {  // disorder
          Student swap = roster[i]; // swap
          roster[i] = roster[i+1];
          roster[i+1] = swap;
        }
      }  // end inner for loop
    }  // end outer for loop
  }
  
  // Print the roster
  public static void printRoster(Student[] roster) {
    System.out.println("Sorted list:");
    for (int i = 0; i < roster.length; i++) {
      System.out.println(roster[i]);
    }
  }
}