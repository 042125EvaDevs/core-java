package xyz.catuns.eva.inheritance;

public class CreditCardPayment implements Payment {

  private double availableCredit;

  private double purchaseTotal;
  @Override
  public double processPayment() {
    if (availableCredit > 0 && purchaseTotal <= availableCredit){
      availableCredit = availableCredit - purchaseTotal;
    }
    return availableCredit;
  }
}
