package PasswordPractice;

import java.util.Scanner;

public class pword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = "Follow the Prophet";
		
		System.out.println("Hello. What is the password?");
		String guess = sc.next();
		
		if (guess.equals(password)) {
			System.out.println("You are correct. You may pass");
		} else {
			System.out.println("Incorrect.");
		}
		
		sc.close();
	}

}
