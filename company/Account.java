package com.company;


import java.util.Scanner;

public class Account {
    private String accountHolderName;
    private double balance;


    Scanner input=new Scanner(System.in);

    public Account(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println(amount+" deposited. Balance is now  "+this.balance);
        }else {
            System.out.println("Cannot deposit negative sum");
        }
    }

    public void withDraw(double amount){
        withdraw(amount);
    }
    private void withdraw(double amount){
        double withdraw = -amount;
        if (withdraw<0) {
            this.balance += withdraw;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else {
            System.out.println("Cannot withdraw negative sums");
        }
    }
    //protected
    protected void above(){
        System.out.println("The account holder is above 18");
    }

}
