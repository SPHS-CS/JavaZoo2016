
/**
 * Write a description of class Helicopter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicopter extends Animal implements Swimming, Walking
{
    // instance variables - replace the example below with your own
    public String shoe;
    public String tieColor;
    /**
     * Constructor for objects of class Helicopter
     */
    public Helicopter()
    {
        // initialise instance variables
        super("Mario", "This are better Helicopter");
        shoe = "Air Jordans";
        tieColor = "grey";
    }

    public Helicopter(String name, String desc, String shoe, String tieColor)
    {
        super(name, desc);
        this.shoe = shoe;
        this.tieColor = tieColor;
    }

    public String shoe()
    {
        return "shoe";
    }

    public String tie()
    {
        return super.getName() + ", the helicopter, turns into a " + tieColor + "tie. \n It then puts on its " + shoe +
        " and flies away.";
    }

    public String eat()
    {
        return super.getName() + " devours the souls of nearby zoogoers.";
    }

    public String play()
    {
        return super.getName() + " has a life and death duel with Shrek.";
    }

    public String makeNoise()
    {
        return super.getName() + " loudly crunches on raw potatoes.";
    }

    public String swim()
    {
        return "Helicopters can't swim silly!";
    }

    public String walk()
    {
        return super.getName() + " has a malfunction.";
    }
}
