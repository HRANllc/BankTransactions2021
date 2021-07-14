package com.assignment.BankTransactions;

class BankAccount {
    int accountNum = 123456789;
    double balance = 50.0;
    String name = "Dangran Li";
    String email = "123@gmail.com";
    int phoneNum = 1234567;

    public void deposit(double m) {
        if(m >= 0){
            balance += m;
            System.out.println("Deposit success.");
        }else{
            System.out.println("Deposit failure.");
        }
    }
    public void withdraw(double m) {
        if(balance >= m && m >= 0){
            balance -= m;
            System.out.println("Withdraw success.");
        }else{
            System.out.println("Withdraw failure.");
            System.out.println("The balance of costumer " + name +" is: " + balance);
        }
    }
    public void showInfo(){
        System.out.println("Costumer name: " + name);
        System.out.println("Account number: " + accountNum);
        System.out.println("Balance： " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNum);
    }
}
