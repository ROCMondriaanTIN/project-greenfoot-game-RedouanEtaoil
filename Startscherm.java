import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscherm extends World
{

    /**
     * Constructor for objects of class Startscherm.
     * 
     */
    public Startscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        
        
        
        
    }
}

