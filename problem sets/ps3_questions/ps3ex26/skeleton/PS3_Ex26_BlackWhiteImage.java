/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #26: PS3_Ex26_BlackWhiteImage.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class BlackWhiteImage {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the image: ");
    int size = sc.nextInt();
    int[][] mtx = new int[size][size];
    System.out.println("Enter image:");
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size; column++) {
        mtx[row][column] = sc.nextInt();
      }
    }
    System.out.print("Enter choice:\n(1) flip\n(2) rotate\n");
    int choice = sc.nextInt();

    System.out.println("Original image:");
    printImg(mtx);
    if (choice == 1) {
      System.out.println("Flipped image:");
      flip(mtx);
      printImg(mtx);
    } else {
      System.out.println("Rotated image:");
      rotate(mtx);
      printImg(mtx);
    }

  }

  public static void flip(int[][] img) {
    int size = img.length;
    int[][] oriImg = new int[size][size];

    for (int column = 0; column < size; column++) {
      for (int row = 0; row < size / 2; row++) {
        int temp = img[row][column];
        img[row][column] = img[(size - 1) - row][column];
        img[(size - 1) - row][column] = temp;
      }
    }

  }

  public static void rotate(int[][] img) {
    int size = img.length;
    // transpose the image
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        int temp = img[i][j];
        img[i][j] = img[j][i];
        img[j][i] = temp;
      }
    }
    // reverse image
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size / 2; column++) {
        int temp = img[row][column];
        img[row][column] = img[row][(size - 1) - column];
        img[row][(size - 1) - column] = temp;
      }
    }
  }

  public static void printImg(int[][] img) {
    for (int row = 0; row < img.length; row++) {
      for (int column = 0; column < img[0].length; column++) {
        System.out.print(img[row][column] + " ");
      }
      System.out.println();
    }
  }
}