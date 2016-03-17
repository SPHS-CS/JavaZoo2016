public class tWolf extends Animal implements Walking, Swimming
{
    private String toy;
    
    public tWolf()
    {
        super("Tasmanian Wolf", "Just your average extinct marsupial.");
        toy = "stuffed kangaroo";
    }
    
    public tWolf(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    
    public String makeNoise()
    {
        return "Growl! Hey get the heck out of here!";
    }
    
    public String play()
    {
        return "The " + super.getName() + " plays with the " + toy + " like an animal.";
    }
    
    public String eat()
    {
        return "The " + super.getName() + " lovingly eats kangaroo meat.";
    }
    
    public String drink()
    {
        return "The " + super.getName() + "drinks and drinks until his wife leaves him.";
    }
    
    public String walk()
    {
        return "The " + super.getName() + " prowls across the exhibit.";
    }
    
    public String swim()
    {
        return "The " + super.getName() + " doggy paddles across the artificial river";
    }
}
