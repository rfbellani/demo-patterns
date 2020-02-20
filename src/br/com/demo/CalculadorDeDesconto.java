package br.com.demo;

public class CalculadorDeDesconto {

    public double calcula (Orcamento orcamento){
        // mais de 5 itens - desconto
        /* Verificacao de Desconto sem Pattern
        if (orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;

        } else if (orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        }
        */

        // Aplicando o Pattern Chain of responsibility
        // O Primeiro desconto seta o Proximo , que por sua Vez seta o proximo até o ultimo que eh o SemDesconto
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisQuinhentosReais();
        Desconto d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconta(orcamento);

    }
}
