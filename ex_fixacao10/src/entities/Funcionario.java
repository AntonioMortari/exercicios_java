package entities;

public class Funcionario {

    protected String nome;
    protected double horas;
    protected double valorPorHora;

    public Funcionario(String nome, double horas, double valorPorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPagamento(){
        return this.horas * this.valorPorHora;
    }
}
