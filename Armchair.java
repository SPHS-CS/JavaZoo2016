public class Armchair extends Animal implements Flying {
    private String softness;
    
    public Armchair() {
        super("Armchair", "One of the most common creatures in American living rooms");
        softness = "extreme";
    }
    
    public Armchair(String name, String desc, String softness) {
        super(name, desc);
        this.softness = softness;
    }
    
    public String makeNoises() {
        return "Armchairs don't make noises.";
    }
    
    public String play() {
        return super.getName() + "exclaims how " + softness + " its softness is.";
    }
    
    public String eat() {
        return "It eats some couch potato.";
    }
    
    public String sit() {
        return "The armchair tries its best to sit, but alas, it is already standing.";
    }
    
    @Override
    public String fly() {
        return "The armchair flaps its wings and proceeds to float one inch above the ground.";
    }    
}