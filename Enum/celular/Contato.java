public class Contato {

    String nome;
    String numero;
    TipoNumero tipo;

    public Contato(String nome, String numero, TipoNumero tipo) {
        super();
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public TipoNumero getTipo() {
        return tipo;
    }

    public void setTipo(TipoNumero tipo) {
        this.tipo = tipo;
    }
}
