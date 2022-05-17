import provedores.*;

public class ProcessadorPedido {

    ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido){
        Pedido.setFrete = (this.provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
    }
}
