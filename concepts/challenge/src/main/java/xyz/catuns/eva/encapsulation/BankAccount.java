package xyz.catuns.eva.encapsulation;

public class BankAccount {

  private int acctNumber;
  private double balance;
  private String acctHolderName;

  public BankAccount(int acctNumber, double balance, String acctHolderName) {
    this.acctNumber = acctNumber;
    this.balance = balance;
    this.acctHolderName = acctHolderName;
  }

  public int getAcctNumber() {
    return acctNumber;
  }

  public void setAcctNumber(int acctNumber) {
    this.acctNumber = acctNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAcctHolderName() {
    return acctHolderName;
  }

  public void setAcctHolderName(String acctHolderName) {
    this.acctHolderName = acctHolderName;
  }
}
