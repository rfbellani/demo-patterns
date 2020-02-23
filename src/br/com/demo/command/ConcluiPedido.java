package br.com.demo.command;

public class ConcluiPedido implements Comando{
    private Pedido pedido;

    public ConcluiPedido(Pedido pedido) {

        this.pedido = pedido;
    }

    @Override
    public void executa() {
        System.out.println("Concluindo Pedido do " + pedido.getCliente());
        this.pedido.finaliza();
    }
}
