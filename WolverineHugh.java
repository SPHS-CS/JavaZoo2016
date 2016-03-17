public class WolverineHugh extends Animal implements Walking, Swimming, Flying
{
    private String sharpener;

    public WolverineHugh()
    {
        super("Australian", "native or inhabitant of Australia, or a person of Australian descent");
        sharpener = "KitchenIQ Edge Grip 2 Stage Knife Sharpener";
    }

    public WolverineHugh(String name, String desc, String sharpener)
    {
        super(name, desc);
        this.sharpener = sharpener;
    }
    
    @Override
    public String makeNoise()
    {
        return "Shhhhink";
    }
    
    @Override
    public String play()
    {
        return "The Wolverine plays with its " + sharpener + ".";
    }
    
    @Override
    public String eat()
    {
        return "He goes to the nearest burger shop and eats all the meat.";
    }
    
    @Override 
    public String walk()
    {
        return "he walks away lol.";
    }
    
    @Override 
    public String swim()
    {
        return "he swims away lol.";
    }
    
    @Override
    public String fly()
    {
        return "his claws expands into wings and he flys away.";
    }
}
