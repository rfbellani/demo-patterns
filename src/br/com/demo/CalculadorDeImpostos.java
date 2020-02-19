package br.com.demo;

public class CalculadorDeImpostos {
    /* Metodo antigo sem o Pattern Strategy
    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        if( "ICMS".equals(imposto) ) {
            //double icms = orcamento.getValor() * 0.1;
            double icms = new ICMS().calculaICMS(orcamento);
            System.out.println(icms); // imprimirá 50.00

        } else if( "ISS".equals(imposto) ) {
            //double iss = orcamento.getValor() * 0.06;
            double iss = new ISS().calculaISS(orcamento);
            System.out.println(iss);// imprimirá 30.0
        }
    }
    */

    // Novo Metodo aplicando o Pattern Strategy
    // Imposto eh passado através da Interface Imposto
    // ISS e ICMS passa a implementar o metodo calcula da Interface Imposto
    // O Metodo abaixo somente chama o metodo calcula de Imposto

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

        double valor = imposto.calcula(orcamento);

        System.out.println(valor);

    }
}


