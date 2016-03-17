

public class Beholder extends Animal implements Flying, Swimming
{
    private String toy;
    
    public Beholder()
    {
        super("Beholder", "A floating orb of flesh with a large mouth, single central eye, and many smaller eyestalks on top with deadly magical powers.");
        toy = "Book of Evil Spells";
    }
    
    public Beholder(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "*Insert laser sounds here*";
    }
    
    @Override
    public String play()
    {
        return "The Beholder tries to read its " + toy + ", but it cannot open it.";
    }
    
    @Override
    public String eat()
    {
        return "The Zookepers tremple in fear as they feed it the bodies of fallen heros";
    }
    
    @Override 
    public String fly()
    {
        return "The Beholder hovers around its inclosed area wishing to go back to its cave";
    }
    
    @Override 
    public String swim()
    {
        return "The Beholder tries to get in the water, but it is hovering above it";
    }
}
