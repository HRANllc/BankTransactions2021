package com.assignment.BankTransactions;

import java.util.Scanner;
public class Bank extends BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        BankAccount acct = new BankAccount();
        int option;
        do {
            System.out.println("Please choose 1.Account Balance 2.Deposit 3.Withdraw 4. Exit");
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Your account balance is : " + acct.balance);
                    break;
                case 2:
                    System.out.println("Please enter the deposit amount: ");
                    double m = input.nextDouble();
                    acct.deposit(m);
                    break;
                case 3:
                    System.out.println("Please enter the withdraw amount: ");
                    m = input.nextDouble();
                    acct.withdraw(m);
                    break;
                case 4:
                    System.out.println("Exit from the Bank Account.");
                    break;
                default:
                    System.out.println("Input error, please try again.");
            }
        }while(option !=4);
    }
}
