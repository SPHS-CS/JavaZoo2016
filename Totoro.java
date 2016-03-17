public class Totoro extends Animal implements Walking, Flying
{
    private String toy;
    
    public Totoro()
    {
        super("Totoro", "The one and only totoro.");
        toy = "umbrella";
    }
    
    public Totoro(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    public String eat()
    {
        return "It eats a rice ball.";
    }
  
    public String makeNoise()
    {
        return "*silence*";
    }
    
    public String play()
    {
        return "The " + super.getName()
        + "opens and holds up its " + toy + "...";
    }
    
    @Override
    public String walk()
    {
        return "Totoro just stands there...";
    }
    
    @Override
    public String fly()
    {
        return "Totoro slowly floats up with his umbrella in the air and floats away...";
    }
   
}
