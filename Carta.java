public class Carta {
    private String nome;
    private String raridade;
    
    public Carta(String nome, String raridade) {
        this.nome = nome;
        this.raridade = raridade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaridade() {
        return raridade;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", raridade=" + raridade;
    }
}
