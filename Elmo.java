

public class Elmo extends Animal implements Walking
{
    
    

    public Elmo()
    {
        super("Elmo", "Muppet");
    }
    
    public Elmo(String name, String desc)
    {
        
       super(name, desc);
       
    }
    
    @Override
    public String makeNoise()
    {
        return " Elmo's World!~";
        
    }
    @Override
    public String eat()
    {
        return "Elmo goes over to his fish tank and takes out his pet fish Dorothy...";
        
    }
    
    @Override 
    public String play()
    {
        return "ELmo goes over to Cookie Monster and steals his cookies";
    }
    
    @Override
    public String walk()
    {
        return "Elmo grabs his blanket and walks away";
        
    }
}
