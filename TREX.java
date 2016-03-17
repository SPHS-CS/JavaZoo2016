public class TREX extends Animal implements Flying
{
    private String lawnmower;

    public TREX()
    {
        super("TREX", "BIG DINO.");
        lawnmower = "Troy-Bilt TB130";
    }

    public TREX(String name, String desc, String lawnmower)
    {
        super(name, desc);
        this.lawnmower = lawnmower;

    }

    @Override
    public String makeNoise()
    {
        return "OOGA BOOGA";
    }

    @Override
    public String eat()
    {
        return "T-REX EATS LISA";
    }

    @Override
    public String play()
    {
        return "T-REX MOWS HIS LAWN";
    }

    public String walk()
    {
        return "T-REX GOES FOR A STROLL";
    }

    @Override
    public String fly()
    {
        return "T-REX FLYS MAJESTICALLY LIKE A FLUTE SINGING IN THE NIGHT";
    }
}