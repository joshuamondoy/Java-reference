package inheritance;

public class Human extends LivingThings{
	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		System.out.println(super.showDetails());
		return  "I am a human class";
		
	}

	private String race;
	private String skinColor;
	
	public Human(String species, String lifeSpan, String race, String skinColor) {
		super(species, lifeSpan);
		this.race = race;
		this.skinColor = skinColor;
	}

	public String getrace() {
		return race;
	}

	public void setrace(String race) {
		this.race = race;
	}

	public String getskinColor() {
		return skinColor;
	}

	public void setskinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	

}
