public class Monkey extends Animal implements Walking
{
    private String banana;
    
    public Monkey()
    {
        super("Monkey", "Monkey eats banana.");
    }
    
    public Monkey(String name, String desc, String banana)
    {
        super(name, desc);
        this.banana = banana;
    }
    
     public String makeNoise()
    {
        return "HEHEHEHE!";
        
    }
    
    public String play()
    {
        return "The " + super.getName() + " plays with its " + banana + ".";
}
 
public String eat()
{
    return "It eats too many food";
    
}

@Override
public String walk()
{
    return "The monkey walks in my school but my teacher threatened it to go back to the zoo.";
}

  
}