package com.badlyac.SimpleATM;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("You don't have enough money to withdraw");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public int getBalance() {
        return balance;
    }

}
