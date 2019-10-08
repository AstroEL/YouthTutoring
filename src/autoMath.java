import java.util.Scanner;

public class autoMath {

	public static void main(String[] args) {
		System.out.println("Hey! Let's do some math!");
		System.out.println("\nWhat is your first number?");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();	
			System.out.println("Great, " + a + ", what is your second number?");
			int b = sc.nextInt();
			System.out.println("\nOkay!\nHere are your results...");
			addition(a,b);
			subtraction(a,b);
			multiplication(a,b);
			division(a,b);
		}
		catch (IllegalArgumentException ex){
			System.out.println("You must enter NUMBERS YO!");			
		}
		
		System.out.println("\nYay we did math!\nWould you like to do more math?");
		System.out.println("[Y/N]");
		String res = sc.nextLine();
		boolean dec;
		
	}

	public static void addition(int a, int b) {
		System.out.println("\nAddition: " + (a+b));
	}
	
	public static void subtraction(int a, int b) {
		System.out.println("Subtraction: " + (a-b));
	}
	
	public static void multiplication(int a, int b) {
		System.out.println("Multiplication: " + (a*b));
	}
	
	public static void division(int a, int b) {
		System.out.println("Division: " + (a/b));
	}
}
