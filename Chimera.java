public class Chimera extends Animal implements walking, flying, fireBreathing, talking
{
    private String toy;
    
    public Chimera()
    {
        super("Chimera", "A greek mythology creature");
        toy = "human";
    }
    
    public Chimera (String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "RAWRHSSSSSSSS";
    }
    
    @Override
    public String play()
    {
        return "The Chimera plays with its " + toy + ".";
    }
    
    @Override
    public String eat()
    {
        return "Do not feed or throw foods at Chimera. Chimera will find its food by himself. Watch out, you may be the target!";
    }
    
    @Override
    public String walk()
    {
        return "The Chimera walks as if he was a lion.";
    }
    
    @Override
    public String fly()
    {
        return "The Chimera flys like an eagle";
    }
    
    @Override
    public String fireBreath()
    {
        return "The Chimera makes a fire breathing effects like charman";
    }
    
    @Override
    public String talk()
    {
        return "The Chimera talks but you cant hear it because 3 creature talks at the same time.";
    }

}