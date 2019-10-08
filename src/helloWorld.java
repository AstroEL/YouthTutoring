import java.util.Scanner;

public class helloWorld {
	
	/*public static void main(String[] args) {
		System.out.println("Hey! Let's do some math!");
		addition();
		subtraction();
		multiplication();
		division();
		
		System.out.println("\nYay we did math!");
		
	}*/

	public static void addition() {
		System.out.println("\nAddition");
		System.out.println("\nWhat is your first number?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("What is your second number?");
		int b = sc.nextInt();
		System.out.println("\nThe SUM of your numbers is: " + (a + b));
		
	}
	
	public static void subtraction() {
		System.out.println("\n2. Subtraction");
		System.out.println("\nWhat is your first number?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("What is your second number?");
		int b = sc.nextInt();
		System.out.println("\nThe DIFFERENCE of your numbers is: " + (a - b));
	}
	
	public static void multiplication() {
		System.out.println("\n2. Multiplication");
		System.out.println("\nWhat is your first number?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("What is your second number?");
		int b = sc.nextInt();
		System.out.println("\nThe PRODUCT of your numbers is: " + (a * b));
	}
	
	public static void division() {
		System.out.println("\n2. Division");
		System.out.println("\nWhat is your first number?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("What is your second number?");
		int b = sc.nextInt();
		System.out.println("\nThe QUOTIENT of your numbers is: " + (a / b));
	}
}
