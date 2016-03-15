public class Gnu extends Animal implements Walking, Swimming
{
    private String toy;
    //private String tellJoke;
    
    public Gnu()
    {
        super("NewGnu", "Wildebeest");
        toy = "rope toy";
        //tellJoke = "What's new? An animal at the zoo.";
    }
    
    public Gnu(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
        //this.tellJoke = tellJoke;
    }
    
    @Override
    public String makeNoise()
    {
        return "BELLOW";
    }
    
    @Override
    public String eat()
    {
        return "The gnu eats grass.";
    }
    
    @Override
    public String play()
    {
        return "The gnu plays with its " + toy + ".";
    }
    
    @Override
    public String walk()
    {
        return "The gnu gallops gallantly over the grass.";
    }
    
    @Override
    public String swim()
    {
        return "The gnu tries to keep its head above water.";
    }
    
    public String tellJoke()
    {
        return "What's new? An animal at the zoo.";
    }
}