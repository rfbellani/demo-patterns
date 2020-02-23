package br.com.demo;

public abstract class TemplateDeImpostoCondicional extends Imposto {
    @Override
    public double calcula(Orcamento orcamento) {

        if (deveUSarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract double minimaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract boolean deveUSarMaximaTaxacao(Orcamento orcamento);
}
