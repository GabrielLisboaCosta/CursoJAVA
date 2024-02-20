package trabalho7_exceptions.model.entites;

import trabalho7_exceptions.model.exceptions.DomainException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount){
        balance +=amount;
    }
    public void withdraw(double amount){
        validedWithdraw(amount);
        balance -=amount;
    }
    public void validedWithdraw(double amount){
        if(amount>withdrawLimit){
            throw new DomainException("A quantia excede o o limite de saque!");
        }
        if(amount>balance){
            throw new DomainException("Saldo insuficiente!");
        }
    }
}
