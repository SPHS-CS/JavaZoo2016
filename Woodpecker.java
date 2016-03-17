public class Woodpecker extends Animal implements Walking, Flying
{
    //"implements" for interface
    private String tree;

    public Woodpecker()
    {
        super("Sapsucker Woodpecker", "Red Naped Sapsucker Yellow-bellied Sapsucker");
        tree = "pines";
    }
    
    public Woodpecker(String name, String desc, String tree)
    {
        super(name, desc);
        this.tree = tree;
        
    }
    
    @Override
    public String makeNoise()
    {
        return "dadadada. queeh-eh!";
    }
    
    @Override
    public String eat()
    {
        return "The woodpecker eats insect from the tree.";
    }
    
    public String fly()
    {
        return "The woodpecker can fly.";
    }
    
    @Override
    public String walk()
    {
        return "The woodpecker don't actually walk but jump.";
    }
    
    @Override
    public String play()
    {
        return "The wodpecker plays the drum.";
    }
   
}