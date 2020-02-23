package br.com.demo;

public class IKCV extends TemplateDeImpostoCondicional {
    /* metodo antigo sem aplicar o Template
    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor() > 500 && temItemMaior100ReaisNo(orcamento)){
            return orcamento.getValor() * 0.1;
        } else {
            return orcamento.getValor() * 0.06;
        }
    }

     */

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean deveUSarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaior100ReaisNo(orcamento);
    }

    private boolean temItemMaior100ReaisNo(Orcamento orcamento) {
        for (Item item : orcamento.getItens()){
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }
}
