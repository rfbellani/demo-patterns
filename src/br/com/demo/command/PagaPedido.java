package br.com.demo.command;

public class PagaPedido implements Comando {

    private Pedido pedido;

    public PagaPedido(Pedido pedido) {

        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Pagando Pedido do " + pedido.getCliente());
        this.pedido.paga();
    }
}
