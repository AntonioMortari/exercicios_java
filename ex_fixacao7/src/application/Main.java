package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?:");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i = 0 ; i < n ; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Negativos:");
        for(int i = 0 ; i < n ; i++){
            if(numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }



        sc.close();

    }

}
