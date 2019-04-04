package Banking;

import java.awt.List;
import java.util.SortedSet;

public class Bank {

	private final String NAME;

	// Name of the Bank
	public Bank(String name) {
		this.NAME = "";
	}

	public static void main(String[] args) {
		System.out.println("Welcome!");
	}

	// Need a GUI for addCustomerGUI to add customer to the bank

	// add customers to the bank
	public String addCustomer(String lastName, String firstName) {
		return null;
	}

	// Get a customer Object
	public Customer getCustomer(String customerID) {
		return null;
	}

	// List of customers name, given there last name and first name
	public List<Customer> getCustomer(String lastName, String firstName) {
		return null;
	}

	// reports all customers in order of ID
	public SortedSet<Customer> getallCustomers() {
		return null;
	}

	// Deletes a customer from the bank
	public void removeCustomer(String customerID) {

	}

	// All accounts
	public SortedSet<Account> getAllAccounts() {
		return null;

	}

}