
public class MindFlayer extends Animal implements Walking, Flying
{
    private int tendril;
    public MindFlayer()
    {
        super("Bear", "Your typical maurading bear.");
        tendril = 10;
    }

    public MindFlayer(String name, String desc, int tendrils)
    {
        super(name, desc);
        this.tendril = tendrils;
    }
    
    @Override
    public String eat()
    {
        return "Sticks its tendrils in your face orafaces and devours your mind";
    }
    
    public String control()
    {
        return "Reaches into your thoughts and gains control of your body";
    }
    public String makeNoise()
    {
        return "MindFlayers don't make noise, They just stare at you silently";
    }

    @Override
    public String walk()
    {
        return "Slowly walks toward you as you cower in fear";
    }

    @Override
    public String fly()
    {
        return "Levitate off the ground and drift around";

    }
    
    @Override
    public String play()
    {
        return "Mind Flayers don't have fun";
    }
}
