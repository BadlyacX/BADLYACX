package com.badlyac.SimpleATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("1234", "Gary Chang", 1000);

        while (true) {
            System.out.println("Welcome to Simple ATM. Please choose an action: (deposit/withdraw/balance)");
            String action = scanner.nextLine();

            try {
                if (action.equalsIgnoreCase("deposit")) {
                    System.out.print("Enter the amount to deposit: ");
                    account.deposit(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Deposit successful!");
                } else if (action.equalsIgnoreCase("withdraw")) {
                    System.out.print("Enter the amount to withdraw: ");
                    if (account.withdraw(Integer.parseInt(scanner.nextLine())))
                        System.out.println("Withdraw successful!");

                } else if (action.equalsIgnoreCase("balance")) {
                    System.out.println("Your balance is: " + account.getBalance());
                } else if (action.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    scanner.close();
                    break;
                } else {
                    System.out.println("Invalid action. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
