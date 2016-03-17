public class Mr_Shorr extends Animal implements Walking, Swiming, Flying, Awesoming
{
    private String z;
    public Mr_Shorr()
    {
        super("Garrett", "Shorr");
        z = "comp sci god";
    }

    public Mr_Shorr(String q, String a, String z)
    {
        super(q, a);
        this.z = z;
    }
    
    @Override
    public String noise()
    {
        return "Daniel.... please.";
    }
    
    @Override
    public String eat()
    {
        return "Elizabeth Kaplan";
    }
    
    @Override
    public String play()
    {
        return "Blazing fast speed typing race.";
    }
    
    @Override
    public String fly()
    {
        return "I didn't let the bear fly";
    }
    
    @Override
    public String walk()
    {
        return "Activating them marathon running powers.";
    }
    
    @Override
    public String swim()
    {
        return "Who needs to swim when I can walk on water?";
    }
    
    @Override
    public String awesome()
    {
        return "It's over 9000!!!";
    }
}
