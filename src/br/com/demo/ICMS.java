package br.com.demo;

public class ICMS extends Imposto{

    public ICMS (Imposto outroImposto){
        super(outroImposto);
    }

    public ICMS(){}

    public double calcula(Orcamento orcamento)  {
        return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
    }
}
