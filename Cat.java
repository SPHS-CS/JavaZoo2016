public class Cat extends Animal implements Walking
{
    private String catfood;

    public Cat()
    {
        super("Cat", "Cat eats catfood.");
    }

    public Cat(
    String name, String desc, String catfood)
    {
        super(name, desc);
        this.catfood = catfood;
    }

    public String makeNoise()
    {
        return "MiaoMiaoMiao";
    }

    public String play()
    {
        return "The " + super.getName() + " plays with its " + catfood + ".";
    }

    public String eat()
    {
        return "It eats too many food";

    }

    @Override
    public String walk()
    {
        return "The cat walks in my house but my mom threatened it to go back to the zoo.";
    }

}