public class Sloth extends Animal implements Swimming, Walking
{
    private String toy;
    public Sloth()
    {
        super("Sloth", "medium-sized mammals belonging to the families Megalonychidae (two-toed sloths) and Bradypodidae (three-toed sloths), classified into six species");
        toy = "tree branch";
    }
    
    public Sloth(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    public String makeNoise()
    {
        return "Sloth : ZzzzzZ...";
    }
    
    public String play()
    {
        return "The " + super.getName() + " sleeps with its " + toy + ".";
    }
    
    public String eat()
    {
        return "It eats some Nap Nap fruit.";
    }
    
    public String walk()
    {
        return "The sloth crawls on trees.";
    }
    
    public String swim()
    {
        return "Then the sloth dives into the Amazon River";
    }
    
}