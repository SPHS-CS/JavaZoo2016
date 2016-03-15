
/**
 * Write a description of class Kevin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kevin extends Animal implements Swimming, Flying
{
    private String toy;
    public Kevin()
    {
        super("Kevin", "A swimming flying tiger");
        toy = "Ryan";
    }
    public Kevin(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    public String eat()
    {
        return "It eats chocolate.";
    }
    public String makeNoise()
    {
        return "Mrrrrrhghgksjasdlkfaklsd";
    }
    public String play()
    {
        return "It tosses Ryan around.";
    }
    public String walk()
    {
        return "The bear tips its cap and walks away.";
    }
    @Override
    public String swim()
    {
        return "The bear swims doggle paddle.";
    }
    @Override
    public String fly()
    {
        return "The Kevin flies and crashes.";
    }
}
