package br.com.demo;

public abstract class Imposto {
    protected Imposto outroImposto;

    public Imposto(Imposto imposto){
        this.outroImposto = imposto;
    }

    public Imposto(){}

    abstract double calcula(Orcamento orcamento);

    public double calculoDoOutroImposto(Orcamento orcamento) {
        if (this.outroImposto == null) return 0;
        return this.outroImposto.calcula(orcamento);
    }


}
