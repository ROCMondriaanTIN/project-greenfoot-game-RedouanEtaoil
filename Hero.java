
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    ScorenBord sb;
    
    boolean inAir=true;
    boolean key=false;
    boolean key2;
    boolean key3;
    boolean ster;
    boolean Key4;
    boolean detectPortal2=false;
    boolean hendelTile=false;
    boolean Criminal=false;
    int x=165;
    int y=2537;
    int springen;
   int HendelDeur1 = 0;
   int coins= 0;
   int Gem= 0;
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
        enemy1234();
        resetCriminal();
        Enemy2();
        
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
        for (Actor enemy: getIntersectingObjects(Highjump.class)){
    if(enemy !=null){   
        velocityY = -25;
        setLocation(getX(), getY());
        
        break;
         
    }
}
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        detectPortal();
        
        // for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            // if (isTouching(Enemy.class)&&enemy != null) {
                // velocityX= 40;
                // //setLocation(2000,2353);
                
                // break;
            // }
        // }
        
    }
    
    public void Enemy2()
    {
        if(isTouching(Enemy2.class))
        {
         
           velocityX= 130;
            
        }
        
        
    }
  
    public void enemy1234(){
    if (isTouching(Enemy.class)) {
                velocityX= 130;
    
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
            velocityY = -16 + springen;
        }
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
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
    
    public void enemy()
    {
  
    
    
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
        if (Key4==true&&coins==5&&Criminal==true)
        {
           if(isTouching(DoorLock8.class))
           
           
           Greenfoot.setWorld(new MyWorld5());
           String Active="MyWorld5";
        }
        
        }    
        
    }
    
    
    
    public boolean Lava()
    {
        if(isTouching(LavaTile.class))
        {
            
            setLocation(x,y);
            
            
        }
        return key2;
    }
    
    
    
  
    

    public boolean Door1()
    {
    if(key2==true && isTouching(DoorLock1.class))
    
    {
   setLocation(549 , 3102);
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
    if(key2==true && isTouching(DoorLock5.class))
    
    {
   setLocation(143 , 3102);
   key2=false;
    }
    return key2;
    }
    
    public boolean Door6()
    {
    if(key2==true && isTouching(DoorLock6.class))
    
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
        if (key==true)
        {
           if(isTouching(DoorLock.class))
           Greenfoot.setWorld(new MyWorld2());
           String Active="MyWorld2";
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
             springen= -10;
            
            }
         
        }
         public void resetCriminal()
    {
     if(isTouching(Criminal.class))
     {
        removeTouching(Criminal.class);
       Criminal=true;
       return;
        
     }
     
     
     
        
    }
}
    
     
       
    
    



  
    

    



        
       
    
        





     
    



      
    



