package br.com.demo;

public class TesteDeImpostosComplexos {
    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS());
        //Imposto IssComIcms = new IssComIcms();

        Orcamento orcamento = new Orcamento(500);
        double valor = iss.calcula(orcamento);

        System.out.println("Valor do Imposto = " + valor);

    }

}
