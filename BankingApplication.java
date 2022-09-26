package BankingApplications;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankingApplication bankObject = new BankingApplication();
		bankObject.welcomeMessage();
		
		
		BankAccount account=new BankAccount("je",233);
		account.showmenu();
		
	}
	private void welcomeMessage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Indian Bank");
		System.out.println("Press 1 or 2 respectively");
		System.out.println("1.Create Account");
		System.out.println("2.Login Account");
		
	}
}
