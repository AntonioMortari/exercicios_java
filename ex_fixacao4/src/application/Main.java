package application;

import entities.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Salário Bruto: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        employee.printData();

        System.out.print("Porcentagem de aumento de salário: %");
        employee.increaseSalary(
                sc.nextDouble()
        );

        employee.printData();

        sc.close();

    }

}
