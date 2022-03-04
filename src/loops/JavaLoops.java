package loops;

public class JavaLoops {

	public static void main(String[] args) {
		// break is use to break the loop upon meeting a condition
		// continue is use to skip the current iteration and go to the next
		int[] numbers = {1,2,3,4,5};
		
		
		// enhanced for loop
		System.out.println("Enhanced for loop:");
		for(int number : numbers) {
			System.out.println(number);
		}
		
		// for loop
		System.out.println("For loop:" );
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// while loop
		System.out.println("While loop:");
		int i = 0;
		while(i < numbers.length) {
			System.out.println(numbers[i]);
			i++;
		}
		
		// do while loop
		System.out.println("Do while loop:");
		int x = 0;
		do {
			System.out.println(numbers[x]);
			x++;
		} while (x < numbers.length);
		
		
		// nested for loop
		System.out.println("Nested for loop:");
		String[][] name = new String[3][3];
		name[0][0] = "Joshua";
		name[0][1] = "Robles";
		name[0][2] = "Mondoy";
		name[1][0] = "Rodelno";
		name[1][1] = "Depablo";
		name[1][2] = "Saron";
		name[2][0] = "Jobet";
		name[2][1] = "Lood";
		name[2][2] = "Ondangan";
		for(int row = 0; row < name.length; row++) {
			for (int col = 0; col < name.length; col++) {
				System.out.print(name[row][col] + " ");
			}
		}
					
				
				
	}

}
