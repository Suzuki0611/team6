import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hako here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hako extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=90;
    private int height= 90;
    
    public hako(){
        img_bkup = new GreenfootImage( getImage() );
        getImage().scale( width,height );
    }
    /**
     * Act - do whatever the hako wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img = new GreenfootImage(img_bkup);
        img.scale( width,height );
        setImage(img);
        // Add your action code here.
    }    
}
