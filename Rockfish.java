public class Rockfish extends Animal implements Swimming, Walking
{
    public Rockfish()
    {
        super("Rockfish", "a fish that goes to sick concerts");
    }
    
    public Rockfish(String name, String desc)
    {
        super(name, desc);
    }
    
    public String makeNoise()
    {
        return "Rockfish throws out a hard G minor chord.";
    }
    
    public String play()
    {
        return "Rockfish plays a perfect rendition of Canon in D.";
    }
    
    public String eat()
    {
        return "Rockfish survives on nothing more than the applause of the crowd.";
    }
    
    public String swim()
    {
        return "Rockfish jumps into the amalgamation of hands and faces and goes crowd surfing.";
    }
    
    public String walk()
    {
        return "Rockfish whips his guitar out and walks up three scales to a high A.";
    }
}