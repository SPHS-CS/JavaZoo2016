
/**
 * Write a description of class InNOutFries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InNOutFries extends Animal implements Walking, Swimming
{
   public String toy;
    public InNOutFries()
   {
       super("InNOut fries(can be animal style)", "Can come with: Cheese, grilled onions, and thousand island,");
   }
   
   public InNOutFries(String name, String desc, String toy)
   {
       super(name, desc);
       this.toy = toy;
   }
   
    @Override
    public String makeNoise()
    {
        return "You try to listen but fries don't make noise";
    }
    @Override
    public String play()
    {
        return "You play with your fries.";
    }
    @Override
    public String eat()
    {
        return "";
    }
    @Override
    public String walk()
    {
        return "Your fries fall to the ground";
    }
    @Override
    public String swim()
    {
        return "Animal fries are swimming in oil";
    }
    public String salty()
    {
        return "You sprinkle Salt on the fries";
    }
}
