import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String agenciaNome) {
        for (int i = 0; i < agencias.size(); i++) {
            if (agencias.get(i).getNome().equals(agenciaNome)) {
                return agencias.get(i);
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String agNova) {
        Agencia agLocalizada = buscarAgencia(agNova);
        if (agLocalizada != null) {
            return false;
        }

        Agencia novaAg = new Agencia(agNova);
        agencias.add(novaAg);
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacaoInicial) {
        Agencia agLocalizada = buscarAgencia(nomeAgencia);
        if (agLocalizada == null) {
            return false;
        }
        agLocalizada.novoCliente(nomeCliente, valorTransacaoInicial);
        agLocalizada.adicionarTransacaoCliente(nomeCliente, valorTransacaoInicial);

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacaoInicial) {
       Agencia agLocalizada = buscarAgencia(nomeAgencia);
       if (agLocalizada == null) {
           return false;
       }

       agLocalizada.adicionarTransacaoCliente(nomeCliente, valorTransacaoInicial);

       return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimiTransacoes) {
        Agencia agLocalizada = buscarAgencia(nomeAgencia);

        if (agLocalizada == null) {
            return false;
        }
        for (int i1 = 0; i1 < agLocalizada.getClientes().size(); i1++) {
            Cliente encontrado = agLocalizada.getClientes().get(i1);
            System.out.print("Cliente: " + encontrado.getNome() + " [" + (i1 + 1) + "]\n");

            if (imprimiTransacoes) {
                for (int i2 = 0; i2 < encontrado.getTransacoes().size(); i2++) {
                    System.out.println(" [" + (i2 + 1) + "] valor " + encontrado.getTransacoes().get(i2));
                }
            }
        }
        return true;
    }
    public String getNome() {
        return nome;
    }
    public List<Agencia> getAgencias(){
        return agencias;
    }
}
