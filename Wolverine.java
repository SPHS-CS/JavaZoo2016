public class Wolverine extends Animal implements Walking, Swimming, Flying
{
    public Wolverine()
    {
        super("Wolverine", "A wild predatory animal, has a reputation for its ferocity and strength");
    }

    public Wolverine(String name, String desc)
    {
        super(name, desc);
    }

    @Override
    public String makeNoise()
    {
        return "Snikt";
    }

    @Override
    public String play()
    {
        return "You wanna play, bub?";
    }

    @Override
    public String eat()
    {
        return "Don't throw your peanuts at me, I'm not an animal!";
    }

    @Override
    public String walk()
    {
        return "Stop ordering me around or I'll cut your head off!";
    }

    @Override
    public String swim()
    {
        return "I can't swim! Do you know how heavy my adamantium skeleton is?";
    }

    @Override
    public String fly()
    {
        return "You want me to fly? Sorry bub, you're asking the wrong mutant";
    }

    public String SayHi()
    {
        return "Hey! Who put me in this cage? I'm not an animal. get me out of here!";
    }
}