import greenfoot.*;

public class Paletka extends Actor
{

    public void act() 
    {
        //Pole pole=(Pole) getWorld();
        if (Greenfoot.isKeyDown("left"))
        {
        setLocation(getX()-10, 350);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
        setLocation(getX()+10, 350);
        }
        /*
        if (isTouching(Pilka.class))
        {
            System.out.println("OK");
            pole.score.dodaj();
        }*/
    }    
}
