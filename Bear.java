public class Bear extends Animal implements Walking, Swimming
{
    private String toy;
    
    public Bear()
    {
        super("Pizzly Bear", "Grizzly Polar bear");
        toy = "unicycle";
    }
    
    public Bear(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "rawr?  Is that what you want?";
    }
    
    @Override
    public String eat() 
    {
        return "The bear eats an entire picnic basket, including the picnic basket.";
    }
    
    @Override
    public String play()
    {
        return "The bear plays with its " + toy + ".";
    }
    
    @Override
    public String walk()
    {
        return "The bear tips its cap and walks away.";
    }
    
    @Override
    public String swim()
    {
        return "The bear swims doggie paddle.";
    }
    
}





