
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
    boolean key2;
    boolean detectPortal2=false;
    int x=165;
    int y=2537;

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
        checkpoint();
        eatKeys2();
        decectPortal2();
        detectPortal3();
        detectPortal4();
        detectPortal5();
        Lava();
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
                //getWorld().removeObject(this);
                setLocation(x,y);
                break;
            }
        }
    }
    
    
    
    public void checkpoint()
    {
    if(isTouching(Checkpoint.class))  {  
    this.x=getX();
    this.y=getY();
}
    }
    public void spikes()
   {
    if(isTouching(SpikesTile.class))
    {
        
        setLocation(x,y);
    }
    
    }
    public void handleInput() {
        if (Greenfoot.isKeyDown("w")) {
            for(Actor Hero:  getIntersectingObjects(Tile.class))
            {
            inAir=true;    
            velocityY = -16;
        }
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 5;
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
        for(Actor keys : getIntersectingObjects(Key.class))
        {
        
            if(isTouching(Key.class))
            {
                removeTouching(Key.class);
                key= true;
                break;
            }
        }
        return key;
    }
     public boolean eatKeys2()
    {
        for(Actor keys : getIntersectingObjects(Key2.class))
        {
        
            if(keys!=null)
            {
                removeTouching(Key2.class);
                key2=true;
                break;
            }
        }
        return key2;
    }
    public boolean Lava()
    {
        if(isTouching(LavaTile.class))
        {
            
            setLocation(x,y);
            
            
        }
        return key2;
    }
    
    public boolean decectPortal2()
    {
        if(key2==true && isTouching(DoorLock1.class))
        {
            setLocation(79 , 2826);
            key2 =false ; 
           

        }
        return key2;
         
    }
    
    public boolean detectPortal3()
    {
     if(key2==true && isTouching(DoorLock2.class))
     
     {
        setLocation(573 , 3212); 
       key2 = false;
       
       
     }
        return key2;
    }
    
    public boolean detectPortal4()
    {
        if(key2==true && isTouching(DoorLock3.class))
        
        {
            setLocation(573 , 3611);
            
        }
        return key2;
        
    }
    
    public boolean detectPortal5()
    {
    if(key2==true && isTouching(DoorLock4.class))
    
    {
   setLocation(544 , 3700);
   key2=false;
    }
    return key2;
    }
    
    
    private void detectPortal()
    {
        for (Actor deur: getIntersectingObjects(DoorLock.class))
        {
        if (key==true)
        {
           if(isTouching(DoorLock.class))
           Greenfoot.setWorld(new MyWorld2());
           String Active="MyWorld2";
        }
        }
     }

   



  
    
  
    
}


        
       
    
        





     
    



      
    



