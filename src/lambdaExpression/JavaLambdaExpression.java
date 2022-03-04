package lambdaExpression;

import java.util.ArrayList;

public class JavaLambdaExpression {
	
	// Lambda expression is like arrow function in javascript
	public static void  main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Joshua");
		names.add("Toto");
		names.add("Jobet");
		names.add("Janry");
		names.add("Erold");
		
		names.forEach(e -> System.out.println(e.toUpperCase()));
		
	}

}
