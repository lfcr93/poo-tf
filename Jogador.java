public class Jogador{
    private int hpJogador;
    private int mana;
    
    public Jogador(int hpJogador, int mana) {
        this.hpJogador = hpJogador;
        this.mana = mana;
    }

    public int getHpJogador() {
        return hpJogador;
    }

    public void setHpJogador(int hpJogador) {
        this.hpJogador = hpJogador;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Jogador [hpJogador=" + hpJogador + ", mana=" + mana + "]";
    }
}