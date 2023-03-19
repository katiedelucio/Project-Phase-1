
public class Customer {
private String name;
private String address;
private int ID;
/**
 * @param name
 * @param address
 * @param iD
 */
public Customer(String name, String address, int iD) {
	super();
	this.name = name;
	this.address = address;
	ID = iD;
}
/**
 * 
 */
public Customer() {
	super();
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the iD
 */
public int getID() {
	return ID;
}
/**
 * @param iD the iD to set
 */
public void setID(int iD) {
	ID = iD;
}
@Override
public String toString() {
	String output = "Customer Info: \nName: " + name + " Address: " + address + " ID: " + ID;
	return output;
}


}
