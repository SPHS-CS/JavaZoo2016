public abstract class IsaacMa extends Animal implements Walking, Flying
{
    private String toy;
    public IsaacMa()
    {
        super("Isaac Ma","The coolest kid on campus.");
        toy = "high school graduation status";
    }
    
    public IsaacMa(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    public String makeNoise()
    {
        return "That's lame";

    }
    public String play()
    {
        return "The " + super.getName() + " plays with its " + toy + ".";
    }
    
    public String eat()
    {
        return "The Ma does not think eating is cool.";
    }
    
    @Override 
    public String walk()
    {
        return "The Ma doesn't walk. He runs and jumps over hurdles.";
    }
    
    @Override
    public String fly()
    {
        return "The Ma lied about his ability to fly";
    }
}