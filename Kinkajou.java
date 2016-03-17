public class Kinkajou extends Animal implements Walking, Swimming
{
    private String toy;
    
    public Kinkajou()
    {
        super("Kinakajou", "Known as the honey bear");
        toy = "banana";
    }
    
    public Kinkajou(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    public String makeNoise() 
    {
        return "Oink!";
    }
    
    public String play()
    {
        return "The " + super.getName() + 
                " plays with its " + toy + ".";
    }
    
    public String eat()
    {
        return "It eats some cucumbers and fried chicken.";
    }
    @Override
    public String walk()
    {
        return "The kinkajou puts on some nikes and jumps away.";
    }
    @Override
    public String swim()
    {
        return "The kinkajou puts on a bikini and swimns away.";
    }
}
