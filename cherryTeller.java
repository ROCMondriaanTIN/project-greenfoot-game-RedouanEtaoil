import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class cherryTeller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cherryTeller extends Mover
{
    /**
     * Act - do whatever the cherryTeller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    List<Hero>myHeroList=this.getWorld().getObjects(Hero.class); 
    Hero myHero=myHeroList.get(0);
    myHero.removeCherry();
    getWorld().showText("Cherry's:"+myHero.removeCherry(),100,80);
    }    
}
