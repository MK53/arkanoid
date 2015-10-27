import greenfoot.*;

public class Pilka extends Actor
{
    int speed=3;
    int zycie=5;
    int klocek=0;
    Pole pole=(Pole) getWorld();
    public Pilka()
    {
        setRotation(135);
    }

    public void act() 
    {
        move(speed);
        ruch();
    }

    public void ruch()
    {
        
        if(isAtEdge())
        {
           if (getY()==0) setRotation(-getRotation());
           else setRotation(180-getRotation());
        }

        if (isTouching(Paletka.class))
        {
            setLocation (getX(), getY()-1);
            setRotation(-getRotation());
        }

        if (isTouching(Klocek.class))
        {
            Pole pole=(Pole) getWorld();
            klocek++;
            speed=(int)klocek/4 + 3;
            if (klocek<45)
            {
                pole.score.dodaj(klocek);
                removeTouching(Klocek.class);
                if(Greenfoot.getRandomNumber(2)==0) setRotation(Greenfoot.getRandomNumber(30)+30);
                else setRotation(Greenfoot.getRandomNumber(30)+120);
            }
            else
            {
                speed=0;
                pole.stop(klocek, zycie);
            }
        }

        
        if (isTouching(Dno.class))//(getY()>360)
        {
            Pole pole=(Pole) getWorld();
            zycie--;
            if(zycie!=0)
            {
                pole.life.life(zycie);
                speed=0;
                Greenfoot.delay(100);
                restart();}
            else
            {
                speed=0;
                pole.stop(klocek, zycie);
            }
        }
    }

    public void restart()
    {
        setLocation(300,150);
        setRotation(45);
        speed=(int)klocek/4 + 3;
    }

}

