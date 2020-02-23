package br.com.demo;

public class ICPP extends TemplateDeImpostoCondicional{

    /* Metodo antigo sem aplicar o template
    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        } else {
            return orcamento.getValor() * 0.05;
        }
    }

     */

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUSarMaximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() > 500);
    }
}
