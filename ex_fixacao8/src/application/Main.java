package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        for(int i = 0 ; i< n ; i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        System.out.print("Números digitados: ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(numbers[i] + "  ");
        }
        System.out.printf("Soma: %d%n", sum);

        double avg = sum / n;
        System.out.printf("Média: %.2f", avg);

        sc.close();

    }

}
