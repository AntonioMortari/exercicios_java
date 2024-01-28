package entities;

public class PessoaJuridica extends Pessoa {

    private int funcionarios;

    public PessoaJuridica(String nome, double rendaAnual, int funcionarios){
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    @Override
    public double calcularImposto(){
        if(this.funcionarios > 10){
            return super.rendaAnual * 0.14;
        }

        return super.rendaAnual * 0.16;
    }


}
