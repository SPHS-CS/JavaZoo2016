public class Cat extends Animal implements Walking
{
    public Cat()
    {
        super("Cat", "the only family member that you like");
    }
    
    public Cat(String name, String description)
    {
        super(name, description);
    }
    
    @Override
    public String eat()
    {
        return "Give me food! I want fish!";
    }
    
    public String cute()
    {
        return "Whether I am fat or ugly, no matter what I do I'm cute. And you know that! :D";
    }
    
    @Override
    public String play()
    {
        return "Although many people have misconception that we like playing with the thread," + 
                " what we really like is seeing humans being annoyed looking at the thread that" +
                " they have to clean up. HEHEHEHEHEHEHEHEHEHE";
    }
    
    @Override
    public String makeNoise()
    {
        return "Don't expect me to say anything. Cuz I'm lazy.";
    }
    
    @Override
    public String walk()
    {
        return "You won't see me walking, because by that time you are sleeping.";
    }
    
    public String lazy()
    {
        return "People say that we are lazy. No, we are not! We just don't feel the need to breath," +
                "exercise, or do anything else.";
    }
    
}
