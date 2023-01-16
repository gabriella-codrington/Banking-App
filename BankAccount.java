import java.util.*;

public class BankAccount extends BankingApp{
	static float balance;
	static float previousTransaction;
	static String accountName;
	static String accountNumber;
	//String username;
	//String password;
	
	BankAccount(String name, String id) {
		accountName = name;
		accountNumber = id;
	}
	
	//static Map<String, String> Accounts = new HashMap<>();
/*
	public void signIn() {
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		System.out.println("Enter your password: ");
		Scanner scanner1 = new Scanner(System.in);
		String password = scanner1.next();
		
		if (Accounts.containsKey(username) && Accounts.containsValue(password)) {
			menu();
		}
		else {
			System.out.println("Invalid username or password. Try again.");
			signIn();
		}
		
	}
	
	void createAccount() {
		//enter name
		System.out.println("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		//enter username
		System.out.println("Enter a username: ");
		Scanner scanner2 = new Scanner(System.in);
		String username = scanner2.next();
		//enter password
		System.out.println("Enter a password: ");
		Scanner scanner3 = new Scanner(System.in);
		String password = scanner3.next();
		
		
	}
	
*/	
	static void welcome() {
		System.out.println("\n");
		System.out.println("Welcome: " + accountName);
		System.out.println("ID: " + accountNumber);
		System.out.println("\n");
		menu();
	}
	
	static void menu() {
		System.out.println("\n");
		System.out.println("Please select an action:");
		System.out.println("\n");
		System.out.println("(A) View Balance");
		System.out.println("(B) Deposit Funds");
		System.out.println("(C) Withdraw Funds");
		System.out.println("(D) View Previous Transaction");
		System.out.println("(E) Send Money");
		System.out.println("(F) Request Money");
		System.out.println("(G) Sign Out");
		System.out.println("\n");
		
		Scanner input1 = new Scanner(System.in);
		String option = input1.next();
		
		switch(option) {
			case("A")://view balance
				currentBalance();
				break;
			case("B")://deposit funds
				System.out.println("How much would you like to deposit?: ");
				Scanner input2 = new Scanner(System.in);
				float depositAmount = input2.nextFloat();
				deposit(depositAmount);
				break;
			case("C")://withdraw funds
				System.out.println("How much would you like to withdraw?: ");
				Scanner input3 = new Scanner(System.in);
				float withdrawAmount = input3.nextFloat();
				withdraw(withdrawAmount);
				break;
			case("D")://view previous transaction
				viewPreviousTransaction();
				break;
			case("E")://send money
				System.out.println("Who would you like to send money to?: ");
				Scanner input4 = new Scanner(System.in);
				String recipient = input4.next();
				System.out.println("How much would you like to send?: ");
				Scanner input5 = new Scanner(System.in);
				float sendAmount = input5.nextFloat();
				sendMoney(recipient, sendAmount);
				break;
			case("F")://request money
				System.out.println("Who would you like to request money from?: ");
				Scanner input6 = new Scanner(System.in);
				String giver = input6.next();
				System.out.println("How much would you like to request?: ");
				Scanner input7 = new Scanner(System.in);
				float requestAmount = input7.nextFloat();
				requestMoney(giver, requestAmount);
				break;
			case("G")://sign out
				System.out.println("Signing out");
				signOut();
				break;
		
		}
	}
	static void currentBalance() {
		System.out.println("Current balance: " + balance);
		menu();
	}
	
	static void deposit(float amount) {
		System.out.println("Depositing amount");
		balance += amount;
		System.out.println("New balance: " + balance);
		previousTransaction = amount;
		menu();
	}
	
	static void withdraw(float amount) {
		if (amount <= balance) {
			System.out.println("Withdrawing amount");
			balance -= amount;
			System.out.println("New balance: " + balance);
			previousTransaction = amount;
		}
		else {
			System.out.println("insufficient funds");
		}
		menu();
	}
	
	static void viewPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Last deposit: " + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Last withdraw: " + previousTransaction);
		}
		else {
			System.out.println("No previous Transaction");
		}
		menu();
	}
	
	static void sendMoney(String person, float amount) {
		System.out.println("Sending $" + Float.toString(amount) + " to " + person);
		balance -= amount;
		System.out.println("Money sent!");
		System.out.println("New balance: " + balance);
		previousTransaction = amount;
		menu();
	} 
	
	static void requestMoney(String person, float amount) {
		System.out.println("Requesting $" + Float.toString(amount) + " from " + person);
		System.out.println("Request sent!");
		menu();
	} 
	
	static void signOut() {
		System.out.println("Goodbye...");
	}
}
