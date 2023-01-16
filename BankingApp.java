import java.util.*;

public class BankingApp{

	public static void main(String[] args) {
		System.out.println("Welcome to Java Banking!");
		System.out.println("Enter your name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Enter your id:");
		Scanner scanner1 = new Scanner(System.in);
		String id = scanner1.next();
		BankAccount myAccount = new BankAccount(name, id);
		BankAccount.welcome();
	}
}


