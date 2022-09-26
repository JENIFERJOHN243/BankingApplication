package BankingApplications;

import java.util.Scanner;

public class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	long customerId;
	
	BankAccount(String customerName , long customerId) {
		this.customerName =customerName ;
		this.customerId = customerId;
	}
	
	void showmenu() {
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Welcome " +customerName);
		System.out.println("Your ID is " +customerId);
		System.out.println("1 : Check Your Balance");
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println("4 : Previous Transaction");
		System.out.println("5 : Exit The System");
		System.out.println("----------------------");
		do {
			System.out.println("Enter Your Option");
			option=scanner.nextInt();
			switch (option){
			case 1:{
				System.out.println("Your Net Balance = "+balance);
			}
			break;
			case 2:{
				System.out.println("Enter an amount to deposit ");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
			}
			case 3:{
				System.out.println("Enter an amount to withdraw ");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
			}
			case 4:{
				getPreviousTransaction();
				break;
			}
			case 5:{
				break;
			}
			default:{
				System.out.println("Invalid Option!!Please Enter Correct Opton");
				break;
			}
			}
		}
		while(option != 5);
		System.out.println("Thank You for Using our Services!!");
	}

	private void getPreviousTransaction() {
		// TODO Auto-generated method stub
		
		
	}

	private void withdraw(int amount2) {
		// TODO Auto-generated method stub
		if(amount2 != 0) {
			balance = balance - amount2;
			previousTransaction = -amount2;
		}
		System.out.println("Withdrawl Amount: "+amount2);
		System.out.println("Your Net Balance after Withdraw: "+balance);
		
	}

	private void deposit(int amount) {
		// TODO Auto-generated method stub
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
		System.out.println("Deposited Amount: "+amount);
		System.out.println("Your Net Balance after deposit: "+balance);
		
	}
	
	

}
