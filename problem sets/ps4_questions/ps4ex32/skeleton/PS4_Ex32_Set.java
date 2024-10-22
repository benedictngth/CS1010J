/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #32: PS4_Ex32_Set.java
 * 
 * A Set has two attributes: an array used to store value and a 'size'
 * that indicates the number of data in the Set.
 * 
 * <Type your name here>
 */

import java.util.*;

class Set {
  
  private int size;     // the number of data in a set
  private int[] values; // a collection of data
  
  public Set(int num) {
    
  }
  
  // Add data to the back (first empty slot) of the set
  public void add(int data) {
    
  }
  
  // Return true if data exists in the set, or false otherwise
  public boolean contains(int data) {
    
    return false;  // stub
  }
  
  // Return the number of integers in this set 
  public int getSize() {
    return 0;  // stub
  }
  
  // Check if this set is a subset of another set
  public boolean isSubsetOf(Set another) {
    
    return false;  // stub
  }
  
  // Check if 'this' set has the same content as 'another' set
  public boolean equals(Set another) {
    
    return false;  // stub
  }
  
  // Return string representation of values in the Set.
  // Format: e.g. "[1, 2, 3]"
  public String toString() {
    return "";  // stub
  }
}