public class Albatross extends Animal implements Flying
{
    private String toy;
    
    public Albatross()
    {
        super("Albatross", "A large seabird. The largest of Flying birds");
        toy = "bird swing" ;
    }
    public Albatross(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    public String makeNoise()
    {
        return " caaah ";
    }
     public String play()
    {
        return "The " + super.getName() + 
                " plays with its " + toy + ".";
    }
    
    public String eat()
    {
        return "It eats some squid, fish and krill";

    }


@Override
public String fly()
{
   return  " The Albatross, which have a wingspan of 12 feet, spreads its wings and soars.";
}
}