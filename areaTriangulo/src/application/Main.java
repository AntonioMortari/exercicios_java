package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida dos lados do triângulo X");
        Triangle x = new Triangle(
          sc.nextDouble(),
          sc.nextDouble(),
          sc.nextDouble()
        );

        System.out.println("Digite a medida dos lados do triângulo Y");
        Triangle y = new Triangle(
                sc.nextDouble(),
                sc.nextDouble(),
                sc.nextDouble()
        );

        double areaX = x.getArea();
        double areaY = y.getArea();

        System.out.printf("Área do triângulo X: %.4f %n", areaX);
        System.out.printf("Área do triângulo Y: %.4f %n", areaY);

        if(areaX > areaY){
            System.out.println("Área maior: X");
        }else{
            System.out.println("Área maior: Y");
        }



    }


}
