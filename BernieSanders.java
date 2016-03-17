
public class BernieSanders extends Animal implements Walking, Swimming
{
    public String toy;
    
    public BernieSanders()
    {
        super("Bernie Sanders" , "The Last Hope");
        toy = "Donald Trump";
    }
    
    public BernieSanders(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "HIllary I swear to God. I was talking.";
    }
    @Override
    public String play()
    {
        return "Bernie spits fire at " + toy + ".";
    }
    @Override
    public String eat()
    {
        return "Bernie eats Green Eggs and Ham";
    }
    @Override
    public String walk()
    {
        return "Bernie berns Wall Street as he walks away";
    }
    @Override
    public String swim()
    {
        return "Bernie swims a 15 second 200m backstroke";
    }
    
}
