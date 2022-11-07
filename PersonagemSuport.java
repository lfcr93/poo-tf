public class PersonagemSuport extends Personagem {
    private double multiplicadorCura;

    public PersonagemSuport(String nome, String raridade, double hp, boolean poder, double defesa, double ataque, double multiplicadorCura) {
        super(nome, raridade, hp, poder, defesa, ataque);
        this.multiplicadorCura = multiplicadorCura;
    }

    public double getMultiplicadorCura() {
        return multiplicadorCura;
    }

    public void setMultiplicadorCura(double multiplicadorCura) {
        this.multiplicadorCura = multiplicadorCura;
    }

    public double curar(PersonagemSuport suport) {
        double recuperaHp;
        recuperaHp = suport.getHp() * getMultiplicadorCura();  
        double vidaCurada = recuperaHp + suport.getHp();
        double vidaAtual = suport.getHp();        
            if (vidaCurada > 100){
                vidaAtual = 100;
            }
        return vidaAtual;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        return aux + " multiplicadorCura = " + multiplicadorCura;
    }

    
    
}