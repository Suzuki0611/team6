import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class atari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class atari extends Actor
{
    private GreenfootImage img_bkup = null;
    private int width=30;
    private int height= 30;
    
    public atari(){
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
        //はしについたら消す
        Actor actor = getOneIntersectingObject( kasi1.class );
        if( actor != null ){
            getWorld().removeObject( actor );
        }  
        // Add your action code here.
    }    
}
