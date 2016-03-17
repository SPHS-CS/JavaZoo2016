public class FlyingSpaghettiMonster extends Animal implements Swimming 
{
    private String toy;
    
    public FlyingSpaghettiMonster()
    {
        super("Pizzly Bear", "A real good bear.");
        toy = "unicycle";
    }
    
    public FlyingSpaghettiMonster(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    @Override
    public String makeNoise()
    {
        return "Slurp Slurp";
    }
    @Override
    public String eat()
    {
        return "The Flying Spaghetti monster consumes another world";
    }
    @Override
    public String play()
    {
        return "The flying spaghetti monster's tentacles cover an entire contry, world hunger = cured.";
    }
    @Override
    public String swim()
    {
        return "What is that thing in the ocean? Oh. Well, I lived a good life.";
    }
}