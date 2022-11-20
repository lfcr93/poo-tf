public class PersonagemAssassino extends Personagem {

    public PersonagemAssassino(String nome, String raridade, int hp, int ataque, int id) {
        super(nome, raridade, hp, ataque, id);
    }

    @Override
    public void atacar(Personagem agressor, Personagem alvo) {
        int dano = alvo.getHp() - agressor.getAtaque();
        if (dano <= 0) {
            // morreu
        }
        alvo.restoVida(agressor, alvo);
    }

    @Override
    public void restoVida(Personagem agressor, Personagem alvo) {
        int resto = alvo.getHp() - agressor.getAtaque();
        alvo.setHp(resto);
    }    
}
