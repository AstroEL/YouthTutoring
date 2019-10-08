package loopPractices;

import java.util.Scanner;

@SuppressWarnings("unused")
public class loopsies {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*	Create a Method and Draw each of the following objects using Loops
		 * 	Exercise 1			Exercise 2			Exercise 3
		 * 
		 * 	1*****				12345&				@
		 *	12****				1234&&				@ @ 	
		 *	123***				123&&&				@  @ 
		 *	1234**				12&&&&				@   @ 
		 *	12345*				1&&&&&				@    @ 
		 *	123456				&&&&&&				@ @ @ @
		 *
		 *	Exercise 4
		 *	
		 *	1   10   11   20   21   30
		 *	2   9   12   19   22   29
		 *	3   8   13   18   23   28
		 *	4   7   14   17   24   27
		 *	5   6   15   16   25   26
		 *	6   5   16   15   26   25
		 *	7   4   17   14   27   24
		 *	8   3   18   13   28   23
		 *	9   2   19   12   29   22
		 *	10   1   20   11   30   21
		 *
		 *	Exercise 5 - get user input and print a grid [box] of stars that is the size of the user input
		 *
		 *	Exercise 6
		 *
		 *
		 */
	
		// exercise1();
		// exercise2();
		// exercise3();
		// exercise4();
		exercise5();
	}

	private static void exercise5() {
		System.out.println("Please enter your desired width: ");
		int x = sc.nextInt();
		System.out.println("Please enter your desired height: ");
		int y = sc.nextInt();
		if (x <= 0 || y <= 0) {
			System.out.println("\n!ERROR!\n\nYour values cannot be <= 0!! Try again\n");
			exercise5();
		} else {
			System.out.println("\n BOOM - Magic Square");
			System.out.println(" ------ " + x + " x " + y + " ------\n");			
			for(int i = 1; i <= x; i++) {
				System.out.print(" *");
				for(int j = 1; j <= y; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}	
		}
	}
	
	private static void exercise4() {
		for (int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30; a <= 10; a++, b--, c++, d--, e++, f--) {
			System.out.println(a + "   " + b + "   " + c + "   " + d + "   " + e + "   " + f);
		}
	}

	private static void exercise3() {
		System.out.println("@");
		for(int i = 4; i >= 1; i--) {
			System.out.print("@");
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.println("@ ");
		}
		for(int i = 1; i <= 4; i++)
			System.out.print("@ ");
	}

	private static void exercise2() {
		for(int i = 6; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(j);
			}
			for(int k = 6; k >= i; k--) {
				System.out.print("&");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void exercise1() {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j);
			}
			for(int k = 6; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		} 
		System.out.println();
		
		
	}

}
