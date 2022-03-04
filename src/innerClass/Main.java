package innerClass;

public class Main {

	public static void main(String[] args) {
		ParentClass parentClass =  new ParentClass();
		parentClass.getDetails();
		
		
		//instantiate the inner class
		ParentClass.InnerClass innerClass = parentClass.new InnerClass();
		innerClass.getDetails();

	}

}
