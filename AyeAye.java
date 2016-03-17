public class AyeAye extends Animal implements Walking, Swimming
{
    private int fingerLength;
    
    public AyeAye()
    {
        super("Aye-Aye", "The ugliest animal of all.");
        fingerLength = 5;
    }
    
    public AyeAye(String name, String description, int fingerLength)
    {
        super(name, description);
        this.fingerLength = fingerLength;
    }
    
    public String makeNoise()
    {
        return "eeeeeek";
    }
    
    public String play()
    {
        return "The " + super.getName() + " plays by itself because it has no friends.";
    }
    
    public String eat()
    {
        return "It eats some fruit.";
    }
    
    @Override
    public String walk()
    {
        return "The Aye-Aye walks around";
    }
    
    @Override
    public String swim()
    {
        return "The Aye-Aye doesn't know how to swim but goes into the river anyways because it's too ugly to live.";
    }
}