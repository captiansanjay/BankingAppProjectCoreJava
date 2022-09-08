import java.util.Scanner;

class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;

	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdrw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited=" + previousTransaction);

		} else if (previousTransaction < 0) {
			System.out.println("withdraw=" + Math.abs(previousTransaction));
		} else {
			System.out.println("no transaction occur");
		}
	}

	void showMenu() {
		char option = '\0';
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome =" + customerName);
			System.out.println("Customer Id =" + customerId);
			System.out.println("\n");
			System.out.println("A. Check Your Balance");
			System.out.println("B. Deposit ");
			System.out.println("C. Cash Withdraw");
			System.out.println("D. Account Statement");
			System.out.println("E. Check Balance");
			System.out.println("F. EXIT");

			do {
				System.out.println("===================================");
				System.out.println("Please Enter Option Here:");
				option = scanner.next().charAt(0);
				// System.out.println("\n");

				switch (option) {
				case 'A':
				case 'a':
					System.out.println("===You are selected Options is BALANCE CHECK===");
					if (balance == 0) {
						System.out.println("Your Balance is=" + balance);
						System.out.println("pls enter some amount");
					} else {
						System.out.println("balnce=" + balance);
					}

					System.out.println("\n");
					// System.out.println("A. Check Your Balance");
					System.out.println("B. Deposit ");
					System.out.println("C. Cash Withdraw");
					System.out.println("D. Account Statement");
					System.out.println("E. Check Balance");
					System.out.println("F. EXIT");
					break;
				case 'B':
				case 'b':
					System.out.println("===You are selected Options is AMOUNT DEPOSIT===");
					System.out.println("Enter ur Amount to deposit:");
					int amount = scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					System.out.println("A. Check Your Balance");
					// System.out.println("B. Deposit ");
					System.out.println("C. Cash Withdraw");
					System.out.println("D. Account Statement");
					System.out.println("E. Check Balance");
					System.out.println("F. EXIT");
					break;
				case 'C':
				case 'c':
					System.out.println("===You are selected Options is AMOUNT WITHFRAW===");
					System.out.println("Enter Amount to Withdraw=");
					// System.out.println("=============");
					int amount2 = scanner.nextInt();
					withdrw(amount2);
					System.out.println("Balance =" + balance);
					System.out.println("\n");
					System.out.println("A. Check Your Balance");
					System.out.println("B. Deposit ");
					// System.out.println("C. Cash Withdraw");
					System.out.println("D. Account Statement");
					System.out.println("E. Check Balance");
					System.out.println("F. EXIT");
					break;
				case 'D':
				case 'd':
					System.out.println("===You are selected Options is ACCOUNT STATEMENT===");
					System.out.println("Your Account Statement");
					getPreviousTransaction();
					System.out.println("==============================");
					System.out.println("\n");
					System.out.println("A. Check Your Balance");
					System.out.println("B. Deposit ");
					System.out.println("C. Cash Withdraw");
					// System.out.println("D. Account Statement");
					System.out.println("E. Check Balance");
					System.out.println("F. EXIT");
					break;
				case 'E':
				case 'e':
					System.out.println("chack balance=");
					if (balance != 0) {
						System.out.println("nill");
					} else {
						System.out.println("balance" + balance);
					}
				case 'F':
				case 'f':
					System.out.println("===============================");
					System.out.println("-------------Thanks you for banking with us-------------------");
					break;
				default:
					System.out.println("------------Pls enter below valid option---------");
					System.out.println("A. Check Your Balance");
					System.out.println("B. Deposit ");
					System.out.println("C. Cash Withdraw");
					System.out.println("D. Account Statement");
					System.out.println("E. Check Balance");
					System.out.println("F. EXIT");
					break;
				}

			} while (option != 'F');
		}

		System.exit(0);
	}

}
