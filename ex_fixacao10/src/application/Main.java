package application;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários você cadastrará?:");
        int n = sc.nextInt();

        for(int i = 1 ; i < n+1 ; i++){
            System.out.printf("Dados do funcionário %d%n",i);

            System.out.print("É um funcionário tercerizado? (s/n)");
            String resposta = sc.next();

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Horas: ");
            double horas = sc.nextDouble();

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if(resposta.equals("n")){
                funcionarios.add(new Funcionario(
                        nome,
                        horas,
                        valorPorHora
                ));
            }else{
                System.out.print("Despesa Adicional: ");
                double despesaAdicional = sc.nextDouble();
                funcionarios.add(new FuncionarioTercerizado(
                        nome,
                        horas,
                        valorPorHora,
                        despesaAdicional
                ));
            }
        }

        System.out.println("Pagamentos: ");
        for (Funcionario funcionario : funcionarios){
            System.out.printf("%s - R$ %.2f %n", funcionario.getNome(), funcionario.calcularPagamento());
        }

        sc.close();
    }

}
