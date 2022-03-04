package abstraction;
	
	public abstract class Animal {
		private String name;
		private String type;
		
		public Animal(String name, String type) {
			this.name = name;
			this.type = type;
		}
		
		public abstract void sound();
		
		public String details() {
			return "I am an animal";
		}
		
		//setters and getters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
}
