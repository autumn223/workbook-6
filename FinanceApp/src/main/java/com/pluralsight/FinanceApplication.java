package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12500);
        Valuable account2 = new BankAccount(1500);

        account1.deposit(100);

        System.out.println("Account1 Value: " + account1.getValue());
        System.out.println("Account2 Value: " + account2.getValue());

        Portfolio portfolio = new Portfolio("Retirement", "Pam");
        portfolio.add(account1);
        portfolio.add(new Jewelry("Gold Ring", 18));
        portfolio.add(new Gold(25));
        portfolio.add(new House(2001, 3000, 4));
        portfolio.add(new CreditCard(5000));

        System.out.println("Portfolio Total Value: " + portfolio.getValue());
    }
}