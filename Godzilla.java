public class Godzilla extends Animal implements Walking, Swimming, Flying
{
    private String toy;
    
    public Godzilla()
    {
        super("Godzilla", "A gigantic half-gorilla half-whale nuclear scary creature");
        toy = "Nuclear Radiation";
    }
    
    public Godzilla(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
        
    }
    
    @Override
    public String makeNoise()
    {
        return "Roar.";
    }
    
    @Override
    public String play()
    {
        return "Godzilla decides to play with his favorite toy, " + toy + ".";
    }
    
    @Override
    public String eat()
    {
        return "Godzilla is not hungry.";
    }
    
    @Override 
    public String walk()
    {
        return "Godzilla accidentally destroys a sacred shrine when he takes a step.";
    }
    
    @Override
    public String swim()
    {
        return "Godzilla swims into the Earth's core.";
    }
    
    @Override
    public String fly()
    {
        return "Godzilla transforms into Mothra and flys away.";
    }
}