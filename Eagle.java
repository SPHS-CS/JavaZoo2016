
/**
 * Write a description of class Eagle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eagle extends Animal implements Flying, Walking, Swimming
{
  private String toy;
    
  public Eagle(){
    super("The Real Uncle Sam", "The most interesting animal in the zoo");
    toy = "flute";
    }
    public Eagle(String name, String description){
    super(name, description);
    this.toy = toy;
    }
    @Override 
    public String makeNoise(){
    return "AYEEEEEEEEE!";
    }
    @Override
    public String eat(){
    return "Can eat anything..... including you"; 
    }
    @Override
    public String fly(){
    return "Of course it can fly";

    }
    @Override 
    public String walk(){
    return "He always flies after taking 3 steps.";
    }
    
    public String swim(){
    return "He takes a deep breath and swims for only 2 seconds and then flies out because he is in shock of his God-given abilites.";
    
    }
    public String play(){
    
        return "The eagle often plays with its " + toy + ".";
    }
    public String attack(){
    return "The combination of his beak and his piercing noise gives him the ability to KO every opponent he faces.";
    }
    
    
    
}
