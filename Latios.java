public class Latios extends Animal implements Swimming, Flying
{
    private int level;
    private String toy;
    
    public Latios()
    {
        super("Latios","#381: Latios will only open its heart to a Trainer with a compassionate spirit. \nThis Pokémon can fly faster than a jet plane by folding its forelegs to minimize air resistance.");
        level = 30;
        toy = "soul dew";
    }
    
    public Latios(String name, String description, String toy, int level)
    {
        super(name, description);
        this.level = level;
        this.toy = toy;
    }
    
    public void gainLevel()
    {
        level ++;
        System.out.println("Latios gained a level!");
    }
    
    public void gainLevel(int n)
    {
        level += n;
        System.out.println("Latios gained " + n + " levels!");
    }
    
    public int getLevel()
    {
        return level;
    }
    
    @Override
    public String makeNoise()
    {
        return "RAWR";
    }
    
    @Override
    public String eat()
    {
        return "Latios is eating berries off a tree";
    }
    
    @Override
    public String play()
    {
        return "Latios is playing with its " + toy;
    }
        
    @Override
    public String swim()
    {
        return "Latios used Surf! Latios use Dive!";
    }
    
    @Override
    public String fly()
    {
        return "Latios megaevolved and used Fly!";
    }
}