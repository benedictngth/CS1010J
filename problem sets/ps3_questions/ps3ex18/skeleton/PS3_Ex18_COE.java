/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #18: PS3_Ex18_COE.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class COE {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of available COEs: ");
    int numCOE = sc.nextInt();
    System.out.print("Enter the number of bids: ");
    int numBids = sc.nextInt();

    int[] bids = new int[numBids];
    System.out.print("Enter " + " bids: ");
    for (int i = 0; i < bids.length; i++) {
      bids[i] = sc.nextInt();
    }
    sortBids(bids);
    int minBid = bids[numCOE - 1];

    if (bids[numCOE] == minBid) {
      minBid = bids[numCOE - 2]; // becomes next highest bid
    }

    // for debugging
    System.out.println(Arrays.toString(bids));

    System.out.println("COE final price this month is $" + minBid);
  }

  // Sort bids in descending order
  public static void sortBids(int[] bids) {
    int lastIndex = bids.length - 1;
    while (lastIndex > 0) {
      int lastExchangeIndex = 0;
      for (int i = 0; i < lastIndex; i++) {
        if (bids[i] < bids[i + 1]) {
          int temp = bids[i];
          bids[i] = bids[i + 1];
          bids[i + 1] = temp;
          lastExchangeIndex = i;
        }
      }
      lastIndex = lastExchangeIndex;
    }

  }
}