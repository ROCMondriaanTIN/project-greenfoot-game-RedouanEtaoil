import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthBar extends Actor
{
    /**
     * Act - do whatever the healthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int health= 15;
    int healthBarWidth= 80;
    int healthBarHeight= 10;
    int pixelsPerHealthPoint= (int)healthBarWidth/health;
    
    public void HealthBar()
    
    {
        update();
        
    }
    public void act() 
    {
        update();
    }    
    
    
    public void update()
    {
        
        setImage(new GreenfootImage(healthBarWidth, healthBarHeight));
        GreenfootImage myImage= getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth +1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1, health*pixelsPerHealthPoint, healthBarHeight);
        
        
    }
    
    public void loseHealth()
    
    {
        
     health--;   
        
    }
    
    
}
