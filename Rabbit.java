
public class Rabbit extends Animal implements Walking, Hopping
{
    private String noise; 
    
    public Rabbit()
    {
         super("Squeekers", "Cashmere Lop Rabbit"); 
         noise = "squeek"; 
    }
    
    public Rabbit(String name, String description, String noise)
    {
         super(name, description); 
         this.noise = noise; 
    }
    
    @Override
    public String makeNoise()
    {
        return "I want hay for dinner."; 
    }
    
    @Override
    public String eat()
    {
        return "Hay, and lots of it."; 
    }
    
    @Override
        public String play()
    {
        return "The rabbit plays with the sugar tunnel."; 
    }
    
    @Override
    public String walk()
    {
        return "The rabbit uses 2 legs at a time to walk, and springs into the air when walking.";
    }
    
    @Override
    public String hop()
    {
        return "The rabbit put on a jacket and hops away"; 
    }
}