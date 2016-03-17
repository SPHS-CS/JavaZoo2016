public class Ant extends Animal implements Flying, Walking, Swimming
{
    private int number;
    public Ant()
    {
        super("ABCDEFG","White Ant");
        number = 99999;
    }
     public Ant(String name, String desc,  int number)
     {
         super(name, desc);
         this.number = number;
        }
     @Override
    public String makeNoise()
    {
        return null;
    }
   public String play()
    {
        return "rock";
    }
    public String eat()
    {
        return "House";
    }
    
    @Override
    public String walk()
    {
        return "The Great Migration";
        
    }
    @Override
    public String swim()
    {
        return "The great ant swim ";
    }
    @Override
    public String fly()
    {
        return "The great Ant Plane";
    }
}
