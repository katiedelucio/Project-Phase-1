
public abstract class Account {
private int accountNumber;
public double balance;
private Customer customer;
/**
 * 
 */
public Account() {
	super();
}
/**
 * @param accountNumber
 * @param balance
 * @param customer
 */
public Account(int accountNumber, double balance, Customer customer) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.customer = customer;
}
/**
 * @return the accountNumber
 */
public int getAccountNumber() {
	return accountNumber;
}
/**
 * @param accountNumber the accountNumber to set
 */
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
/**
 * @return the balance
 */
public double getBalance() {
	return balance;
}
/**
 * @param balance the balance to set
 */
public void setBalance(double balance) {
	this.balance = balance;
}
/**
 * @return the customer
 */
public Customer getCustomer() {
	return customer;
}
/**
 * @param customer the customer to set
 */
public void setCustomer(Customer customer) {
	this.customer = customer;
}

public void withdraw(double x) {
	this.balance = this.balance - x;
	
}

public void deposit(double y) {
	this.balance = this.balance + y;
	
}

protected abstract double deductMonthlyFee(); 	

@Override
public String toString() {
	String output = "Account Number: " + accountNumber + " Balance: " + balance + "\n" + customer;
	return output;
}



}
