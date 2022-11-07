public class PersonagemTanke extends Personagem{
    private double multiplicadorDefesa;

    public PersonagemTanke(String nome, String raridade, double hp, boolean poder, double defesa, double ataque, double multiplicadorDefesa) {
        super(nome, raridade, hp, poder, defesa, ataque);
        this.multiplicadorDefesa = multiplicadorDefesa;
    }

    public double getMultiplicadorDefesa() {
        return multiplicadorDefesa;
    }

    public void setMultiplicadorDefesa(double multiplicadorDefesa) {
        this.multiplicadorDefesa = multiplicadorDefesa;
    }

    @Override
    public void atacar(Personagem atacante PersonagemTanke alvo) {
        double dano = atacante.getAtaque() - (alvo.getDefesa()*getMultiplicadorDefesa());
        double vidaAtualAlvo = alvo.getHp() - dano;
        double vidaAtt = alvo.getHp();
        vidaAtt = vidaAtualAlvo;
        if (alvo.getHp() <= 0) {
            // morreu
        }
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + " multiplicadorDefesa = " + multiplicadorDefesa;
    } 

    
}
