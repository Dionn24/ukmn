import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class rembo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rembo extends player
{
    /**
     * Act - do whatever the rembo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void rembo()
    {
        this.setImage(new GreenfootImage("rembo1.png"));
    }
    {
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    int lastNameNo = 1;
    int animationDelay = 10;
    void animate(){
        if(animationDelay <10 ){
            animationDelay++;
            return;
        }
        animationDelay=0;
        
        if(lastNameNo==3){
            lastNameNo = 1;
        }else{
            lastNameNo ++;
        }
        this.setImage(new GreenfootImage("rembo"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    public void act()
    {
        animate();
        super.act();
    }
}
