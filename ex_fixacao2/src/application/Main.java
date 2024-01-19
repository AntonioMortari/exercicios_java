package application;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto");

        System.out.print("Nome:");
        String name = sc.nextLine();

        System.out.print("Preço unitário:");
        double price = sc.nextDouble();

        System.out.print("Quantidade em estoque:");
        int stock = sc.nextInt();

        Product product1 = new Product(name, price, stock);

        product1.printData();

        System.out.println("Digite o número de produtos para adicionar ao estoque:");
        product1.addProducts(sc.nextInt());

        product1.printData();

        System.out.println("Digite o número de produtos para remover do estoque");
        product1.removeProducts(sc.nextInt());

        product1.printData();

        sc.close();
    }
}