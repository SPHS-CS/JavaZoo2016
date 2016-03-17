
/**
 * Write a description of class Danosaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Napstablook extends Animal implements Crying
{
    private String food;
    private String activity;
    private String noise;

    /**
     * Constructor for objects of class Nabstablook
     */
    public Napstablook()
    {
        super("Blook", "Napstablook", 0, "ghost", 3);
        food = "hugs";
        activity = "lays in the middle of the floor";
        noise = "*sobs*";
    }
    
    public Napstablook(String name, String species, int age, String gender, int energy, String food, 
                String activity, String noise)
    {
        super(name, "Napstablook", age, gender, energy);
        this.food = food;
        this.activity = activity;
        this.noise = noise;
    }
    
    @Override
    public String makeNoise()
    {
        return getName() + " " + noise;
    }
    
     @Override
    public String sleep()
    {
        return getName() + " is sleeping.";
    }
    
    @Override
    public String play()
    {
        if(getEnergyLevel() > 0)
        {
            setEnergy(getEnergyLevel()-2);
            return getName() + " " + activity + ".";
        }
        else
        {
            System.out.println( getName() + " drops from exhaustion and sleeps for a while.");
            System.out.println( getName() + " is sleeping.");
            setEnergy(3);
            return getName() + " is somewhat rested.";
        }
    }
    
    @Override
    public String eat()
    {
        setEnergy(getEnergyLevel()+1);
        return getName() + " recives " + food + ".";
    }
    
    @Override
    public String cry()
    {
        return getName() + " begins to cry, its tears pierce your soul.";
    }
}
