package br.com.demo;

public interface Desconto {
    public double desconta(Orcamento orcamento);

    public void setProximo(Desconto desconto);
}