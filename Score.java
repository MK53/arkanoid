import greenfoot.*;
import java.awt.Color;

public class Score extends Actor
{
int score=0;
Pole pole=(Pole) getWorld();
    public void act() 
    {
      setImage(new GreenfootImage("Twój wynik= " +score, 28, Color.WHITE, null));
    }
    
    public void dodaj(int klocek)
    {
        score=klocek;
    }
}
