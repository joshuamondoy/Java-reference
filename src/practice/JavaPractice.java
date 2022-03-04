package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a / b);
		} 
		catch(Exception exception) {
			System.out.println(exception);
		}
	}
}
