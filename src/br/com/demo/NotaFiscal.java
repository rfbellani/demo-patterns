package br.com.demo;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
    private String razaoSocial;
    private String cnpj;
    private Calendar dataDeEmissao;
    private double valorbruto;
    private double impostos;
    public List<ItemDaNota> itens;
    public String observacoes;

    public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao, double valorbruto, double impostos, List<ItemDaNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorbruto = valorbruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getDataDeEmissao() {
        return dataDeEmissao;
    }

    public void setDataDeEmissao(Calendar dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    public double getValorbruto() {
        return valorbruto;
    }

    public void setValorbruto(double valorbruto) {
        this.valorbruto = valorbruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public List<ItemDaNota> getItens() {
        return itens;
    }

    public void setItens(List<ItemDaNota> itens) {
        this.itens = itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
