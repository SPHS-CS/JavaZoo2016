public class Okapi extends Animal implements Walking
{
   private String drink;
   public Okapi()
   {
       super("okapi", "Your cute zebra-giraffe.");
       drink = "water";
    }
   public Okapi(String name, String desc, String drink)
   {
       super(name, desc);
       this.drink = drink;
    }
   public String makeNoise()
   {
       return "Let's see what the okapi has to say...(silence)...";  
    }
   public String drinking()
   {
       return "It must splay its legs in order to reach the ground to drink " + drink + ".";
     }
   public String play()
   {
       return "The " + super.getName() + " sits in the corner and watches the other animals play.";
     }
   public String eat()
   {
       return "It eats leaves and berries.";
    }
   @Override
   public String walk()
   {
       return "The okapi gracefully strolls away.";
   }
}
