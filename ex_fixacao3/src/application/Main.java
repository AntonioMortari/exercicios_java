package application;

import entities.Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura e altura do retângulo:");

        Rectangle rectangle = new Rectangle(
                sc.nextDouble(),
                sc.nextDouble()
        );

        System.out.println("Área: " + rectangle.getArea());
        System.out.println("Perímetro: " + rectangle.getPerimeter());
        System.out.println("Diagonal: " + rectangle.getDiagonal());

        sc.close();
    }

}
