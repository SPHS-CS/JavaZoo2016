
/**
 * Perry the Platypus
 * 
 * @author Grace Kull
 * @version 3-15-2016
 */
public class Platypus extends Animal implements Walking, Flying
{
    private String hat;
    private String codeName;
    
    public Platypus()
    {
        super("Perry the Platypus", "A secret agent fighting against the evil Dr. Doofenshmirtz.");
        hat = "brown fedora";
        codeName = "Agent P";
    }
    
    public Platypus(String name, String desc, String hat)
    {
        super(name, desc);
        this.hat = hat;
        this.codeName = codeName;
    }
    
    public String eat()
    {
        return "Agent P eats his food after a long, hard mission.";
    }
    
    public String makeNoise()
    {
        return "*clicks";
    }
    
    public String play()
    {
        return "Perry has fun on the new rollercoaster.";
    }
    
    public String getCodeName()
    {
        return codeName;
    }
    
    public String secretAgent()
    {
        return "Perry the Platypus is a secret agent by the name of " + codeName + ".";
    }
    
    public String escape()
    {
        return "Perry escapes Doofenshmirtz's trap and destroys his evil plans.";
    }
    
    public String hide()
    {
        return "Agent P takes off his " + hat + " and becomes a normal pet again.";
    }
    
    @Override
    public String walk()
    {
        return "Perry takes a nice walk off duty.";
    }
    
    @Override
    public String fly()
    {
        return "Agent P flys in his jetpack to save the Tristate area from Dr. Doofenshmirtz.";
    }
}
