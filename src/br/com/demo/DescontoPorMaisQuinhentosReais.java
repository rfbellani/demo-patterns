package br.com.demo;

public class DescontoPorMaisQuinhentosReais implements Desconto{

    private Desconto proximoDesconto;

    public double desconta (Orcamento orcamento){
        if (orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        }
        return this.proximoDesconto.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {

        proximoDesconto = desconto;
    }

}
