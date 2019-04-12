package testing;

import static org.junit.Assert.*;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

import banking.Account;
import banking.Bank;
import banking.Customer;
import banking.SavingsAccount;


public class CustomerTest extends Customer {
	
	private static Bank bank;

	/*
	 * START OF CUSTOMER CLASS TESTS
	 */

	/*
	 * Customer
	 * 
	 * test bank that owns the account test last name to verify test first to
	 * verify
	 */
	static String lastName;
	static String firstName;
	
	public CustomerTest() {
		super(bank, lastName, firstName);
		
	}
	
	
	public void setLastName(String lastName) {
		CustomerTest.lastName = lastName;
	}
	
	public String getLastName(String lastName) {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		CustomerTest.firstName = firstName;
	}
	
	public String getFirstName(String firstName) {
		return firstName;
	}
	// Testing Constructor
	Customer customer1 = new Customer(null, lastName, firstName);
	Customer customer2 = new Customer(null, lastName, firstName);
	Customer customer3 = new Customer(null, lastName, firstName);
	// Testing Constructor
	
	SavingsAccount account1 = new SavingsAccount(customer1, 0, null, 0);
	SavingsAccount account2 = new SavingsAccount(customer2, 0, null, 0);
	SavingsAccount account3 = new SavingsAccount(customer3, 0, null, 0);
	
	@SuppressWarnings("deprecation")
	@Test
	public void CustomerNameTest() {
		SortedSet<Account> customerAccounts = new TreeSet<>();
		
		
		//creating objects
		Customer lastName1 = new Customer(null, lastName, firstName);
		Customer firstName1 = new Customer(null, lastName, firstName);
		
		// Testing
		Assert.assertEquals(lastName1, lastName);
		Assert.assertEquals(firstName1, firstName);
		
	}
	


	/*
	 * ytdFees test total fees. Create fees for a year and test
	 */
	
	//public double YtdFees(){
		
	//}
	
	
	/*
	 * ytdInterest test total interest for the year
	 */

	/*
	 * savingsAccount addSavingsAccount test balance test that the account id
	 * entered is verified
	 */
	
	@Test
	public void addSavingsAccount() {
		SortedSet<Account> customerAccounts = new TreeSet<>();
		double initBal = 0.00;
		String description = "Account Description";
		
		String custInfo = (initBal + description);
		String BalanceToString = Double.toString(initBal);
		
		CustomerTest addSavingAccount = new CustomerTest();
		
		customerAccounts.add(account1);
		
		Assert.assertTrue(addSavingAccount.getCustomerId().equals(custInfo));
		
			
	}
	
	

	/*
	 * removeAccount test to remove account test that the id no longer exists
	 * test if id exists
	 */
	
	@Test
	public void removeAccount() {
		SortedSet<Account> customerAccounts = new TreeSet<>();
		
		//adding dummy into set
		customerAccounts.add(account1);
		customerAccounts.add(account2);
		customerAccounts.add(account3);
		
		//removing from set
		customerAccounts.remove(account1);
		
		//Test
		assertEquals(account1, customerAccounts);
		assertEquals(account2, customerAccounts);
		assertEquals(account3, customerAccounts);
	}



	/*
	 * Account getAccount test if account ID exists if account doesn't exist
	 * return null
	 */
	@Test
	public void getAccount() {
		SortedSet<Account> customerAccounts = new TreeSet<>();
		String accountId = "CustID-024";
		
		CustomerTest AccountID = new CustomerTest();
		
		System.out.println(accountId);
		
		Assert.assertTrue(AccountID.getAccount(accountId).equals(accountId));
		
		
	}
	
	private Object getCustomerTest() {
		// TODO Auto-generated method stub
		return null;
		}
	}
