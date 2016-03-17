public class Gnar extends Animal implements Walking
{
    private String toy;
    
    public Gnar()
    {
        super("Gnar", "Your typical cute yordle.");
        toy = "Boomerang";
    }
    
    public Gnar(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    
    public String makeNoise()
    {
        return "GNARRR!";
    }
    
    public String play()
    {
        return super.getName() + " throws his " + toy + " and runs to catch it.";
    }
    
    public String eat()
    {
        return "It eats some .";
    }
    
    @Override
    public String walk()
    {
        return "Gnar runs and hides in the bush.";
    }
    
    public String rageBar(int i)
    {
        if (i*2 > 100)
        {
            return "Gnar immediately transforms into a giant monster, he has " + 100 + " rage!!!!! RUNN!!";
        }
        else
            return "Gnar is happy today, he has " + i*2 + " rage";
    }
}
    
