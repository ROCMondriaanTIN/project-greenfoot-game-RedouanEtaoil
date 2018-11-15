
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
        if (Greenfoot.isKeyDown("up")) {
            for(Actor Hero:  getIntersectingObjects(Tile.class))
            {
            inAir=true;    
            velocityY = -20;
        }
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("Right")) {
            velocityX = 2;
        }
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
    
    public void eatKeys()
    {
        Actor keys = getOneIntersectingObject(Key.class);
        
        if(isTouching(Key.class))
        removeTouching(Key.class);
    }
    
    
    
    
    

    
    
        
}


