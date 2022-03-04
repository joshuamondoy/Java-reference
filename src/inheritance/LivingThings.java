package inheritance;

public class LivingThings {
	
	private String species;
	private String lifeSpan;
	
	public LivingThings(String species, String lifeSpan) {
		this.species = species;
		this.lifeSpan = lifeSpan;
	}
	
	public LivingThings() {
		// no args
	}
	
	public String showDetails() {
		return "I am a species class";
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	
	
	
	
	
	
	
}
