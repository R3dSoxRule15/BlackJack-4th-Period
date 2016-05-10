import greenfoot.*;
import java.util.*;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        Card c = new Card();

        while (deck.size() < 52) {
            if (!deck.contains(c)) deck.add(c);
            c = new Card();
        }
    }
    
    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void act() {
        // Add your action code here.
    }
}
