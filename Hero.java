
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public String worldName="";
    
    ScorenBord sb;
    boolean key5;
    boolean inAir=true;
    boolean key=false;
    boolean key2;
    boolean key3;
    boolean ster;
    boolean Key4;
    boolean detectPortal2=false;
    boolean hendelTile=false;
    boolean Criminal;
    boolean schatkist;
    
    int x=165; 
    int y=2537;
    int springen;
    int HendelDeur1 = 0;
    int coins= 0;
    int Gem= 0;
    int cherry= 0;
    int GemTeller= 0;
   
   
    
private GreenfootImage p1 = new GreenfootImage("p1_walk01.png");
private GreenfootImage p2 = new GreenfootImage("p1_walk02.png");
private GreenfootImage p3 = new GreenfootImage("p1_walk03.png");
private GreenfootImage p4 = new GreenfootImage("p1_walk04.png");
private GreenfootImage p5 = new GreenfootImage("p1_walk05.png");
private GreenfootImage p6 = new GreenfootImage("p1_walk06.png");
private GreenfootImage p7 = new GreenfootImage("p1_walk07.png");
private GreenfootImage p8 = new GreenfootImage("p1_walk08.png");
private GreenfootImage p9 = new GreenfootImage("p1_walk09.png");
private GreenfootImage p10= new GreenfootImage("p1_walk10.png");






