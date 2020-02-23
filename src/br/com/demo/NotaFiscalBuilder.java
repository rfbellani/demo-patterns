package br.com.demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String empresa;
    private String cnpj;

    private List<ItemDaNota> todosItens = new ArrayList<>();
    private double valorBruto;
    private double impostos;
    private String observacao;
    private Calendar data;

    public NotaFiscalBuilder paraEmpresa(String empresa){
        this.empresa = empresa;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item){
        todosItens.add(item);

        valorBruto += item.getValor();
        impostos += item.getValor() *0.05;

        return this;

    }

    public NotaFiscalBuilder comObservacao(String observacao){
        this.observacao = observacao;
        return this;
    }

    public NotaFiscalBuilder naData(){
        data = Calendar.getInstance();
        return this;
    }

    public NotaFiscal constroi(){
        return new NotaFiscal(this.empresa, this.cnpj , this.data, this.valorBruto, this.impostos, this.todosItens, this.observacao);
    }


}
