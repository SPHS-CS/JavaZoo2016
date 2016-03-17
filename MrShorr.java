public class MrShorr extends Animal implements Walking, Swimming, Flying
{
    private String laptop;

    public MrShorr()
    {
        super("Shorrpocalypse the Undying", "The mightiest of Shorrs");
        laptop = "Macbook";
    }

    public MrShorr (String name, String description, String laptop)
    {
        super (name, description);
        this.laptop = laptop;
    }

    @Override
    public String makeNoise()
    {
        return "Mr.Shorr looks off into the distance -- 'Use your inner BlueJ....'";
    }

    @Override
    public String play()
    {
        return "Mr. Shorr decides he feels like hacking Nasa and the CIA.  In 15 minutes he switches their protocols.  The CIA then assassinates the moon, while Nasa lands a rover on a Syrian dictator.";
    }

    @Override
    public String eat()
    {
        return "Mr. Shorr eats no food, but consumes 8 packs of pepsi.";
    }

    @Override
    public String walk()
    {
        return "Mr. Shorr does not walk, but instead backflips everywhere he goes.";
    }

    @Override
    public String swim()
    {
        return "Splish Splash, Mr. Shorr has some fun in the water.  Within 3 minutes he is surrounded by women.";
    }

    @Override
    public String fly()
    {
        return "Mr. Shorr launches himself into the sky, soaring above the compound and out of the zoo.  'Believe in your dreams,' he wispers.";
    }
}
