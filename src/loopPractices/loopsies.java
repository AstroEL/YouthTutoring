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
		 *	Exercise 6 - write a program that inputs 10 different integers within a while loop and displays the largest as well as the smallest (no repeating numbers)
		 *
		 *	Exercise 7 - write a program that asks the base and exponent (power) from user and print the result using DO WHILE LOOP
		 *
		 *	Exercise 8 - Using FOR LOOP, print the result of multiplication of all odd numbers from 1 to 20 and the result of sum of all even numbers from 1 to 100
		 *
		 *	Create a Method and Draw each of the following objects using Loops
		 *	Exercise 9			Exercise 10				Exercise 11
		 *	     $$				      #      			      #       
    	 *		$$$$			    #   #				     # #
   		 *	   $$$$$$			   #     #				    #   #
  		 *	  $$$$$$$$			  #       #				   #     #
 		 *	 $$$$$$$$$$			 #         #			  #       #
		 *	$$$$$$$$$$$$		# # # # # # #			   #     # 
		 *												    #   #
		 *												     # #
		 *												      #            
		 *	Exercise 12 - take an Integer input from user, print YES if it is a PRIME number and NO if it is not. (Prime number is a number only divisible by 1 or itself)
		 *	
		 *	Exercise 13 - Take a number from the user and return how many digits the number has using WHILE LOOP
		 *
		 *
		 */
	
		exercise1();
		// exercise2();
		// exercise3();
		// exercise4();
		// exercise5();
		// exercise6();
		// exercise7();
		// exercise8();
		// exercise9();
		// exercise10();
		// exercise11();
		// exercise12();
		// exercise13();
		
	}

	private static void exercise13() {
		System.out.println("\nEnter a number and I will tell you how many digits there are");
		int a = sc.nextInt();
		int result = 1;
		int q = a/10;
		while(q != 0) {
			q = q/10;
			result++;
		}
		System.out.println(result);
		
	}

	private static void exercise12Meat() {
		int input = sc.nextInt();
		boolean isPrime = true;
		if (input == 0) {
			System.out.println("Thanks for noticing me senpai...");
			return;
		}
		for(int i = 2; i < input; i++) {
			if(input % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} 
		exercise12Meat();
	}

	private static void exercise12() {
		System.out.println("Type a number to find out if it is PRIME: \n(Type 0 to exit)");	
		exercise12Meat();
	}

	private static void exercise11() {
		System.out.println();
		for (int i = 6; i >= 1; i--) {
			if (i == 4) {
				System.out.print("#");				
			} System.out.print("   ");
		}
		System.out.println();
		for (int i = 5; i >= 2; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			System.out.print(" #");
			System.out.println();
		}
		for (int i = 5; i >= 2; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.print(" #");
			for (int k = 2; k < i; k++) {
				System.out.print(" ");
			}
			for (int k = 2; k < i; k++) {
				System.out.print(" ");
			}
			System.out.print(" #");
			System.out.println();
		}
		for (int i = 6; i >= 1; i--) {
			if (i == 4) {
				System.out.print("#");				
			} System.out.print("   ");
		}
	}

	private static void exercise10() {
		System.out.println();
		for (int i = 6; i >= 1; i--) {
			if (i == 4) {
				System.out.print("# ");				
			} System.out.print("   ");
		}
		System.out.println();
		for (int i = 5; i >= 2; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}
			System.out.print(" #");
			System.out.println();
		}
		for (int i = 7; i >= 1; i--) {
			System.out.print("# ");
		}
	}

	private static void exercise9() {
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 6; k >= i; k--) {
				System.out.print("$");
			}
			for (int k = 6; k >= i; k--) {
				System.out.print("$");
			}
			System.out.println();
		}
	}

	private static void exercise8() {
		int even = 0, odd = 1;
		for (int i = 1; i <= 20; i+=2) {
			odd = odd * i;
		}
		for (int i = 2; i <= 100; i+=2) {
			even = even + i;
		}
		System.out.println("Multiplication of odd numbers 1-20: " + odd + "\nSum of even numbers 1-100: " + even);
	}

	private static void exercise7() {
		System.out.println("What is the base number?");
		int a = sc.nextInt();
		System.out.println("Now what is the exponent?");
		int b = sc.nextInt();
		
		int result = 1;
		int i = 1;
		do {
			result = result * a;
			i++;
		} while (i <= b); 
		System.out.println("Boom, some math and your result is: " + result);
	}

	private static void exercise6() {
		int i = 2;
		int largest = 0;
		int smallest = 0;
		System.out.println("Please input 10 different numbers:");
		System.out.println("Number 1: ");
		int a = sc.nextInt();
		largest = a;
		smallest = a;
		
		while (i <= 10) {
			System.out.println("Number " + i + ":");
			int b = sc.nextInt();
			if (b < smallest) {
				smallest = b;
			} 
			if (b > largest) {
				largest = b;			
			}
			i++;
		}
		System.out.println("\nLargest Number: " + largest + "\nSmallest Number: " + smallest);
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
