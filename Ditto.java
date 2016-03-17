public class Ditto extends Animal implements Walking, Swimming, Flying
{
    private String toy; 

    public Ditto()
    {
        super("Ditto", "Shiny Ditto");
        toy = "EXPShare";
    }

    public Ditto(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;

    }

    @Override
    public String makeNoise()
    {
        return "aiowejfoiajwefoj";
    }

    @Override
    public String play()
    {
        return "The ditto plays with its " + toy + ".";
    }

    @Override
    public String eat()
    {
        return "This ditto eats and transforms";
    }

    @Override
    public String fly()
    {
        return "The ditto believes it can fly and does";
    }

    @Override 
    public String walk()
    {
        return "The ditto transforms and walks away";

    }
    @Override
    public String swim()
    {
        return "The ditto swims away peacefully";  
    }

}
