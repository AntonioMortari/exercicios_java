package entities;

public class PessoaFisica extends Pessoa{

    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude){
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calcularImposto(){
        double limite = 20000;
        double imposto = 0;
        if(super.rendaAnual < limite){
            imposto = this.rendaAnual * 0.15;
        } else{
            imposto = this.rendaAnual * 0.25;
        }

        imposto = imposto - (this.gastosSaude * 0.50);

        return imposto;

    }


}
