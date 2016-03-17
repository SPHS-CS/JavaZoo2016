public class Hippo extends Animal implements Walking, Swimming, Flying
{
    public Hippo()
    {
        super("Gloria", "The Hippo from Madagascar");
    }
    public Hippo (String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String makeNoise()
    {
        return "Hello, I am a lazy animal";
    }
    @Override
    public String play()
    {
        return "The Hippo jumps in the water, but sinks to the bottom";
    }
    @Override
    public String eat()
    {
        return "The Hippo eats a nearby talking fish";
    }
    @Override
    public String fly()
    {
        return "The Hippo gets in its helicopter and flys away";
    }
    @Override
    public String swim()
    {
        return "The Hippo tries to backflip into the water, but fails miserably";
    }
    @Override
    public String walk()
    {
        return "The Hippo tries to walk, but fails because it's too fat.";
    }
}