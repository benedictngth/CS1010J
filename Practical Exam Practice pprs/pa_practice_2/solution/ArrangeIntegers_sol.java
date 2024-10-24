/*
 * CS1010J PA Practice Paper 2 Ex1
 * ArrangeIntegers.java
 * 
 * This program rearranges a given array such that negative integers (if any)
 * appears before zeroes (if any) and positive integers (if any). It also checks
 * if the array contains duplicate integers.
 * 
 * Written by Zhou Lifeng
 */

import java.util.*;

class ArrangeIntegers {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of integers: ");
    int size = sc.nextInt();
    
    int[] arr = new int[size];
    
    System.out.print("Enter " + size + " integers: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    sc.close();  // just to avoid compilation warning from DrJava
    
    if ( containsDuplicate(arr) ) {
      System.out.println("Array contains duplicate integer");
    } else {
      System.out.println("Array doesn't contain duplicate integer");
    }
    
    rearrange(arr);
    
    System.out.println("Rearranged array: " + Arrays.toString(arr));
  }
  
  
  // Return true if arr contains at least one
  // duplicate integer, or false otherwise
  public static boolean containsDuplicate(int[] arr) {
    
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    } 
    return false;
  }
  
  
  // Move negative integers to the front and positive
  // integers to the back, but preserve their relative orders.
  // Version 1: multiple single loops but need extra arrays
  public static void rearrange(int[] arr) {
    
    int[] copy = new int[arr.length];
    // make a copy of the array
    for (int i = 0; i < copy.length; i++) {
      copy[i] = arr[i];
    }
    
    int idx = 0;
    
    // copy back negative integers (if any)
    for (int i = 0; i < copy.length; i++) {
      if (copy[i] < 0) {
        arr[idx] = copy[i];
        idx++;
      }
    }
    
    // copy back zeroes (if any)
    for (int i = 0; i < copy.length; i++) {
      if (copy[i] == 0) {
        arr[idx] = copy[i];
        idx++;
      }
    }
    
    // copy back positive integers (if any)
    for (int i = 0; i < copy.length; i++) {
      if (copy[i] > 0) {
        arr[idx] = copy[i];
        idx++;
      }
    }
  }
  
  
  // Version 2: multiple single loops and two extra arrays
  public static void rearrange_v2(int[] arr) {
    
    int size = arr.length;
    
    int[] neg = new int[size];
    int[] pos = new int[size];
    
    // number of negative and positive integers
    int numNeg = 0, numPos = 0;
    
    for (int i = 0; i < size; i++) {
      if (arr[i] < 0) {
        neg[numNeg] = arr[i];
        numNeg++;
      } else if (arr[i] > 0) {
        pos[numPos] = arr[i];
        numPos++;
      }
    }
    
    // fill in negative integers (if any)
    for (int i = 0; i < numNeg; i++) {
      arr[i] = neg[i];
    }
    
    // there might be multiple zeros
    int numZeros = size - numNeg - numPos;
    for (int i = 0; i < numZeros; i++) {
      arr[i+numNeg] = 0;
    }
    
    // fill in positive integers (if any)
    for (int i = 0; i < numPos; i++) {
      arr[i+numNeg+numZeros] = pos[i];
    }
  }
  
  
  // Version 3: nested loop but in-place algorithm (i.e. no additional array)
  public static void rearrange_v3(int[] arr) {
    
    int size = arr.length, swap;
    boolean done = false;
    
    while (!done) {
      done = true;
      for (int i = 0; i < size-1; i++) {
        if ( (arr[i]>0 && arr[i+1]<=0) || (arr[i]==0 && arr[i+1]<0) ) {
          swap = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = swap;
          done = false;
        }
      }
    }
  }
}