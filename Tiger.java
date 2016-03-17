
/**
 * Write a description of class Tiger here.
 * 
 * @author (Simon Stans) 
 * @version (a version number or a date)
 */
public class Tiger extends Animal implements Walking
{
    private String toy;
    /**
     * Constructor for objects of class Tiger
     */
    public Tiger()
    {
        super("Tiger", "A fierce striped tiger");
        toy = "twigs";
    }

    public Tiger(String name, String descript)
    {
        super(name, descript);
        this.toy = toy;
    }

    public String makeNoise()
    {
        return "RAWR RAWRRRRRRR!";

    }

    public String play()
    {
        return "The " + super.getName() + "plays with some" + toy + "."; 

    }

    public String eat()
    {
        return "It eats some red meat for lunch";

    }
    
    @Override
    public String walk()
    {
        return "The Tiger walks towards the visitors in the zoo";

    }
}
