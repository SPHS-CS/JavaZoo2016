
/**
 * Rosemary Chou
 * Period:3
 */
public class Unipoturtlandacorn extends Animal
{
    private String toy;
    
    public Unipoturtlandacorn()
    {
        super("Unipoturtlandacorn", "Tis a hybrid of a unicornea, a ponda, a turdle, and a po tay to");
        toy = "lop eared bunny";
        
    }
    public Unipoturtlandacorn(String name, String desc, String toy)
    {
        super(name,desc);
        this.toy = toy;
    }
    @Override
    public String makeNoise()
    {
        return "*sparkle sparkle sparkle*";
    }
    @Override
    public String play()
    {
        return "The Unipoturtlandacorn is too sophisticated and mystical to play with you.";
    }
    @Override
    public String eat()
    {
        return "It sucks the elements of the earth from the existing air around you.";
    }
    
}