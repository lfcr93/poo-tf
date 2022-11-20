public abstract class Personagem extends Carta {
    
    private int id;
    private int hp;
    private int ataque;

    public Personagem(String nome, String raridade, int hp, int ataque, int id) {
        super(nome, raridade);
        this.hp = hp;
        this.ataque = ataque;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public abstract void atacar(Personagem agressor, Personagem alvo);
    public abstract void restoVida(Personagem agressor, Personagem alvo);

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + " Personagem [hp=" + hp + ", ataque=" + ataque + "]";
    }    
}
