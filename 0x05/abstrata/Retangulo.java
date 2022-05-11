public class Retangulo extends FormaGeometrica{
    protected double largura;
    protected double altura;

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException{
        if (largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        else {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        else{
            this.altura = altura;
        }
    }
    @Override
    public double area(){
        return altura*largura;
    }

    @Override
    public String toString() {
        return "[Retangulo] " + String.format("%.2f", largura) + " / " + String.format("%.2f", altura);
    }
}
