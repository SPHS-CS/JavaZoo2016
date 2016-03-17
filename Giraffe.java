
public class Giraffe extends Animal implements Walking
{
    private String toy;
    public Giraffe()
    {
        super("Giraffe", "This one has a 317.5 foot neck.");
        toy = "stilts";
    }

    public Giraffe(String name, String description, String toy)
    {
        super(name,description);
        this.toy = toy;
    }

    @Override
    public String makeNoise()
    {
        return "...";
    }

    @Override
    public String play()
    {
        return "It is playing with its " + toy + ".";
    }

    @Override
    public String eat()
    {
        return "The giraffe eats the tallest tree it can find.";
    }

    @Override
    public String walk()
    {
        return "the giraffe stands on its " + toy + " and becomes even taller.";
    }
}
