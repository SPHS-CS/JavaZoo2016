public class Panda extends Animal implements Walking, Swimming, MartialArts
{
    private String weapon;
    
    public Panda()
    {
        super("Po", "KungfuMaster");
        weapon = "Sword of Heroes";
    }
    
    public Panda(String name, String description, String weapon)
    {
        super(name,description);
        this.weapon = weapon;
    }
    
    @Override
    public String makeNoise()
    {
        return "HayYAAA!";
    }
    
    @Override
    public String eat()
    {
        return "A bowl of noodle.";
    }
    
    @Override 
    public String play()
    {
        return "The panda uses the " + weapon +".";
    }
    
    public String fly()
    {
        return "The KungFu master flies wearing Master Flying Rhino's armor.";
    }
    
    public String walk()
    {
        return "Sometimes Po is too lazy to walk.";
    }
    
    public String swim()
    {
        return "Swim to relax.";
    }
    
    public String martialarts()
    {
        return "The KungFu master practices martial art to protect his village.";
    }
    
    
}