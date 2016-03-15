public class Pigeon extends Animal implements Walking, Swimming, Flying
{
    private String toy;
    
    public Pigeon()
    {
        super("Pigeon", "The classic pigeon");
        toy = "Iphone 6";
    }
    
    public Pigeon(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    public String makeNoise() 
    {
        return "cluck cluck cluck!";
    }
    
    public String play()
    {
        return "The " + super.getName() + 
                " plays with its " + toy + ".";
    }
    
    public String eat()
    {
        return "It chips away at a bowl of nuts and seeds.";
    }
    
    @Override
    public String walk()
    {
        return "The pigeon walks around with its head bobbing...";
    }
    
    @Override
    public String swim()
    {
        return "The pigeon floats";
    }
    
    @Override
    public String fly()
    {
        return "The pigeon unfolds its wings and flies away";
    }
}