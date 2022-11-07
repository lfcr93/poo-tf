public class PersonagemAssasino extends Personagem {
    private double multiplicadorDano;

    public PersonagemAssasino(String nome, String raridade, double hp, boolean poder, double defesa, double ataque, double multiplicadorDano) {
        super(nome, raridade, hp, poder, defesa, ataque);
        this.multiplicadorDano = multiplicadorDano;
    }

    public double getMultiplicadorDano() {
        return multiplicadorDano;
    }

    public void setMultiplicadorDano(double multiplicadorDano) {
        this.multiplicadorDano = multiplicadorDano;
    }

    @Override
    public double atacar(Personagem alvo, PersonagemAssasino atacante) {

        double dano = (atacante.getAtaque()*getMultiplicadorDano()) - alvo.getDefesa();
        double vidaAtualAlvo = alvo.getHp() - dano;
        double vidaAtt = alvo.getHp();
        vidaAtt = vidaAtualAlvo;
        if (alvo.getHp() <= 0) {
            // morreu
        }
        return dano;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + " multiplicadorDano = " + multiplicadorDano;
    }
}
