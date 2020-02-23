package br.com.demo;

public class TesteDaNotaFiscal {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Empresa 1")
        .comCnpj("123.456.789/001-00")
        .comItem(new ItemDaNota("Item 1", 200.0))
        .comItem(new ItemDaNota("Item 1", 300.0))
        .comItem(new ItemDaNota("Item 1", 400.0))
        .comObservacao("Teste")
        .naData();

        NotaFiscal nota = builder.constroi();

        System.out.println("Valor bruto " + nota.getValorbruto());

    }
}
