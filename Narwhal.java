public class Narwhal extends Animal implements Swimming
{
    private String hobby;
    public Narwhal()
    {
        super("Magestic Mike", "Partially a unicorn; has a great horn.");
        hobby = "Fencing.";
    }
    
    public Narwhal(String name, String description, String hobby)
    {
        super(name, description);
        this.hobby = hobby;
    }
    
    public String eat()
    {
        return "It eats a lot of shrimp at Red Lobster; sometimes goes to Buca di Beppo for some of their kalamari.";
    }
    
    public String play()
    {
        return "The " + super.getName() + "likes to " + hobby + ".";
    }
    
    public String makeNoise()
    {
        return "OHHHHHH EEEEEEE IIIII URGA URGA.";
    }
    
    @Override 
    public String swim()
    {
        return "The narwhal is a majestic creature that swims freely across the Arctic waters.";
    }
}