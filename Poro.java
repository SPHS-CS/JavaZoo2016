public class Poro extends Animal implements Walking
{
    
    
    public Poro()
    {
        super("Poro", "Small magical creatures that populate the Howling Abyss, they secretly have a dark hidden agenda.");
        
    }
    
    public Poro(String name, String desc)
    {
        super(name, desc);
        
    }
    
    public String makeNoise()
    {
        return "The Poro purrs lightly.";
    }
    
    public String play()
    {
        return "The Poro puts on a mustache and pretends to be Braum.";
    }
    
    public String eat()
    {
        return "The Poro eats a nice round biscuit.";
    }
   
    @Override
    public String walk()
    {
        return "The Poro quickly scurries to a bush, just what is he hiding?";
    }
    
  
    
}