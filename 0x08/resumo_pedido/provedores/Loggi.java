package provedores;

public class Loggi implements ProvedorFrete {
    public Loggi() {
    }


    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;
        if (peso > 5000) {
            valorFrete = valor * 0.12;
        } else {
            valorFrete = valor * 0.04;
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
        return TipoProvedorFrete.LOGGI;
    }
}