/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #18: PS4_Ex18_DNA.java
 * 
 * This program contains two parts:
 *     Part (a): A method to compute the pair-wise Hamming
 *     distances between N strings.
 *     Part (b): A method to check whether each of the N
 *     strings is a rotation of some other string.
 * 
 * <Type your name here>
 */

import java.util.*;

class DNA {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of DNA strings: ");
    
    int i = 0;
    
    System.out.print("Enter string " + i + ": "); 
    
    System.out.println("The Hamming distance of pair " + i + " is: " );
    
    System.out.println("String " + i + " is a rotation of another string");
    
    System.out.println("String " + i + " is not a rotation of any other string");
  }
  
  // Return Hamming distances between all pairs of two strings
  public static int[] hammingDistances(String[] dna) {
    
    int[] dist = new int[1];  // stub
    
    
    return dist;  // stub
  }
  
  // Compute Hamming distance between str1 and str2
  public static int computeDistance(String str1, String str2) {
    
    return 0;  // stub
  }
  
  // Check pair-wise rotations between all strings
  public static boolean[] isRotation(String[] dna) {
    
    boolean[] rotation = new boolean[1];  // stub
    
    
    return rotation;  // stub
  }
}