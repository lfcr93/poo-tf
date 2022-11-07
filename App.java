import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        
        Personagem personagem1 = new Personagem("Carlos", "Comum", 1000, 10, 1.25, "Atirar");
        Personagem personagem2 = new Personagem("Jose", "Raro", 500, 30, 1.4, "Nadar");

        HashMap<Integer, Personagem> deck = new HashMap<>();
        deck.put(1, personagem1);
        deck.put(2, personagem2);
    }
}
