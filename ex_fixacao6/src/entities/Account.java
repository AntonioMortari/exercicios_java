package entities;

public class Account {

    private int accountNumber;
    private String holder;
    private double balance;

    public Account(int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }
    public Account(int accountNumber, String holder){
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = 0;
    }

    public void printAccountData(){
        System.out.printf("Conta: %d, Titular %s, Saldo: %.2f %n", this.accountNumber, this.holder, this.balance);
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value){
        this.balance = (this.balance - 5.00) - value;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }


}
