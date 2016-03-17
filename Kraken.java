public class Kraken extends Animal implements Swimming
{
    private String toy;
    
    public Kraken()
    {
        super("Kraken", "Ogmund Tussock has sent this creature to you by means of his magic to cause the death of you and all your men.");
        toy = "merchant ship";
    }
    
    public Kraken(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "*SCREEEEEAAAAACH*";
    }
    
    @Override
    public String play()
    {
        return "The kraken destroys and sinks the huge " + toy + ".";
    }
    
    @Override
    public String eat()
    {
        return "The kraken devours merchant sailors.";
    }
    
    @Override
    public String swim()
    {
        return super.getName() + ", the kraken has been released. It is now on it's way to smash your boat.";
    }
}