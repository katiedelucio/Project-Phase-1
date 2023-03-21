import java.util.ArrayList;
import java.util.Scanner;

public class UseBankProgram {

	public static void main(String[] args) {
		// create arraylist to store accounts
		ArrayList<Account> accounts = new ArrayList<>();

		bankMenu();
		
		Scanner input = new Scanner(System.in);
		while (true) {
			// enter selection
			System.out.print("Please select an option from the menu: ");
			int selection = input.nextInt();
			while (true) {
				while (selection < 0 || selection > 10) {
					System.out.print("Please enter a different selection: ");
					selection = input.nextInt();
				}

				// Create checking account
				if (selection == 1) {

					System.out.print("Please enter an account number: ");
					int accountNumber = input.nextInt();
					System.out.print("Please enter the starting balance for account: ");
					double balance = input.nextDouble();
					System.out.print("Please enter account holder information: ");
					Customer customer = createCustomer();
					CheckingAccount new1 = new CheckingAccount(accountNumber, balance, customer);
					accounts.add(new1);
					System.out.println("You have created a Checking Account");
					break;
				}
				// Create gold account
				if (selection == 2) {
					System.out.print("Please enter an account number: ");
					int accountNumber = input.nextInt();
					System.out.print("Please enter the starting balance for account: ");
					double balance = input.nextDouble();
					System.out.print("Please enter account holder information: ");
					Customer customer = createCustomer();
					GoldAccount new1 = new GoldAccount(accountNumber, balance, customer);
					accounts.add(new1);
					System.out.println("You have created a Gold Account");
					break;
				}
				// create regular account
				if (selection == 3) {
					System.out.print("Please enter an account number: ");
					int accountNumber = input.nextInt();
					System.out.print("Please enter the starting balance for account: ");
					double balance = input.nextDouble();
					System.out.print("Please enter account holder information: ");
					Customer customer = createCustomer();
					RegularAccount new1 = new RegularAccount(accountNumber, balance, customer);
					accounts.add(new1);
					System.out.println("You have created a Regular Account");
					break;
				}
				// deposit
				if (selection == 4) {
					System.out.println("Please enter the account number: ");
					int i = input.nextInt();
					for (Account a : accounts)
						if (i == a.getAccountNumber())
							System.out.println("Enter an amount to deposit: ");
					double dp = input.nextDouble();
					for (Account a : accounts)
						a.deposit(dp);
					break;
				}
				// withdraw
				if (selection == 5) {
					System.out.println("Please enter the account number: ");
					int i = input.nextInt();
					for (Account a : accounts)
						if (i == a.getAccountNumber())
							System.out.println("Enter an amount to withdraw: ");
					double wd = input.nextDouble();
					for (Account a : accounts)
						a.withdraw(wd);
					break;
				}
				// display account info
				if (selection == 6) {
					System.out.println("Please enter the account number of account you would like to view: ");
					int i = input.nextInt();
					for (Account a : accounts)
						if (i == a.getAccountNumber())
							System.out.println(a);
					break;

				}
				// remove account
				if (selection == 7) {
					System.out.println("Please enter the account number of account you would like to remove: ");
					int i = input.nextInt();
					for (Account a : accounts)
						if (i == a.getAccountNumber())
							accounts.remove(i);
					break;
				}
				// apply end of month
				if (selection == 8) {
					System.out.println("Please enter account number: ");
					int i = input.nextInt();
					for (Account a : accounts)
						if (i == a.getAccountNumber()) {
							System.out.println("Your balance including monthly fees is $" + a.deductMonthlyFee());
						}
					break;
				}
				// display bank stats
				if (selection == 9) {
					bankStats(accounts);
					break;
				}
				// exit
				if (selection == 10) {
					System.out.println("Exiting");
					System.exit(1);
				}
			}
		}
	}

	// displays bank menu
	public static void bankMenu() {
		System.out.println("\tBANK MENU\t");
		System.out.println("=========================");
		System.out.println("1.    Create Checking Account");
		System.out.println("2.    Create Gold Account");
		System.out.println("3.    Create Regular Account");
		System.out.println("4.    Deposit");
		System.out.println("5.    Withdraw");
		System.out.println("6.    Display Account Info");
		System.out.println("7.    Remove an Account");
		System.out.println("8.    Apply End of Month (Interest/Fees)");
		System.out.println("9.    Display Bank Statistics");
		System.out.println("10.   Exit");
	}

	public static Customer createCustomer() {// method to request info and returns customer
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the name of the customer: ");
		String name = input.nextLine();
		System.out.print("Please enter the address of the customer: ");
		String address = input.nextLine();
		System.out.print("Please enter an ID number for the customer: ");
		int id = input.nextInt();
		Customer c1 = new Customer(name, address, id);
		return c1;
	}

//to display the bank stats for option 9
	//sum - works
	//count of zero balance accounts
	//average balance 
	//largest balance
	public static void bankStats(ArrayList<Account> accounts) {
		double largestBalance = accounts.get(0).getBalance();
		double sum = 0;
		double average;
		Account largestBalanceAccount = null;
		ArrayList<Account> zeroBalanceAccounts = new ArrayList<Account>();
		
		for (Account a: accounts) {
			sum+= a.getBalance();
			if(a.getBalance()<=0) {
				zeroBalanceAccounts.add(a);
			}
			if (a.getBalance()> largestBalance) {
				largestBalance = a.getBalance();
				largestBalanceAccount = a;
			}
			average = sum/accounts.size();
			System.out.println("The sum of all accounts: $" +sum);	
			System.out.println("The number of accounts with zero balance is: " + zeroBalanceAccounts.size());
			System.out.println("The average balance of all accounts: $" + average);
			System.out.println("The largest balance: $" + largestBalance);
		}
		
	
		

	}

}
