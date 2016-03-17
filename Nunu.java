public class Nunu extends Animal implements Walking
{
    public Nunu()
    {
        super("Nunu", "The Yeti Rider");
    }
    
    public Nunu(String name, String description)
    {
        super(name, description);
    }
    
    public String makenoise()
    {
        return "h4h4h4h4h4h4h4h4h4";
    }
    
    public String play()
    {
        return super.getName() + " throws a snowball at you. h4h4";
    }
    
    public String eat()
    {
        return super.getName() + " happily consumes a minion. h4h4";
    }
    
    @Override
    public String walk()
    {
        return super.getName() + " blood boils and waddles away. h4h4";
    }
}