public class Personagem extends Carta {

    private int hpPersonagem;
    private int danoNormal;
    private double multiplicador;
    private String ataqueEspecial;

    public Personagem(String nome, String raridade, int hpPersonagem, int danoNormal, double multiplicador, String ataqueEspecial) {
        super(nome, raridade);
        this.hpPersonagem = hpPersonagem;
        this.danoNormal = danoNormal;
        this.multiplicador = multiplicador;   
        this.ataqueEspecial = ataqueEspecial;
    }
    
    public int getHp() {
        return hpPersonagem;
    }

    public void setHp(int hpPersonagem) {
        this.hpPersonagem = hpPersonagem;
    }

    public int getDanoNormal() {
        return danoNormal;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public double atacarEspecial(int mana){
        double danoEspecial;
        if (mana < 3) {
            danoEspecial = 0;
        } else {
            danoEspecial =  danoNormal * multiplicador;
        }
        return danoEspecial;
    }
    
    public int reduzirHp(Personagem alvo, int danoNormal, int danoEspecial){

        if (danoEspecial == 0){
            hpPersonagem = hpPersonagem - danoNormal;
            if (hpPersonagem <= 0) {
                // morreu
            }
        } else {
            hpPersonagem = hpPersonagem - danoEspecial;
            if (hpPersonagem <= 0) {
                // morreu
            }
        }
        return hpPersonagem;
    }

    public void Morreu(int hp){
        if (hp <= 0){
            //achar um jeito de tirar o personagem da lista
        }
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + " Personagem [hp=" + hpPersonagem + ", danoNormal=" + danoNormal + ", multiplicador=" + multiplicador
                + ", ataqueEspecial=" + ataqueEspecial + "]";
    } 
}
