public class PersonagemSuport extends Personagem {

    public PersonagemSuport(String nome, String raridade, int hp, int ataque ,int id) {
        super(nome, raridade, hp, ataque, id);
    }

    @Override
    public void atacar(Personagem agressor, Personagem alvo) {
        int dano = alvo.getHp() - agressor.getAtaque();
        if (dano <= -1) {
            // morreu
        }
        alvo.restoVida(agressor, alvo);
    }

    @Override
    public void restoVida(Personagem agressor, Personagem alvo) {
        int resto = alvo.getHp() - agressor.getAtaque() - 1;
        alvo.setHp(resto);
    }
    
}
