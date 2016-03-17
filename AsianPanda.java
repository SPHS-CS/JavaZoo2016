public class AsianPanda extends Animal implements Walking
{
    private String bamboon;

    public AsianPanda()
    {
        super("Panda", "Panda is da best");
        bamboon = "other pandas";
    }

    public AsianPanda(String name, String desc, String bamboon)
    {
        super(name, desc);
        this.bamboon = bamboon;
    }

    @Override
    public String makeNoise()
    {
        return "I KNOW KUNGFUUU";

    }

    public String play()
    {
        return "The " + super.getName() + " plays with its " + bamboon + ".";
    }

    public String eat()
    {
        return "a lot of dumplings and bamboon";
    }

    public String fight()
    {
        return "The AsianPanda used his ultimate move, the drunken style.";
    }

    @Override
    public String walk()
    {
        return "The AsianPanda lost the fight so he starts to run away";
    }
}