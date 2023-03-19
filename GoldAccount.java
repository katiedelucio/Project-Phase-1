
public class GoldAccount extends Account {
	final double interest = 0.05;

	/**
	 * 
	 */
	public GoldAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accountNumber
	 * @param balance
	 * @param customer
	 */
	public GoldAccount(int accountNumber, double balance, Customer customer) {
		super(accountNumber, balance, customer);
		// TODO Auto-generated constructor stub
	}

//calculates monthly fees
	public double deductMonthlyFee() {

		double fee = (this.balance * interest);
		double total = this.balance - fee;
		return total;
	}

	@Override
	public String toString() {
		String output = "Gold Account Info: \n" + super.toString() + "\n";
		return output;
	}

}
