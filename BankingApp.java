import java.util.*;

public class BankingApp{

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		System.out.println("Welcome to Java Banking! Sign in (A) or Create an Account (B)?: ");
		Scanner scanner = new Scanner(System.in);
		String signInOrCreateAccount = scanner.next();
		switch(signInOrCreateAccount){
			case("A"):
				signIn();
			case("B"):
				createAccount();
		}
		
	}
}


