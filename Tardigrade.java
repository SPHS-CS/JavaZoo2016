public class Tardigrade extends Animal implements Walking, Swimming 
{
    private String toy;
    
    public Tardigrade()
    {
        super("Tartar", "Tardigreat");
        toy = "leaf";
    }
    
    public Tardigrade(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "qoooooeeeeuuk?";
    }
    
    @Override
    public String eat()
    {
        return "The tardigrade consumes a droplet of water.";
    }
    
    @Override
    public String play()
    {
        return "The tardigrade waddles around with its " + toy + ".";
    }
    
    @Override
    public String walk()
    {
        return "The tardigrade wiggles its fat lumpy feet around and gains a few centimeters forward.";
    }
    
    @Override
    public String swim()
    {
        return "The tardigrade leaps into the pond, water diffusing through its epithelium.";
    }
    
    public String torpor()
    {
        return "The tardigrade shrivels up due to a lack of water. It's too dry!";
    }

    public String revive()
    {
        return "The rainfall replenishes the lake and the tardigrade soaks up the h20 like a sponge.";
    }

}