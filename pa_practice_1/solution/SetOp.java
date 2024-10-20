/*
 * CS1010J PA Practice Paper 1 Ex1
 * SetOp.java
 * 
 * This program reads two sets (A and B) of distinct integers
 * sorted in ascending order, counts the number of integers
 * in their intersection and prints the complement of B to A.
 * 
 * Author: Zhou Lifeng
 */

import java.util.*;

class SetOp {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int[] setA = readSet(input, "A");
    int[] setB = readSet(input, "B");   
    input.close();
    
    int numInts = countIntersection(setA, setB);
    System.out.println("A ^ B contains " + numInts + " integer(s)");
    
    int[] setC = returnComplements(setA, setB);
    System.out.println("A - B = " + Arrays.toString(setC));
  }
  
  
  // Read a set and return it
  public static int[] readSet(Scanner input, String id) {
    
    System.out.print("Enter the number of integers in set " + id + ": ");
    int num = input.nextInt();
    int[] set = new int[num];
    System.out.print("Enter set " + id + ": ");
    for (int i = 0; i < num; i++) {
      set[i] = input.nextInt();
    }
    
    return set;
  }
  
  
  // The intersection of A and B, denoted as A^B,
  // is a set of integers that exists in both A and B.
  // This method returns the number of integers in A^B.
  public static int countIntersection(int[] setA, int[] setB) {
    
    int commonInts = 0;
    int idxA = 0, idxB = 0;
    
    while (idxA < setA.length && idxB < setB.length) {
      if (setA[idxA] < setB[idxB]) {
        idxA++;
      } else if (setA[idxA] > setB[idxB]) {
        idxB++;
      } else { // setA[idxA] == setB[idxB]
        commonInts++;
        idxA++;
        idxB++;
      }
    }
    
    return commonInts;
  }
  
  
  // The complement of B in A, denoted as A-B,
  // is a set of integers that exists in A but not in B.
  // This method returns A-B
  public static int[] returnComplements(int[] setA, int[] setB) {
    
    int commonInts = countIntersection(setA, setB);
    int[] setC = new int[setA.length - commonInts];
    
    int idxA = 0, idxB = 0, idxC = 0;
    
    while (idxA < setA.length && idxB < setB.length) {
      if (setA[idxA] < setB[idxB]) { // copy from set A
        setC[idxC] = setA[idxA];
        idxA++;
        idxC++;
      } else if (setA[idxA] > setB[idxB]) { // compare with next
        idxB++;
      } else { // setA[idxA] == setB[idxB], skip this int
        idxA++;
        idxB++;
      }
    }
    
    while (idxA < setA.length) { // copy remaining, if any
      setC[idxC] = setA[idxA];
      idxA++;
      idxC++;      
    }
    
    return setC;
  }
}