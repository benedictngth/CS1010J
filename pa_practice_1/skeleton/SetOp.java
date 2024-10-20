/*
 * CS1010J PA Practice Paper 1 Ex1
 * SetOp.java
 * 
 * Your student number: A
 * 
 * Write a short and meaningful program description below:
 * 
 * 
 * 
 */

import java.util.*;

class SetOp {
  
  public static void main(String[] args) {
    /*******************************************************
      * main method is complete and you MUST NOT change it *
      *******************************************************/
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
    /**********************************************************
      * readSet method is complete and you MUST NOT change it *
      **********************************************************/   
    System.out.print("Enter the number of integers in set " + id + ": ");
    int num = input.nextInt();
    int[] set = new int[num];
    System.out.print("Enter set " + id + ": ");
    for (int i = 0; i < num; i++) {
      set[i] = input.nextInt();
    }
    
    return set;
  }
  
  /******* Write your code below this line *******/
  
  // <Write a short description of the method here>
  public static int countIntersection(int[] setA, int[] setB) {
    
    return 0;
  }
  
  
  // <Write a short description of the method here>
  public static int[] returnComplements(int[] setA, int[] setB) {
    
    int commonInts = countIntersection(setA, setB);
    int[] setC = new int[setA.length - commonInts];
    
    
    return setC;
  }
}