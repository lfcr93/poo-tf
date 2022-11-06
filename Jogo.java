public class Jogo extends Jogador {
    private int rodada;

    public Jogo(int hpJogador, int mana, int rodada) {
        super(hpJogador, mana);
        this.rodada = rodada;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada++;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + " Jogo [rodada=" + rodada + "]";
    }
}
