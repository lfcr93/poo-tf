import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Personagem> ativoJogador1;
    private List<Personagem> ativoJogador2;
    private List<Personagem> maoJogador1;
    private List<Personagem> maoJogador2;

    public Arena() {
        ativoJogador1 = new ArrayList<>(1);
        ativoJogador2 = new ArrayList<>(1);
        maoJogador1 = new ArrayList<>(5);
        maoJogador2 = new ArrayList<>(5);
    }

    public List<Personagem> fazerMao1(Baralho baralho) {
        baralho.embaralhar();
        for (int i = 0; i < 5; i++) {
            maoJogador1.add(baralho.getCarta(i));
        }
        return maoJogador1;
    }

    public List<Personagem> fazerMao2(Baralho baralho) {
        for (int i = 5; i < 10; i++) {
            maoJogador2.add(baralho.getCarta(i));
        }
        return maoJogador2;
    }

    public void ativarCartaJogador1() {
        
    }


}
