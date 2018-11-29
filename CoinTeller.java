import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class coinTeller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinTeller extends Mover
{
    /**
     * Act - do whatever the coinTeller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    List<Hero>myHeroList=this.getWorld().getObjects(Hero.class); 
    Hero myHero=myHeroList.get(0);
    myHero.eatKeys4();
    getWorld().showText("Coins:"+myHero.eatKeys4(),100,80);
    }    
}
