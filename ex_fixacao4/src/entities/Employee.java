package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public Employee(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public void printData(){
        System.out.printf("%s, R$%.2f %n", this.name, getNetSalary());
    }


    public double getNetSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary = this.grossSalary + ((this.grossSalary * percentage) / 100);
    }

}
