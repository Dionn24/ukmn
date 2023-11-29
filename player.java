import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int gravity = 4;
    public void act()
    {
        this.setLocation(this.getX(), this.getY()+gravity);
        if (Greenfoot.isKeyDown("Space"))
        {
            this.setLocation(this.getX(), this.getY()-8);
        }
    }
}
