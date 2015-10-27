import greenfoot.*;
import java.awt.Color;

public class Life extends Actor
{
    int life=5;
    String doKonca;
    String masz;
    public void act() 
    {
        {if (life==5)
            {doKonca=" żyć...";
                setImage(new GreenfootImage("Masz jeszcze " +life +doKonca, 28, Color.WHITE, null));
            }
            else if (life==1)
                setImage(new GreenfootImage("To Twoje ostanie życie..." , 28, Color.WHITE, null));
            else
            {
                doKonca=" życia...";
                setImage(new GreenfootImage("Masz jeszcze " +life +doKonca, 28, Color.WHITE, null));
            }
        }

    }

    public void life(int minus)
    {
        life=minus;
    }

}