package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client;
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String clientName = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new Client(accountNumber, clientName, initialDeposit);
		}
		else {
			client = new Client(accountNumber, clientName);
		}
		
		System.out.println();		
		System.out.println("Account Data: ");
		System.out.println(client);
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		client.deposit(depositValue);
		
		System.out.println();		
		System.out.println("Updated account data: ");
		System.out.println(client);
		
		System.out.println();	
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		client.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Updated account data, with a tax of 5 euros: ");
		System.out.println(client);
		
		sc.close();
	}

}
