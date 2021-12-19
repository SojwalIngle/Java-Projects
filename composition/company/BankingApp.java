package com.company;

public class BankingApp {
    public static void main(String[] args) {
        Account ac = new Account("12345" , 0.0,"Sojwal" , "Sojwal@123", " 8309473829");
        System.out.println("Account number: " + ac.getNumber());
        System.out.println("Account Balance: " + ac.getBalance());
        System.out.println("Account Holder Name: " + ac.getName());
        System.out.println("Account Holder Email: " +ac.getEmail());
        System.out.println("Account Holder Phoneno: "+ ac.getPhoneno());

        ac.DepositeMponey(100);
        ac.DepositeMponey(5000);
        ac.withdrawelMoney(400);
        ac.withdrawelMoney(4000);
        ac.withdrawelMoney(800);
        ac.DepositeMponey(10000);
    }
}
