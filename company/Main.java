package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the holder name ");
        Account name = new Account(input.next());
        System.out.println("Enter 1 for deposit or 2 for withdrawal ");
        int option=input.nextInt();
        if (option==1) {
            System.out.println("Enter amount to be deposited ");
            name.deposit(input.nextDouble());
        }else {
            System.out.println("Enter amount for withdrawal");
            name.withDraw(input.nextDouble());
        }
        name.above();
    }
}
