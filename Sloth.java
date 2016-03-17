public class Sloth extends Animal implements Walking, Swimming, Flying
{
    public Sloth()
    {
        super("Studentus commonus", "Accomplishes absolutely nothing, requires 10 food per hour.");
    }

    public Sloth(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String makeNoise()
    {
        return "The sloth requests more food";
    }

    @Override
    public String play()
    {
        return "Sloth does not play, sloth only eats.";
    }

    @Override
    public String eat()
    {
        return "The sloth eats. The sloth wants more food.";
    }

    @Override
    public String walk()
    {
        return "hah";
    }

    @Override
    public String swim()
    {
        return "Good luck with that.";
    }

    @Override
    public String fly()
    {
        return "The sloth falls to the ground. It requests more food.";
    }

    public String slap()
    {
        return "HOW CAN SHE SLAP";
    }
}