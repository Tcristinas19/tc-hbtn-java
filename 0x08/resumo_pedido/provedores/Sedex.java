package provedores;

public class Sedex implements ProvedorFrete {
    public Sedex() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;

        if (peso > 1000) {
            valorFrete = valor * 0.1;
        } else {
            valorFrete = valor * 0.05;
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
        return TipoProvedorFrete.SEDEX;
    }

}