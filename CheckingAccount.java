
public class CheckingAccount extends Account {
	// first 2 monthly trans are free, then $3 per transaction
	final double transactionFee = 3.00;
	private int transactionCount;
	final int freeTransactions = 2;
	//private double balance;

	/**
	 * 
	 */
	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountNumber
	 * @param balance
	 * @param customer
	 */
	public CheckingAccount(int accountNumber, double balance, Customer customer) {
		super(accountNumber, balance, customer);

	}

//make a withdraw - limit if higher than balance and count the transaction
	public void withdraw(double x) {
		if (x < this.balance) {
			this.balance = this.balance - x;
		} else {
			System.out.println("Changing withdraw amount to available balance of $" + this.balance + "\n");
			this.balance = this.balance - this.balance;
		}
		transactionCount++;
	}

//make a deposit and count the transaction
	public void deposit(double y) {
		this.balance = this.balance + y;
		transactionCount++;

	}
	@Override
//calculates monthly fees
	public double deductMonthlyFee() {

		double fee = (transactionFee * (transactionCount - freeTransactions));
		double total = this.balance - fee;
		return total;
	}

	@Override
	public String toString() {
		String output = "Checking Account Info: \n" + super.toString() + "\n";
		return output;
	}



}
