
/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rayquaza extends Animal implements Flying
{
    private String toy;

    public Rayquaza()
    {
        super("Theby", "Legendary Weather Pokemon"); 
        toy = "Burger";
    }

    public Rayquaza(String name, String description, String toy)
    {
        super(name, description);
        this.toy=toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "Ray, Ray!";
    }
    
     @Override
    public String eat()
    {
        return "Rayquaza eats your pokemon and its trainer, i.e. you.";
    }
    
     @Override
    public String play()
    {
        return "Rayquaza plays with " + toy + ", then eats it.";
    }
    
    @Override
    public String fly()
    {
        return "Rayquaza soars, then strikes its target on the second turn.";
    }
}
