public class Blobfish extends Animal implements Swimming
{
    private String toy;
    
    public Blobfish()
    {
        super("Blobfish", "Psychrolutes marcidus");
        toy = "tears";
    }
    
    public Blobfish(String name, String desc, String toy)
    {
        super(name, desc);
        this.toy = toy;
    }
    
    @Override
    public String makeNoise()
    {
        return "blub *cries*";
    }
    
    @Override
    public String eat()
    {
        return "The blobfish swallows edible matter, his stress eating is destroying him.";
    }
    
    @Override
    public String play()
    {
        return "The blobfish cries " + toy + " because he is ugly, and sad.";
    }
    
    @Override
    public String swim()
    {
        return "The blobfish floats along the sea floor" + "\n" + "he is not loved anywhere he goes.";
    }
}

