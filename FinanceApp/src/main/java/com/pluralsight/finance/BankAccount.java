package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private double balance;

    public BankAccount(double initial) {
        this.balance = initial;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}

