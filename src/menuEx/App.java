package menuEx;

import java.util.Scanner;

public class App {
	

	static double saturnBurger = 6.50;
	static double venusBurger = 4.99;
	static double marsBurger = 3.99;
	static Scanner sc = new Scanner(System.in);
	static Customer customer = new Customer();
	
	public static void main(String[] args) {
		
		greeting();
		menu();
		goodbye(customer.name);
		sc.close();
		
	}
	
	public static void greeting() {
		System.out.println("Hello welcome to Space Burger!\nWhat is the name for the order?");
		customer.name = sc.next();
		System.out.println("Hi " + customer.name + ", how much money do you have to spend today?");
		customer.cash = sc.nextDouble();
		menu();		
	}
	
	public static void goodbye(String name) {
		System.out.println("\nThank you for eating with Space Burger " + name + "!!!");
	}
	
	public static boolean canPurchase(double customerCash, double burgerValue) {
		if (customerCash >= burgerValue) {
			return true;
		} else {
			return false;	
		}
	}
	
	public static void menu() {
		System.out.println("\n****SPACE BURGER MENU****");
		System.out.println("\n1 - Saturn Burger: $6.50");
		System.out.println("2 - Venus Burger: $4.99");
		System.out.println("3 - Mars Burger: $3.99");
		System.out.println("\nPlease enter your selection...");
		int selection = sc.nextInt();
		switch (selection) {
			case 1:
				if (canPurchase(customer.cash, saturnBurger)) {
					System.out.println("Your Saturn burger will arrive in 41 lightyears");
					System.out.println("Your Balance is: $" + (customer.cash - saturnBurger));
				} else {
					System.out.println("Sorry, you're too broke for that purchase");
					menu();
				}
				break;
			case 2:
				if (canPurchase(customer.cash, venusBurger)) {
					System.out.println("Your Venus burger is at Perihelion, it will be late");
					System.out.println("Your Balance is: $" + (customer.cash - venusBurger));	
				} else {
					System.out.println("Sorry you don't have the funds for that sucka!");
					menu();
				}
				break;
			case 3:
				if (canPurchase(customer.cash, marsBurger)) {
					System.out.println("Your Mars burger will descend from the north soon and attack your tastebuds. Goodluck");
					System.out.println("Your Balance is: $" + (customer.cash - marsBurger));	
				} else {
					System.out.println("Bummer - you don't have enough for that beast of a burger.");
					menu();
				}
				break;
			case 4:
				System.out.println("Have a nice day");
				return;
				
			default:
				System.out.println("Please make a proper selection!");
		}
	}
	
	
}
