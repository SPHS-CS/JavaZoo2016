public class Panda extends Animal implements Flying, Walking
{

    public Panda()
    {
        super ("Panda", "A friendly bear that likes to hug");
    }

    public Panda (String name, String description)
    {
        super (name, description);
    }

    public String hug()
    {
        return "I like to give hugs but if you hug me when I'm grumpy, I'll throw bamboo at you";
    }

    @Override 
    public String walk()
    {
        return "The baby panda ambles away";
    }

    @Override 
    public String makeNoise()
    {
        return "GRRRR";
    }

    @Override 
    public String play()
    {
        return "The baby panda plays with his siblings";
    }

    @Override 
    public String eat()
    {
        return "The bear chews on a shoot of bamboo";
    }

    @Override
    public String fly()
    {
        return "The panda jumps off the tree branch and flies for about a hundredth of a second before falling flat on his face";
    }

    @Override
    public String swim()
    {
        return "Sadly, the panda will start to sink if thrown into water";
    }

}