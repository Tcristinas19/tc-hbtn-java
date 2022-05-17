package provedores;

public class JadLog implements ProvedorFrete {

    public JadLog() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;

        if (peso > 2000) {
            valorFrete = valor * 0.07;
        } else {
            valorFrete = valor * 0045;
        }

        double obterTipoProvedorFrete = 0;
        Frete frete = new Frete(obterTipoProvedorFrete, valorFrete());

        return frete;
    }

    private TipoProvedorFrete valorFrete() {

        return null;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}