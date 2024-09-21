/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #19: PS3_Ex19_MergeLists.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class MergeLists {

  public static void main(String[] args) {

    // Note: CodeCrunch only accepts one Scanner object per program
    Scanner sc = new Scanner(System.in);

    // read the first list through 'readList' method
    System.out.print("Number of elements in list 1? ");
    int[] list1 = readList(sc);
    // read the second list through 'readList' method
    System.out.print("Number of elements in list 2? ");
    int[] list2 = readList(sc);

    int[] list3 = new int[list1.length + list2.length];
    mergeLists(list1, list2, list3);
    System.out.println("Merged list: " + Arrays.toString(list3));
  }

  // Read elements into a list and return it
  public static int[] readList(Scanner sc) {
    int size = sc.nextInt();
    System.out.print("Enter " + size + " elements: ");
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    return arr;
  }

  // Merge list1 and list2 into list3 such that
  // elements in list3 remain in non-descending order
  public static void mergeLists(int[] list1, int[] list2, int[] list3) {
    int pos1 = 0, pos2 = 0, pos3 = 0;
    while (pos1 < list1.length && pos2 < list2.length) {
      if (list1[pos1] < list2[pos2]) {
        list3[pos3] = list1[pos1];
        pos1++;
      } else {
        list3[pos3] = list2[pos2];
        pos2++;
      }
      pos3++;
    }
    if (pos1 < list1.length) {
      while (pos1 < list1.length) {
        list3[pos3] = list1[pos1];
        pos1++;
        pos3++;
      }
    } else {
      while (pos2 < list2.length) {
        list3[pos3] = list2[pos2];
        pos2++;
        pos3++;
      }
    }
  }
}
