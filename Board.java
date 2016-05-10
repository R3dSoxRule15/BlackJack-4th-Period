import greenfoot.*;
public class Board extends World {
    private Deck deck;
    private GreenfootImage back = new GreenfootImage("back.jpg");

    public Board() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        back.scale(80, 100);
        deck = new Deck();
        addObject(deck.getDeck().get(0), 50, 550);
        addObject(deck.getDeck().get(1), 140, 550);
        addObject(deck.getDeck().get(2), 760, 50);
        deck.getDeck().get(3).setImage(back);
        addObject(deck.getDeck().get(3), 670, 50);
    }

}