
/**
 * Write a description of class Markimoo here.
 * 
 * @author Felicia Johnston
 * @version 2016.03.15
 */
public class Markimoo extends Animal implements Interneting
{
    private String food;
    private String activity;
    private String noise;

    /**
     * Constructor for objects of class Markimoo
     */
    public Markimoo()
    {
        super("Mark", "Markimoo", 26, "male", 10);
        food = "milk";
        activity = "plays with Tiny Box Tim";
        noise = "Top of the morning to ya laddies!";
    }
    
    public Markimoo(String name, String species, int age, String gender, int energy, String food, 
                String activity, String noise)
    {
        super(name, "Markimoo", age, gender, energy);
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
        return getName() + " watches Markiplier videos on YouTube.";
    }
}
