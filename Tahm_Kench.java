/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tahm_Kench extends Animal implements Attack, Quote, Quote2, Quote3
{
    public Tahm_Kench()
    {
        super("Tahm_Kench", "Giant mutated frog and catfish that eats everything \n even all the animals in the zoo");
    }
    public Tahm_Kench(String name, String description)
    {
        super(name, description);
    }
    @Override
    public String eat()
    {
        return "he eats everything even the bowl in one gulp";
    }
    @Override
    public String play()
    {
        return "He starts to play with other animals and eventually eats them";
    }
    @Override
    public String makeNoise()
    {
        return "grr";
    }
    @Override
    public String attack()
    {
        return "He uses his tougne to slap an enemy, then he eats it";
    }
    @Override
    public String quote()
    {
        return "I have tastes that aren't easily... pacified.";
    }
    @Override
    public String quote2()
    {
        return "Let us eat voraciously and overindulge.";
    }
    @Override
    public String quote3()
    {
        return "Let us peruse this establishment's fare.";
    }
}
