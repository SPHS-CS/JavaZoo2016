
public class FlashTheSloth extends Animal implements Walking, Swimming, Flying
{
    private String toy; 
    public FlashTheSloth()
    {
        super("Flash Flash Hundred Yard Dash", "Fastest Sloth in Zootopia"); 
        toy = "Ferrari"; 
    }
    
    public FlashTheSloth(String name, String desc, String toy) 
    {
        super(name, desc); 
        this.toy = toy; 
    }
    
    @Override 
    public String makeNoise()
    {
        return "How.............are............you...........doing.........today?"; 
    }
    
    @Override 
    public String play()
    {
        return "Flash speeds down mainstreet in his suped up " + toy + "."; 
    }
    
    @Override 
    public String eat()
    {
        return "The sloth eats his candy bar."; 
    }
    
    @Override 
    public String walk()
    {
       return "Stumbles acround with a Dos Equis in his hand";
    }
    
    @Override 
    public String swim()
    {
       return "Flash dives into the ocean and begins his daily laps at 100000 miles per hour";
    }
    
    @Override
    public String fly()
    {
        return "By flying, I mean he flies away from the popo along with his amazing driving skills"; 
    }
}