public class Personagem extends Carta {

    private double hp;
    private boolean poder;
    private double defesa;
    private double ataque;

    public Personagem(String nome, String raridade, double hp, boolean poder, double defesa, double ataque) {
        super(nome, raridade);
        this.ataque = ataque;
        this.hp = hp;
        this.poder = poder;
        this.defesa = defesa;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public boolean isPoder() {
        return poder;
    }

    public void setPoder(boolean poder) {
        this.poder = poder;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double atacar(Personagem alvo, double ataque, double defesa) {
        double dano = ataque - defesa;
        double vidaAtualAlvo = alvo.hp - dano;
        alvo.hp = vidaAtualAlvo;
        if (alvo.hp <= 0) {
            // morreu
        }
        return dano;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + " hp =" + hp + ", poder =" + poder + ", defesa =" + defesa + ", ataque =" + ataque;
    }
}
