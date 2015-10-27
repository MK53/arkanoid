import greenfoot.*;

public class Pole extends World
{
    Paletka paletka=new Paletka();
    Pilka pilka=new Pilka();
    Dno dno=new Dno();
    Score score=new Score();
    Life life=new Life();
    Klocek klocek= new Klocek();

    public Pole()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject (paletka, 300,350);
        addObject (pilka, 300,100);
        for(int i=20; i<getWidth(); i+=40)
            addObject (new Dno(), i, getHeight()-15);
        addObject(score, 100, getHeight()-15);
        addObject (life, 470, getHeight()-15);
        for (int j=1; j<4; j++)
            for(int i=20; i<getWidth(); i+=40)
                addObject (new Klocek(), i, getHeight()-400+(j*20));
    }

    public void stop(int pkt, int zycie)
    {
        if(zycie==0)
        {
            removeObject(life);
            showText("KONIEC...", 300,200);
            Greenfoot.delay(50);
            Greenfoot.stop();
        }
        
        if(pkt>=44)
        {
            removeObject(score);
            removeObject(life);
            showText("KONIEC...", 300,200);
            Greenfoot.delay(50);
            Greenfoot.stop();
        }
    }
}
