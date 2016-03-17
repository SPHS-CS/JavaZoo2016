public class Shrek extends Zoo implements Walking, Swimming, Eating, Killing, Hitting, Sleeping
{
    private String toy;

    public Shrek()
    {
        super("Shrek", "Shrek");
        toy = "ball";
    }

    public Shrek(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }

    public String makeNoise() 
    {
        return "WAWOO!";
    }

    public String play()
    {
        return "The " + super.getName() + 
        " plays with its " + toy + ".";
    }

    public String eat()
    {
        return "He enjoyed some human beings";
    }

    @Override
    public String walk()
    {
        return "The Shrek chuckles as he walk";
    }
    
    @Override
    public String swim()
    {
        return "He swims and drown";
    }
    @Override
    public String kill()
    {
        return "He kills";
    }
    @Override
    public String sleep()
    {
        return "He slept";
    }
    @Override
    public String hit()
    {
        return "He punches";
    }
}