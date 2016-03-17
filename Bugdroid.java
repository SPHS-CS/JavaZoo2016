public class Bugdroid extends Animal implements Dance{
    
    public Bugdroid(String name, String description, double version){
		super(name, description);
		USSEnterprise enterprise = new USSEnterprise("USS Enterprise", "Constitution-Class Starship");
    }
    
	public void dance(){
		
		System.out.println("The Bugdroid does a fun jig outside Google Headquarters.");
		
	}
	
	@Override
    public String eat(){
		return "The Bugdroid eats an iPhone 6s, but cannot digest it because it is already poop.";
		enterprise.eat();
	}
	@Override
    public String play(){
		return "The Android plays Flappy Droid on his phone.";
		enterprise.play();
	}
	@Override
    public String makeNoise(){
		return "The Android Outputs a high-pitched sceeching noise as it sees an iPhone on the horizon.");
		enterprise.makeNoise();
	}
	
	public class USSEnterprise extends Animal implements WarpTechnology{
		
		private double warpFactor;
		
		public USSEnterprise(String name, String description, double warpFactor){
			
			super(name, description);
			this.warpFactor = warpFactor;
			
		}
		
		public double getWarpFactor(){
			
			return this.warpFactor;
			
		}
		
		@Override
		public void eat(){
			System.err.println("The Enterprise digests some more enriched Uranium.");
		}
		@Override
		public void play(){
			System.err.println("The Enterprise drops out of warp above the Zoo.");
		}
		@Override
		public void makeNoise(){
			System.err.println("The Android Outputs a high-pitched sceeching noise as it sees an iPhone on the horizon.");
		}
		
	}
}
