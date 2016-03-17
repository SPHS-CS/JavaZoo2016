public class BobbittWorm extends Animal implements Swimming, Digging, Snapping
{
    private String toy;
    
    public BobbittWorm()
    {
        super("Bobbitt Worm", "Scary rainbow worm");
        toy = "innocent creatures";
    }
    
    public BobbittWorm(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    public String makeNoise() 
    {
        return "CRUNCH!";
    }
    
    public String play()
    {
        return "The " + super.getName() + 
                " plays with its " + toy + ".";
    }
    
    public String eat()
    {
        return "It eats some passing fish.";
    }
    
    @Override
    public String swim()
    {
        return "The bobbitt worm wriggles gracefully through the sea, its rainbow aura shining around its path.";
    }
    @Override
    public String digging()
    {
        return "The terrifying head of the bobbitt worm disappears in the sand, followed by its long, long body.";
    } 
    @Override
    public String snap()
    {
        return "The bobbitt worm rears its head and snaps its fearsome jaws, crushing all between it instantly";
    } 
}
