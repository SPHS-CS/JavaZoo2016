
public class pinkFairyArmadillo extends Animal implements Walking, Swimming, Flying 
{
    private String toy;
    public pinkFairyArmadillo() 
    {
        super("pinkFairyArmadillo", "small and furry" );
        toy= "ping pong ball";
    }

    @Override
    public String makeNoise()
    {
        return "pieh pieh pieh";
    }

    @Override
    public String eat() 
    {
        return "The Pink Fairy Armadillo eats ants, worms, and snails";
    }

    @Override
    public String walk()
    {
        return "The Pink Fairy Armadillo wobbles with its shell.";
    }

    @Override
    public String swim()
    {
        return "The Pink Fairy Armadillo swims free style.";
    }
    
    public String fly()
    {
        return "The Pink Fairy Armadillo flys for a second when tossed in the air.";
    }

    @Override 
    public String play() 
    {
        return "The Pink Fairy Armadillo plays with its" + " " + toy + "."; 
    }

    public String groom() 
    {
        return "The Pink Fairy Armadillo makes sure its fur is always clean " ; 
    }

}