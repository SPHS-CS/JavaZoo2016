
/**
 * Write a description of class Danosaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Danosaur extends Animal implements Interneting
{
    private String food;
    private String activity;
    private String noise;

    /**
     * Constructor for objects of class Danosaur
     */
    public Danosaur()
    {
        super("Dan", "Danosaur", 9000, "male", 5);
        food = "memes";
        activity = "has an existential crisis";
        noise = "RAWR!";
    }
    
    public Danosaur(String name, String species, int age, String gender, int energy, String food, 
                String activity, String noise)
    {
        super(name, "Danosaur", age, gender, energy);
        this.food = food;
        this.activity = activity;
        this.noise = noise;
    }
    
    @Override
    public String makeNoise()
    {
        return getName() + " says " + "\"" + noise + "\"";
    }
    
     @Override
    public String sleep()
    {
        return getName() + " is sleeping.";
    }
    
    @Override
    public String play()
    {
        if(getEnergyLevel() > 1)
        {
            setEnergy(getEnergyLevel()-1);
            return getName() + " " + activity + ".";
        }
        else
        {
            System.out.println( getName() + " drops from exhaustion and sleeps for a while.");
            System.out.println( getName() + " is sleeping.");
            setEnergy(7);
            return getName() + " is fully rested, energy restored.";
        }
    }
    
    @Override
    public String eat()
    {
        setEnergy(getEnergyLevel()+2);
        return getName() + " eats " + food + ".";
    }
    
    @Override
    public String internet()
    {
        return getName() + " slumps on the couch and scrolls through Tumblr.";
    }
}
