
/**
 * Write a description of class Chard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chard extends Animal implements Walking,Swimming
{
    private String toy;
    
    public Chard()
    {
        super("Richard", "Little Michael");
        toy = "laptop";
    }
    public Chard(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    @Override
    public String play()
    {
        return "The chard pulls out his " + toy + " and begins to play League of Legends. He surrenders at 20.";
    }
     @Override
    public String eat()
    {
        return "The chard walks over to the fridge, sees there is nothing, and decides to go to Roscoe's instead. He gets the Obama's Special.";
    }
     @Override
    public String makeNoise()
    {
        return "The chard yells 'BAKANA!'. Harry can be heard a distance away saying 'Don't say that!'";
    }
    @Override
    public String swim()
    {
        return "The chard gets in the water, but quickly exits because it is too cold for him. The water is 80 degress fahrenheit.";
    }
    @Override
    public String walk()
    {
        return "The chard walks across the enclosure with much swagger.";
    }
}
