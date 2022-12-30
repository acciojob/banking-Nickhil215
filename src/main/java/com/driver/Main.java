package com.driver;

public class Main {
    public static void main(String[] args) {
        SavingsAccount nik=new SavingsAccount("Nikhil",5000,500,4);

        System.out.println(nik.getSimpleInterest(1));
        System.out.println(nik.getCompoundInterest(2,1));

    }
}