/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #25: PS1_Ex25_Packing.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.Scanner;
import java.lang.Math;

class Packing {

  public static void main(String[] args) {
    int trayLength, trayWidth, slabLength, slabWidth;
    int maxTileHori, maxTileVert;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of tray: ");
    trayLength = sc.nextInt();
    trayWidth = sc.nextInt();

    System.out.print("Enter size of slab: ");
    slabLength = sc.nextInt();
    slabWidth = sc.nextInt();

    maxTileHori = (trayLength / slabWidth) * (trayWidth / slabLength);

    maxTileVert = (trayLength / slabLength) * (trayWidth / slabWidth);

    if (area(trayLength, trayWidth) > area(slabLength, slabWidth)) {

      int minArea = maxTileHori > maxTileVert ? area(trayLength, trayWidth) - maxTileHori * area(slabLength, slabWidth)
          : area(trayLength, trayWidth) - maxTileVert * area(slabLength, slabWidth);

      System.out.println("Minimum unused area = " + minArea);
    }

  }

  public static int area(int length, int width) {
    return length * width;
  }
}