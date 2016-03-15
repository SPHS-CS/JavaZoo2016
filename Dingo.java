public class Dingo extends Animal implements Walking
{
    private String toy;
    
    public Dingo()
    {
        super("dingo", "The Australian Dog.");
        toy = "another dingo";
    }
    
    public Dingo(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    
    public String makeNoise()
    {
        return "grr";
    }
    
    public String eat()
    {
        return "It eats some fresh roadkill.";
    }
    
    public String play()
    {
        return "The " + super.getName() + " wrestles with " + toy + ".";
    }
    
    @Override
    public String walk()
    {
        return "The dingo magestically prances across the outback.";
    }
}