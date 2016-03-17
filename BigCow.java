public class BigCow extends Animal implements Walking, Swimming
{
    private String grass;
    public BigCow()
    {
        super("Big Cow", "Just a really big cow");
        grass = "fresh + green";
        
    }
    
    public BigCow(String name, String desc, String grass)
    {
     super(name, desc) ;
    }
    @Override
    public String makeNoise()
    {
     return "MooOoOOoo";
    }
    
    @Override
    public String eat()
    {
     return "Big Cow enjoys " + grass + ".";
    }
    
    @Override
    public String play()
    {
     return "The cow doesn't play";
    }
    
    public String fly()
    {
     return "the Big Cow is over the moon";
    }
    
    @Override
    public String walk()
    {
     return "Big Cow takes big steps.";
    }
        @Override
    public String swim()
    {
     return "Big Cow is too big to swim but tries anyways.";
    }    
   
}