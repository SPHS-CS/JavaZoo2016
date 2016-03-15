public class Tarsier extends Animal implements Walking, Swimming
{
    private String toy;
    public Tarsier()
    {
        //provide description
        super("Tarsier", "A Tree-dwelling, nocturnal primate native to Southeast Asia.");
        toy = "Banana Leaves";
    }
    public Tarsier(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    public String makeNoise()
    {
        return "Screeeeeeeeeech!";
    }
    public String play()
    {
        return "The " + super.getName() + " plays with its " + toy + ".";
    }
    public String eat()
    {
        return "It eats a dark green lizard climbing up its tree.";
    }
    public String fly()
    {
        return "The tarsier leaps from its high branch to another tree across the pond.";
    }
    
    @Override
    public String walk()
    {
        return "The tarsier sluggishly climbs up the tree.";
    }
    @Override
    public String swim()
    {
        return "The tarsier leaps via the lily pads on the warm pond.";
    }
}