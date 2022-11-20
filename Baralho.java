import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Personagem> baralho;
    private static final int NCARDS = 10;
    
    public Baralho() {
        
        PersonagemAssassino assassino1 = new PersonagemAssassino(null, null, 0, 0, 1);
        PersonagemAssassino assassino2 = new PersonagemAssassino(null, null, 0, 0, 2);
        PersonagemTanke tanke1 = new PersonagemTanke(null, null, 0, 0, 3);
        PersonagemTanke tanke2 = new PersonagemTanke(null, null, 0, 0, 4);
        PersonagemGuerreiro guerreiro1 = new PersonagemGuerreiro(null, null, 0, 0, 5);
        PersonagemGuerreiro guerreiro2 = new PersonagemGuerreiro(null, null, 0, 0, 6);
        PersonagemMago mago1 = new PersonagemMago(null, null, 0, 0, 7);
        PersonagemMago mago2 = new PersonagemMago(null, null, 0, 0, 8);
        PersonagemSuport suport1 = new PersonagemSuport(null, null, 0, 0, 9);
        PersonagemSuport suport2 = new PersonagemSuport(null, null, 0, 0, 10);

        baralho = new ArrayList<>(NCARDS);
        baralho.add(assassino1);
        baralho.add(assassino2);
        baralho.add(tanke1);
        baralho.add(tanke2);
        baralho.add(guerreiro1);
        baralho.add(guerreiro2);
        baralho.add(mago1);
        baralho.add(mago2);
        baralho.add(suport1);
        baralho.add(suport2);
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    public Personagem getCarta(int i) {
        return baralho.get(i);
    }
    
}
