
/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Animal implements Swimming,Walking,Flying
{
    // instance variables - replace the example below with your own
    private String toy;
    public Pikachu()
    {
        super("chuchu", "the cutest pokemon / animal on planet");
        toy = "his owner";
    }
    public Pikachu(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override public String makeNoise()
    {
        return "pikapi, Pikachuuuuuuuuuuu!";
    }
    
    @Override
    public String eat()
    {
        return "Pikachu eats ten bottles of ketchup";
    }
    
    @Override
    public String play()
    {
        return "Pikachu plays with " + toy + " by hugging.";
    }
    
    @Override
    public String fly()
    {
        return "Pikachu flies with balloons tied on its hands";
    }
    @Override
    public String walk()
    {
     return "Pikachu crawls when it's tired; it hops when it's happy ." ; 
    }
    
    @Override
    public String swim()
    {
        return "Pikachu swims with a floaty, enjoying the sunshine.";
    }
}
