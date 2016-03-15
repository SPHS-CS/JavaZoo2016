public class Snake extends Animal implements Walking, Swimming
{
    private String food;
    
    public Snake()
    {
        super("Snake", "Classic sly snake.");
        food = "mouse";
    }
    
    public Snake(String name, String desc, String food)
    {
        super(name, desc);
        this.food = food;
    }
    
    @Override
    public String makeNoise() 
    {
        return "sssss!";
    }
    
    @Override 
    public String play()
    {
        return "The snake plays with it's prey.";
    }
    
    public String snack()
    {
        return "The " + super.getName() + 
                " snacks on its " + food + ".";
    }
    
    @Override
    public String eat()
    {
        return "It eats some rodents and berries.";
    }
    
    @Override 
    public String walk()
    {
        return "The snake doesn't necessarily walk but slithers away.";
    }
    
    @Override
    public String swim()
    {
        return "The snake glides through the lake.";
    }
}