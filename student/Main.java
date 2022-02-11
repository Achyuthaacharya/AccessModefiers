package com.student;

import com.company.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Student name");
        Account student = new Account(input.next());
        System.out.println("Enter 1 for deposit or 2 for withdrawal ");
        int option=input.nextInt();
        if (option==1) {
            System.out.println("Enter amount to be deposited ");
            student.deposit(input.nextDouble());
        }else {
            System.out.println("Enter amount for withdrawal");
            student.withDraw(input.nextDouble());
        }
        //method is protected
       // student.above();

    }
}
