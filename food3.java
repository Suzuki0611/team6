import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food3 extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=75;
    private int height=75;
    public food3(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    /**
     * Act - do whatever the food3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
