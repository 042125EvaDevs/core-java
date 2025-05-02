package xyz.catuns.eva.inheritance;

public class PayPalPayment implements Payment{

  private double balance;
  private double purchaseTotal;
  @Override
  public double processPayment() {
    if (balance > 0 && purchaseTotal <= balance){
      balance = balance - purchaseTotal;
    }
    return balance;
  }
}
