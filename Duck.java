public class Duck extends Animal implements Walking, Swimming, Flying
{
    public String toy;
    public Duck()
    {
        super("Duck", "A Donald Duck");
        toy = "vaults of gold";
    }
    
    public Duck(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "QUACK!";
    }
    
    @Override
    public String play()
    {
        return "The duck plays with its " + toy;
    }
    
    @Override
    public String eat()
    {
        return "The duck nibbles on stale bread crumbs.";
    }
    
    public String fly()
    {
        return "The duck flies...landing in piles of gold.";
    }
    
    @Override 
    public String walk()
    {
        return "The duck waddles away.";
    }
    
    @Override
    public String swim()
    {
        return "The duck swims in its gold.";
    }
}