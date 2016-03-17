
/**
 * Write a description of class Hydra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hydra extends Animal implements Walking, Swimming
{
    // instance variables - replace the example below with your own
    private int heads;
    public Hydra()
    {
        super("Hardy", "A massive amphibious creature with multiple heads that regenerate 2 when cut off.");
        heads = 5;
    }

    /**
     * Constructor for objects of class Hydra
     */
    public Hydra(String name, String desc, int heads)
    {
        super(name, desc);
        this.heads = heads;
    }

    public int chopHead(int a)
    {
        heads += a;
        return heads;
    }
    @Override
    public String play()
    {
        // put your code here
        return "The Hydra does a ventriloquism act with " + heads + " puppets.";
    }
    @Override 
    public String makeNoise()
    {
        return "Hail Hydra!";
    }
    
    @Override 
    public String eat()
    {
        return "The hydra eats a massive great white shark and a octopus, just because.";
    }
    
    @Override 
    public String walk()
    {
        return "The hydra walks away from the explosion behind it.";
    }
    
    @Override
    public String swim()
    {
        return "The hydra glides through the water like how a knife cuts through butter.";
    }
}
