/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #18: PS4_Ex18_DNA.java
 * 
 * This program contains two parts:
 * Part (a): A method to compute the pair-wise Hamming
 * distances between N strings.
 * Part (b): A method to check whether each of the N
 * strings is a rotation of some other string.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class DNA {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of DNA strings: ");
    int num = sc.nextInt();
    String[] dna = new String[num];
    
    sc.nextLine();  // read and ignore <Enter> behind num
    for (int i = 0; i < num; i++) {
      System.out.print("Enter string " + i + ": "); 
      dna[i] = sc.nextLine();
    }
    
    int[] distances = hammingDistances(dna);
    
    for (int i = 0; i < distances.length; i++) {
      System.out.println("The Hamming distance of pair " + i + " is: " + distances[i]);
    }
    
    boolean[] rotation = isRotation(dna);
    
    for (int i = 0; i < rotation.length; i++) {
      if (rotation[i]) {
        System.out.println("String " + i + " is a rotation of another string");
      } else {
        System.out.println("String " + i + " is not a rotation of any other string");
      }
    }
  }
  
  // Return Hamming distances between all pairs of two strings
  public static int[] hammingDistances(String[] dna) {
    
    int len = dna.length, k = 0;
    int[] dist = new int[len * (len-1) / 2];
    
    for (int i = 0; i < len-1; i++) {
      for (int j = i+1; j < len; j++) {
        dist[k] = computeDistance(dna[i], dna[j]);
        k++;
      }
    }
    
    return dist;
  }
  
  // Compute Hamming distance between str1 and str2
  public static int computeDistance(String str1, String str2) {
    
    int countDiff = 0, len = str1.length();
    
    for (int i = 0; i < len; i++) {
      if ( str1.charAt(i) != str2.charAt(i) ) {
        countDiff++;
      }
    }
    
    return countDiff;
  }
  
  // Check pair-wise rotations between all strings
  public static boolean[] isRotation(String[] dna) {
    
    int len = dna.length;
    boolean[] rotation = new boolean[len];
    String newStr;
    
    for (int i = 0; i < len-1; i++) {
      if (rotation[i] == false) {
        newStr = dna[i] + dna[i];
        for (int j = i+1; j < len; j++) {
          // if dna[j] is a rotation of dna[i], it must appears in dna[i] + dna[i]
          // E.g. to check "CTA" is a rotation of "TAC", just check if it appears in "TACTAC"
          if ( newStr.indexOf(dna[j]) != -1 ) {
            rotation[i] = rotation[j] = true;  // symmetry!
            break;
          }
        }
      }
    }
    
    return rotation;
  }
}