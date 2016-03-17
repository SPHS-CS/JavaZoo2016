public class Hippocampus extends Animal implements Swimming
{
    private String color;
    
    public Hippocampus()
    {
        super("Hippocampus", "A lithe creature, half seahorse and half fish.");
        color = "rainbow";
    }
    
    public Hippocampus(String name, String desc, String color)
    {
        super(name, desc);
        this.color = color;
    }
    
    public String eat()
    {
        return "The " + super.getName() + " munches on seaweed.";
    }
    
    public String play()
    {
        return "The " + color + " " + super.getName()  + " frolics in the sea water.";
    }
    
    public String makeNoise()
    {
        return "Neigh!";
    }
    
    @Override
    public String swim()
    {
        return "The Hippocampus gracefully glides through the water at 30 mph.";
    }
}
