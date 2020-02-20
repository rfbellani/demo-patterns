package br.com.demo;

public class DescontoPorCincoItens implements Desconto{

    private Desconto proximoDesconto;

    public double desconta (Orcamento orcamento){
        if (orcamento.getItens().size() > 5 ){
            return orcamento.getValor() * 0.10;
        }
        return this.proximoDesconto.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto desconto) {

        this.proximoDesconto = desconto;
    }

}
