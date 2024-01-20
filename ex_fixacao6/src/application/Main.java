package application;

import entities.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Account account;

        System.out.print("Digite o número da conta:");
        int accountNumber = sc.nextInt();

        System.out.print("Digite o nome do titular:");
        String holder = sc.next();

        System.out.print("Fará um depósito inicial? (s/n): ");
        String answer = sc.next();
        if(answer.equals("s")){
            System.out.print("Informe o valor:");
            double balance = sc.nextDouble();

            account = new Account(accountNumber, holder, balance);
        }else{
             account = new Account(accountNumber, holder);
        }

        System.out.print("Digite um valor de depósito: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        account.printAccountData();

        System.out.print("Digite um valor para saque: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        account.printAccountData();

       sc.close();
    }

}
