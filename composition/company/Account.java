package com.company;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String Phoneno;

    public Account(String Number, double Balance, String Name, String Email, String phoneno) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.Phoneno = phoneno;
    }

    //Deposite money
    public void DepositeMponey(double DepositedMoney) {
        this.Balance += DepositedMoney;
        System.out.println("Deposite is successful new balance is: " + this.Balance);
    }

    //withdraw money
    public void withdrawelMoney(double withdrawelMoney) {
        if (this.Balance - withdrawelMoney < 0) {
            System.out.println("Withdrawal unsuccessful only  " + this.Balance + " is left");
        } else {
            this.Balance -= withdrawelMoney;
            System.out.println("Withdrawal successful, current balnace is: " + this.Balance);
        }
    }


    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhoneno(String Phoneno) {
        this.Phoneno = Phoneno;
    }

    public String getNumber() {
        return this.Number;
    }

    public double getBalance() {
        return this.Balance;
    }

    public String getName() {
        return this.Name;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPhoneno() {
        return this.Phoneno;
    }
}
