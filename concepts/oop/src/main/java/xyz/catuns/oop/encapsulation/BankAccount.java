package xyz.catuns.oop.encapsulation;

public class BankAccount {

    private double balance;  // private instance variable
    private String accountNumber;

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.balance);
    }
}
