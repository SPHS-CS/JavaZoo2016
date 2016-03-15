public class Shuckle extends Animal implements Walking, Swimming
{
    private String toy;
    public Shuckle()
    {
        super("Shuckle", "The best pokemon.");
        toy = "your face";
    }

    public Shuckle(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }

    public String makeNoise()
    {
        return "lol.";
    }

    @Override
    public String play()
    {
        return "The " + super.getName() + " plays with its " + toy + ".";
    }

    public String eat()
    {
        return "It eats your face";
    }

    public String attack1()
    {
        return "Shuckle uses Roll-Out!";
    }

    public String attack2()
    {
        return "Shuckle uses Gastro Acid!";
    }

    public String attack3()
    {
        return "Shuckle uses Stone Edge!";
    }

    @Override
    public String walk()
    {
        return "Shuckle crawls away.";
    }

    @Override
    public String swim()
    {
        return "Shuckle drowns.";
    }
}
