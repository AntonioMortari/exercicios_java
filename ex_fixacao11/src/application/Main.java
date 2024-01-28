package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Pessoa> contribuintes = new ArrayList<>();
        double totalImpostos = 0;

        System.out.print("Informe o número de contribuintes: ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.printf("Dados do contribuinte #%d%n", i + 1);
            System.out.print("[1] - Pessoa Física ou[2] - Jurídica?: ");
            int resposta = sc.nextInt();

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();

            if(resposta == 1){
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();

                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }else{
                System.out.print("Número de funcionários: ");
                int funcionarios = sc.nextInt();

                contribuintes.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }

        System.out.println("CALCULO DE IMPOSTOS:");

        for(Pessoa pessoa : contribuintes){
            System.out.printf("%s: R$%.2f %n", pessoa.getNome(), pessoa.calcularImposto());
            totalImpostos += pessoa.calcularImposto();
        }

        System.out.printf("Total de impostos: R$%.2f %n", totalImpostos);


        sc.close();
    }


}
