public class ScarletMacaw extends Animal implements Walking, Flying
{
    private String toy; 
    public ScarletMacaw()
    {
        super("Scarlet Macaw", "A brightly colored bird");
        toy = "Stuffed Animal";
    }
    public ScarletMacaw(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    public String makeNoise()
    {
        return "Kakaww Kawaww!!";
    }
    public String play()
    {
        return "The " + super.getName() + " plays cutely with its " + toy;
    }
    public String eat() 
    {
        return "The " + super.getName() + " eats nuts, berries and seeds"; 
    }
    public String walk()
    {
        return "The macaw grinsn and waddles away.";
    }
    public String fly()
    {
        return "The macaw soars beautifully through the cloudless skies.";
    }
}
    

    