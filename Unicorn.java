public class Unicorn extends Animal implements Walk, Swim
{
    private String toy;
    
    public Unicorn()
    {
        super("Sasha", "A sparkling unicorn");
        toy = "Cow";
    }
    
    public Unicorn(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    
    public String attitude()
    {
        return "The unicorn stabbed someone in the head because they stole her " + toy + ".";
    }
    
    @Override 
    public String makeNoise()
    {
        return "Neighhhhhh";
    }
    @Override 
    public String play()
    {
        return "The unicorn plays with its " + toy + ".";
    }
    @Override 
    public String eat()
    {
        return "The unicorn drinks the blood of humans to survive.";
    }
    
    @Override
    public String walk()
    {
        return "The unicorn can walk, but mainly gallops.";
    }

    
    @Override
    public String swim()
    {
        return "The unicorn tried to swim and drowned.";
    }
}