public int frame = 1;
    public Hero(String actieveWereld )  {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        this.worldName= actieveWereld;
        //Greenfoot.playSound("mario.mp3");
        
    }

    @Override
    public void act() {
        handleInput();
        eatKeys();
        checkpoint();
        eatKeys2();
        eatKeys3();
        eatKeys4();
        key4();
        Door1();
        Door2();
        Door3();
        Door4();
        Door5();
        Door6();
        Lava();
        ster1();
        gem();
        gem2();
        gem();
        door8();
        resetCriminal();
        jumptile();
        removeCherry();
        removeKey5();
        gameOver();
        schatkist1();
        applyVelocity();
        detectPortal();
        
        if(sb==null){
        sb = new ScorenBord();
        getWorld().addObject(sb,-10,-10);
        }
        
       //coin();
        levels();
        
        //positie();
        if(!Greenfoot.isKeyDown("k"))
        {
        spikes();
    }
        velocityX *= drag;
        velocityY += acc;
        
    for(Actor enemy: getIntersectingObjects(Highjump.class)){
    if(enemy !=null){   
        velocityY = -30;
        setLocation(getX(), getY());
        
        
        break;
         
    }
}
if (velocityY > gravity) {
 velocityY = gravity;
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
        sb.HartjeEraf();
        setLocation(x,y);
        
    }
    
    
    
    }
    
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("up")) {
            for(Actor Hero:  getIntersectingObjects(Tile.class))
            {
            inAir=true;    
            velocityY = -17 + springen;
            Greenfoot.playSound("jump.mp3");
        }
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
            framesLinks();
        } else if (Greenfoot.isKeyDown("right")) {
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
    
    public void framesLinks()
        {
             if(frame==1)
            {
                setImage("p1_links_walk01.png");
            }

            if(frame==2)
            {
                setImage("p1_links_walk02.png");
            }

            if(frame==3)
            {
                setImage("p1_links_walk03.png");
            }
            
            if(frame==4)
            {
                setImage("p1_links_walk04.png");
            }
    
            if(frame==5)
            {
                setImage("p1_links_walk05.png");  
            }

            if(frame==6)
            {
                setImage("p1_links_walk06.png");
            }

            if(frame==7)
            {
                setImage("p1_links_walk07.png");
            }
            
            if(frame==8)
            {
                setImage("p1_links_walk08.png");
            }
            
            if(frame==9)
            {
                setImage("p1_links_walk09.png");
            }
            
            if(frame==10)
            {
                setImage("p1_links_walk10.png");
            }
        
            if(frame==11)
            {
                setImage("p1_links_walk11.png");
                frame=1;
                return ;
            }
            frame++;
        }  
    
    
    
    
    public void spring()
    {
        
   if (frame == 1){
    setImage("springboardDown.png");

    }
    if (frame == 2){
    setImage("springboardDown.png");

    }
          
   if (frame == 3){
    setImage("springboardDown.png");

    }
          
   if (frame == 4){
    setImage("springboardUp.png");

    }
      if (frame == 5){
    setImage("springboardUp.png");

    }
      else if (frame == 6){
    setImage("springboardUp.png");
    frame =1;
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

    
    public boolean eatKeys3()
    {
        for(Actor keys : getIntersectingObjects(Key3.class))
        {
        
            if(isTouching(Key3.class))
            {
                removeTouching(Key3.class);
                key3= true;
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
    
      public boolean key4()
    {
        for(Actor keys : getIntersectingObjects(Key4.class))
        {
        
            if(keys!=null)
            {
                removeTouching(Key4.class);
                Key4=true;
                break;
            }
        }
        return Key4;
    }
    
    
   
    public void door8()
    {
    for (Actor deur: getIntersectingObjects(DoorLock8.class))
        {
        if (Key4==true&&coins==5&&Criminal==true && schatkist==true)
        {
           if(isTouching(DoorLock8.class))
           
           
           Greenfoot.setWorld(new MyWorld5());
           String Active="MyWorld5";
        }
        
        }    
        
    }
    
    
    
    public boolean Lava()
    {
        if(isTouching(lavaTile.class))
        {
            
            setLocation(x,y);
            
            
        }
        return key2;
    }
    
   
    
  
    

    public boolean Door1()
    {
    if(key2==true && isTouching(DoorLock1.class))
    
    {
    setLocation(522 , 3102);
    key2=false;
    }
    return key2;
    }
    
    public boolean Door2()
    {
    if(key2==true && isTouching(DoorLock2.class))
    
    {
    setLocation(143 , 3102);
    key2=false;
    }
    return key2;
    }
    
    public boolean Door3()
    {
    if(key2==true && isTouching(DoorLock3.class))
    
    {
    setLocation(549 , 3102);
    key2=false;
    }
    return key2;
    }
    
    public boolean Door4()
    {
    if(key2==true && isTouching(DoorLock4.class))
    
    {
    setLocation(544 , 3700);
    key2=false;
    }
    return key2;
    }
    
    
    
    
    public boolean Door5()
    {
    if(key2==true && isTouching(DoorLock6.class))
    
    {
    setLocation(143 , 3102);
    key2=false;
    }
    return key2;
    }
    
    public boolean Door6()
    {
    if(key2==true && isTouching(DoorLock5.class))
    
    {
    Greenfoot.setWorld(new MyWorld3());
    key2=false;
    }
    return key2;
    }
    
    
    private void detectPortal()
    {
        for (Actor deur: getIntersectingObjects(DoorLock.class))
        {
        if (key==true && Criminal == true)
        {
           if(isTouching(DoorLock.class))
           Greenfoot.setWorld(new MyWorld2());
           String Active="MyWorld2";
        }
        }
        
     }
        
    public void jumptile()
    
    {
             
    for(Actor enemy: getIntersectingObjects(Enemy.class)){
     {
        inAir= true;
        velocityY = -15 - springen;
        
        
        break;
         
    }
}
        
        
        
        
        
        
    }
    public void levels ()
    {
    for (Actor deur: getIntersectingObjects(DoorLock7.class))
        {
        if (key3==true&&coins==21)
        {
           if(isTouching(DoorLock7.class))
           Greenfoot.setWorld(new MyWorld4());
           String Active="MyWorld4";
        }
        }    
    }
     
   public boolean door7()
   {
   
    if(hendelTile==true && isTouching(DoorLock9.class))
    
    {
   setLocation(544 , 3700);
   
    }
    return hendelTile;
       
    }
    
   public int eatKeys4()
   
   {
          if(isTouching(coin.class))
          {
              
                removeTouching(coin.class);
                coins++;
                Greenfoot.playSound("coins.mp3");
           }
       
           return coins;
        }
  
        
        
   
        
        public int gem()
        
        {
            if(isTouching(Gem.class))
            
            {
                
                removeTouching(Gem.class);
                Gem++;
            }
            
            
            return Gem;
        }
        
        
        public void gem2()
        
        {
           if(isTouching(Gem2.class))
           
           {
            setLocation(125, 3613);
               
           }
            
            
            
      
        }
        
        
public void ster1()
        
{
if (isTouching(star.class))
            
{
                
 removeTouching(star.class);
springen= -5;
Greenfoot.playSound("jump.mp3");
           
            
}

         
}


  public void resetCriminal()
    {
     if(isTouching(Criminal.class))
    {
       removeTouching(Criminal.class);
       Criminal=true;
       
    }
    

}


public boolean schatkist1()
{
    if(isTouching(Schatkist.class))
    {
        removeTouching(Schatkist.class);
        
        schatkist=true;
        
    }
    return schatkist;
}


public int removeCherry()
    {
        if(isTouching(cherry.class))
        {
           removeTouching(cherry.class); 
           cherry++;
        }
        return cherry;
    }
   
    
    
public void removeKey5()
{
if(isTouching(key5.class))
{
removeTouching(key5.class);
key5=true;
            
}
        
        
        
    }
    
   private boolean gameOver()
    {
        for (Actor deur: getIntersectingObjects(DoorLock11.class))
        {
        if (key5==true && cherry == 24 && isTouching(DoorLock11.class))
        {
           Greenfoot.setWorld(new GameOverScherm());
          

        }
     
    } return key;
    } 
    
public void jumptile2()
    
{
             
    for(Actor enemy2: getIntersectingObjects(Enemy2.class)){
     {
        inAir= true;
        velocityY = -20 +springen;
        
        
        
        break;
         
    }
}
  


}



}

           
        
        
  

    
     
       
    
    



  
    

    



        
       
    
        





     
    



      
    



