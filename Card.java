import greenfoot.*;

public class Card extends Actor
{
    private String suit;
    private String rank;
    private int value;
    
    public Card()
    {
        int x = (int)(Math.random()*4);
        if(x==0) suit = "clubs";
        if(x==1) suit = "spades";
        if(x==2) suit = "hearts";
        if(x==3) suit = "diamonds";
        
        int y = (int) (Math.random()*13) + 1;
        if(y==1)
        {
            rank = "ace";
            value = 11;
        }
        if(y>1 && y<11)
        {
            rank = "" + y;
            value = y;
        }
        if(y==11)
        {
            rank = "jack";
            value = 10;
        }
        if(y==12)
        {
            rank = "queen";
            value = 10;
        }
        if(y==13)
        {
            rank = "king";
            value = 10;
        }
        setImage(rank + "_of_" + suit + ".png");
        getImage().scale(60,80);
    }   
}
