import java.util.Random;
/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Animal implements Walking, Swimming
{
    // instance variables - replace the example below with your own
    private int ghz;
    private String job;
    /**
     * Constructor for objects of class Robot
     */
    public Robot(String name, String description, int speed, String job)
    {
        super(name, description+" and operating at "+speed+"ghz");
        ghz=speed;
        this.job=job;
    }

    @Override
    public String makeNoise()
    {
        Random r = new Random();
        int i = r.nextInt(4);
        switch(i)
        {
            case 1: return "Awaiting command...";
            case 2: return "01100001 01110100 01110100 01100001 01100011 01101011 \n00100000 01101000 01110101 01100001 01101101 01101110 \n01110011 00100000 01011011 01111001 00101111 01101110 \n01011101 00111111";
        }
        return "Unit is functioning properly.";
    }
    
    public String work()
    {
        return "A robot with a "+ghz+"ghz processor should'nt have to "+job+", that's for the human slaves...I mean users";
    }
    
    @Override
    public String play()
    {
        return "Robot plays chess with self and losses.";
    }
    
    @Override
    public String toString()
    {
        return getName()+" : "+getDescription()+" at "+ghz;
    }
    
    @Override
    public String eat()
    {
        return "Robot eats battery, it ";
    }
    
    public String walk()
    {
        return "*Crunch**Crunch* The bear moves";
    }
    
    public String swim()
    {
        return "*Splash**Crackle* ERROR! Can't swi...\nUnit Shutdown";
    }
}
