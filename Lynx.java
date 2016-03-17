public class Lynx extends Animal implements Walking
{
    private String toy;
    
    public Lynx()
    {
        super("Lynx", "Your typical lynx. Nothing much more to say.");
        toy = "Fugu";
    }
    
    public Lynx(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    public String makeNoise() 
    {
        return "STIKCKY EEE!";
    }
    
    public String play()
    {
        return "The " + super.getName() + 
                " plays with its " + toy + ".";
    }
    
    public String eat()
    {
        return "Salmon and meats";
    }
    
    @Override
    public String walk(){
        return "The lynx filled with euphoria walked to its cage.";
    }
    

}
