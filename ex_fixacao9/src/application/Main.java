package application;

import entities.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas?: ");
        int n = sc.nextInt();
        double sumHeight = 0;
        Person[] people = new Person[n];

        for(int i = 0 ; i < n ; i++){
            System.out.printf("Dados da %da pessoa:%n", i);

            System.out.print("Nome: ");
            String name = sc.next();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            people[i] = new Person(name,age,height);
        }

        for(int i = 0 ; i < n ; i++){
            sumHeight += people[i].getHeight();
        }
        double heightAvg = sumHeight / n;

        System.out.printf("Altura Média: %.2f %n",heightAvg);

        sc.close();
    }

}
