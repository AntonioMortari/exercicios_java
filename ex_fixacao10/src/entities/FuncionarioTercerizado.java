package entities;

public class FuncionarioTercerizado extends Funcionario {

    private double despesaAdicional;

    public FuncionarioTercerizado(String nome, double horas, double valorPorHora, double despesaAdicional){
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double calcularPagamento(){
        return super.calcularPagamento() + this.despesaAdicional * 1.1;
    }


}
