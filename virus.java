import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class virus extends musuh
{
    /**
     * Act - do whatever the virus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public virus(){
        GreenfootImage img = this.getImage();
        img.scale(100,150);
        this.setImage(img);
    }
    public void act()
    {
        move(-8);
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
