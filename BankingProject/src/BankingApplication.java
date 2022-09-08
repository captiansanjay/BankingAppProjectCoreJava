import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {

		System.out.println("Pls enter your Name and Customer ID here: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name=");
		String name = sc.nextLine();
		System.out.println("Enter Id=");
		String custId = sc.next();

		BankAccount obj = new BankAccount(name, custId);
		obj.showMenu();
	}

}
