public class Turtlecopter extends Animal implements Walking, Swimming, Flying
{
    private String toy;
    
     public Turtlecopter()
    {
        super("Turtle", "A Turtle (duh)");
        toy = "American infrastructure";
    }

    public Turtlecopter( String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }

    @Override
    public String makeNoise()
    {
        return "MOOO";
    }

    @Override
    public String play()
    {
        return "The turtle plays with its " + toy + ".";
    }

    @Override
    public String eat()
    {
        return "The bear eats your dank memes, rendering you powerless";
    }
    
    @Override
    public String walk()
    {
        return "The turtle angrily walks away. This will take a while...";
    }
    
    @Override
    public String swim()
    {
        return "The turtle triple backflips and summons the all powerful lettuce leaf.Then he swims away";
    }
    
    @Override
    public String fly()
    {
        return "The turtle activates his super mighty omega awesome cool shiny powerful sexy propeller wings and flies away gracefully.";
    }
}