/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #04: PS4_Ex04_Voucher.java
 * 
 * A voucher has three attributes: name (word),
 * face value (int) and amount of vouchers (int)
 * 
 * <Type your name here>
 */

class Voucher {

  private String voucherName;
  private int voucherValue, voucherAmt;

  // Constructor
  public Voucher(String voucherName, int voucherValue, int voucherAmt) {
    this.voucherName = voucherName;
    this.voucherValue = voucherValue;
    this.voucherAmt = voucherAmt;

  }

  // Return name of a voucher
  public String getName() {
    return this.voucherName;
  }

  // Return face value of a voucher
  public int getValue() {
    return this.voucherValue;
  }

  // Return the number of vouchers
  public int getAmt() {
    return this.voucherAmt;
  }

  // Compute the number of vouchers to use given a price
  // such that there is no overpay
  public int useVoucher(int price) {
    int voucherUsed = 0;
    while (price >= this.voucherValue) {
      price -= this.voucherValue;
      voucherUsed++;
    }
    return voucherUsed;
  }
}