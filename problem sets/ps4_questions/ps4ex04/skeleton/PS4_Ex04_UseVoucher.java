/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #04: PS4_Ex04_UseVoucher.java
 * 
 * This program helps Mr. Tan to use a couple of vouchers
 * wisely together with cash such that there is no overpay anytime.
 * 
 * <Type your name here>
 */

import java.util.*;

class UseVoucher {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter voucher name: ");
    String name = sc.nextLine();

    System.out.print("Enter voucher face value: $");
    int value = sc.nextInt();

    System.out.print("Enter the number of vouchers: ");
    int numVoucher = sc.nextInt();

    Voucher voucher = new Voucher(name, value, numVoucher);

    System.out.print("Enter the price to pay: $");
    int price = sc.nextInt();

    int voucherUsed = voucher.useVoucher(price);

    System.out.println("Use " + voucherUsed + " " + voucher.getName() + " voucher(s)");
    int cash = price - voucherUsed * voucher.getValue();
    System.out.println("Cash payment: $" + cash);
    int voucherRemain = voucher.getAmt() - voucherUsed;
    System.out.println("There remains " + voucherRemain + " voucher(s)");
  }
}