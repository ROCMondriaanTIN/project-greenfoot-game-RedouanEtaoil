
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    boolean inAir=true;
    boolean key=false;
private GreenfootImage p1 = new GreenfootImage("p1_walk01.png");
private GreenfootImage p2 = new GreenfootImage("p1_walk02.png");
private GreenfootImage p3 = new GreenfootImage("p1_walk03.png");
private GreenfootImage p4 = new GreenfootImage("p1_walk04.png");
private GreenfootImage p5 = new GreenfootImage("p1_walk05.png");
private GreenfootImage p6 = new GreenfootImage("p1_walk06.png");
private GreenfootImage p7 = new GreenfootImage("p1_walk07.png");
private GreenfootImage p8 = new GreenfootImage("p1_walk08.png");
private GreenfootImage p9 = new GreenfootImage("p1_walk09.png");
private GreenfootImage p10 = new GreenfootImage("p1_walk10.png");
public int frame = 1;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        
    }

    @Override
    public void act() {
        handleInput();
        eatKeys();
        //positie();
        spikes();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        detectPortal();
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }
    public void spikes()
    {
    if(isTouching(SpikesTile.class))
    {
    setLocation(123,3673);    
    }
    
    }
    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
            for(Actor Hero:  getIntersectingObjects(Tile.class))
            {
            inAir=true;    
            velocityY = -20;
        }
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
            animateRight();
        }
    }
    public void animateRight()
    {
        if(frame == 1)
        {
            setImage(p1);
        }
         else if(frame == 2)
        {
            setImage(p2);
        }
         else if(frame == 3)
        {
            setImage(p3);
        }
         else if(frame == 4)
        {
            setImage(p4);
        }
         else if(frame == 5)
        {
            setImage(p5);
        }
         else if(frame == 6)
        {
            setImage(p6);
        }
         else if(frame == 7)
        {
            setImage(p7);
        }
         else if(frame == 8)
        {
            setImage(p8);
        }
         else if(frame == 9)
        {
            setImage(p9);
            frame = 1;
            return;
        }
        frame ++;
    }
       
    
        
    
    public String positie()
    {
    String k= "X"+getX()+" "+"Y"+getY();    
    return k;
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    
    public boolean eatKeys()
    {
        Actor keys = getOneIntersectingObject(Key.class);
        
        if(isTouching(Key.class))
        {
        removeTouching(Key.class);
        key=true;
    }
        return key;
    }
    
    private void Lava()
    {
        if(isTouching(LavaTile.class))
        {
            setLocation(200, 300);
            
    
    }
}
    private void detectPortal()
    {
        
        if (key==true)
        {
        if(isTouching(DoorLock.class))
        {
        Greenfoot.setWorld(new MyWorld2());
    }
    
   
    }
        
}
    
    
    
    

    
    
        
}


