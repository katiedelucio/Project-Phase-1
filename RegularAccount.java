
public class RegularAccount extends Account {
	final double interest = 0.06;
	final double maintFee = 10.00; // monthly fee
	

	/**
	 * 
	 */
	public RegularAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountNumber
	 * @param balance
	 * @param customer
	 */
	public RegularAccount(int accountNumber, double balance, Customer customer) {
		super(accountNumber, balance, customer);
		// TODO Auto-generated constructor stub
	}

//make a withdraw - limit if higher than balance
	public void withdraw(double x) {
		if (x <= this.balance) {
			this.balance = this.balance - x;
		} else {
			System.out.println("Changing withdraw amount to available balance of $" + this.balance + "\n");
			this.balance = this.balance - this.balance;
		}

	}

//calculates monthly fees
	public double deductMonthlyFee() {

		double fee = (this.balance * interest) + maintFee;
		double total = this.balance - fee;
		return total;
	}

	@Override
	public String toString() {
		String output = "Regular Account Info: \n" + super.toString() + "\n";
		return output;
	}

}
