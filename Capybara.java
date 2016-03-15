/**
 * Write a description of class Capybara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capybara extends Animal implements Walking, Swimming
{
    private String toy;
    public Capybara()
    {
        super("Capybara", "A large guinea pig");
        toy = "Dollar Bill";
    }
    public Capybara(String name, String description, String toy)
    {
        super(name, description);
        this.toy = toy;
    }
    public String makeNoise()
    {
        return "*scratch *scratch";
    }
    public String play()
    {
        return "The " + super.getName() + " coddles the " + toy + ".";
    }
    public String eat()
    {
        return "It eats some peanutbutter and mangoes";
    }
    @Override
    public String walk()
    {
        return "The capybara thinks about walking, but decides to sit down instead.";
    }
    @Override
    public String swim()
    {
        return "The capybara floats in the pool.";
    }
}
