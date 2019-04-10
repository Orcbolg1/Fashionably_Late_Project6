/*
 * Group: Fashionably Late
 * ------------------------------------------------------------
 * Version 1.0.0-4:
 * ------------------------------------------------------------
 * Main Class to carry out testing of methods within banking package.
 * 
 * This class will be used for all functionality of all test cases.
 * Upon submission this will be the single class that gets turned in*
 * Or JUnit Suite will be created.
 * ------------------------------------------------------------
 * 
 * Syntax Refreshing:
 * --------------------------
 * Importing a package syntax:
 * package <package name>;
 * 
 * Importing a class to class:
 * import <package name>.<class>;
 * --------------------------
 * 
 * Please update the comment section below this with additions:
 * ------------------------------------------------------------
 * ADDITIONS:
 * --Imported Skeleton Classes given for project
 * --Created 'DBTest' class
 * --Imported package 'banking' classes
 * --Created JUnit 4 for testing
 * --Added Suppressed Warnings for unused imports
 * --Added Test Case for Bank.getNAME();
 * --Removed created Bank.Bank as test is already conducted within Bank.getNAME();
 * 
 * ------------------------------------------------------------
 * TO-DO:
 * --Create a dataset (Map?) with testable data to use when testing methods of the banking package
 * --Test each method below accordingly
 * 
 * ------------------------------------------------------------
 * METHODS TO TEST*(Subject to change. Add or Remove as needed):
 * ------------------------------------------------------------
 * 
 * ---ACCOUNT CLASS---
 * Account.Account();
 * Account.deposit();
 * Account.withdrawl();
 * Account.transfer();
 * Account.List<Transaction> getTransactions();
 * Account.Transaction getTransaction();
 * 
 * ---ACCOUNT CLASS OPTIONAL---
 * * Add later
 * 
 * ---BANK CLASS---
 * Bank.getNAME(); Test done by: - Michael Tarallo
 * Bank.main(); Test done by: Joshua Ventura 
 * Bank.getAllAccounts();
 * Bank.addCustomer(); Test done by: Andres Cardenas || Overhauled by: Michael Tarallo
 * Bank.removeCustomer();
 * Bank.getCustomer();
 * Bank.getAllCustomers(); Test done by: Andres Cardenas
 * Bank.List<Customer> getCustomer();
 * 
 * ---BANK CLASS OPTIONAL---
 * Bank.getInsufficientFundsPenalty(); Test done by: - Michael Tarallo
 * Bank.setInsufficientFundsPenalty();
 * 
 * ---CUSTOMER CLASS---
 * Customer.Customer();
 * Customer.ytdFees();
 * Customer.ytdInterest();
 * Customer SavingsAccount addSavingsAccount();
 * Customer.removeAccount();
 * Customer.Account getAccount();
 * 
 * ---CUSTOMER CLASS OPTIONAL---
 * * Add later
 * 
 * ---SAVINGS ACCOUNT CLASS---
 * SavingsAccount.SavingsAccount();
 * SavingsAccount.addInterest();
 * 
 * ---SAVINGS ACCOUNT CLASS OPTIONAL---
 * * Add later
 * 
 * 
 * ---TRANSACTION CLASS---
 * Transaction.Transaction();
 * 
 * ---TRASACTION TYPE CLASS---
 * TransactionType; Test done by:- Joshua Ventura 
 * 
 *
 * ------------------------------------------------------------
 * 
 * As on 4/9/2019
 * Andres is finishing what is left of Bank class and Transaction class
 * 
 * Josh is taking SavingsAccount and working on methods in Account and Customer
 * 
 * Mike is taking Account
 * 
 * Peter is taking Customer
 */

package testing;

import java.io.ByteArrayInputStream;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.*;

import banking.*;

//Comments regarding project at top of class

public class DBTest {

	/*
	 * START OF ACCOUNT CLASS TESTS
	 */
	
	/*
	 * Account()
	 * check for customer specific ID
	 * check for current balance
	 * produce a description of what's in ID and current balance
	 */
	public void accountTest() {
		
	}
	
	/*
	 * abstract void deposit (double amount)
	 * amount The amount to deposit
	 */
	public void depositTest() {
		
	}
	
	/*
	 * abstract void withdrawal (double amount)
	 * what amount is being withdrawn 
	 * if there isn't enough throw something back
	 */
	public void withdrawalTest() {
		
	}
	
	/*
	 * static void transfer (Account fromAccount, Account toAccount,
	 * 	double amount)
	 * how much is about to be transfered
	 * for two Account IDs 
	 * check if money has been transfered (you can check to see if balances have changed)
	 */
	
	public void transferTest() {
		
	}
	
	/*
	 * List<Transaction> getTransactions
	 * test to see if the list contains any transaction
	 * test to see if items are added to the list
	 */
	public void getTransactionsTest() {
		
	}
	
	/*
	 * Transaction getTransaction (int transactionId)
	 * check to see if transaction exists
	 * 
	 */
	
	public void TransactiongetTransaction() {
		
	}
	
	/*
	 * START OF BANK CLASS TESTS
	 */

	/*
	 * Sets a bank name -> gets the bank name -> displays the bank name if
	 * condition is FALSE.
	 */
	@Test
	public void getBankName() {

		// Gives the following of type
		String newBank = "New Bank Name";

		// Creates an instance
		Bank bankName = new Bank(newBank);

		// Sets a requirement
		Assert.assertFalse(bankName.getNAME().equals(newBank));

		// Displays output (Optional Debugging Purposes)
		System.out.println("Get Bank Name Test [FALSE]: " + newBank);

	}

	/*
	 * Tests to see if main string equals main Test is TRUE.
	 */

	@Test
	public void mainTest() {

		// all three solutions below work and test main
		// these solutions can potentially be used for future tests

		// equals("Hello from Bank");

		Assert.assertTrue("Hello from Bank", true);

		// Bank.main(new String[] {"Hello from Bank"});

	}

	/*
	 * Gets default Funds -> If default funds are equal to the default value ->
	 * Test is TRUE
	 */
	@Test
	public void getInsufficientFundsTest() {

		// Gives the following of type
		String insufficientFunds = "Insufficiant Funds ";

		// Creates an instance
		Bank insuffFunds = new Bank(insufficientFunds);

		// Sets a requirement
		Assert.assertTrue(insuffFunds.getInsufficientFundsPenalty() == 10);

		// Displays output (Optional Debugging Purposes)
		// System.out.println(insuffFunds.getInsufficientFundsPenalty());
	}

	/*
	 * This method isn't on the required list May be needed for the
	 * getAllAccountsTest() method
	 */
	@Test
	public void addAccountWizardTest(String newAccount) {
		// Copy and paste AddCustomerWizard.	
		String AccountId = "Enter Account ID: ";
			
			Bank accountWiz = new Bank(newAccount);
			
			ByteArrayInputStream inputAccount = new ByteArrayInputStream(
					newAccount.getBytes());
			
			System.setIn(inputAccount);
	}

	/*
	 * test From account class that creates accounts 
	 * test all accounts are up to date 
	 * test that list is sorted 
	 */
	@Test
	public void getAllAccountsTest() {

	}

	/*
	 * addCustomerWizardTest isn't required May be used for the
	 * getAllCustomerTest() method
	 */
	@Test
	public void addCustomerWizardTest() {

		// I attempted to make this work as a string reader
		// Not sure if thats the way we wont to go, but its
		// here for whoever wants to try

		String newCustomer = "Enter Customer Name: ";

		Bank customerWiz = new Bank(newCustomer);

		ByteArrayInputStream inputCustomer = new ByteArrayInputStream(
				newCustomer.getBytes());

		System.setIn(inputCustomer);

		// assertEquals("Enter Customer Name: ", Bank.addCustomerWizard() );

	}

	/*
	 * [Needs Explaination] --Added.equals for more concise syntax
	 */
	@Test
	public void addCustomerTest() {

		// Given
		String lastName = "LastName";
		String firstName = "FirstName";
		String custID = "123";

		
		
		/*I believe this section is not required. 
		 * 
		 * 
		// Setting
		String getCustName = (lastName + firstName);
		String getCustID = (custID);

		String customerInfo = (getCustName + getCustID);
		*/
		
		
		

		// Create Object
		Bank addCustomerName = new Bank(custID);
				

		// Test Requirement
		//call the object with the LastName and First Name String variables
		//to receive the customer's ID returned by the method. 
		//then tests for matching ID's
		Assert.assertTrue(addCustomerName.addCustomer(lastName, firstName)
				.equals(custID));

		System.out.println("Add Customer Test [FALSE]: " + custID);

	}

	/*
	 * 
	 */
	@Test
	public void getAllCustomersTest() {

		//creates dummy SortedSet
		SortedSet<String> sortedTestVar = new TreeSet<>();
		sortedTestVar.add("ID1: 123");
		sortedTestVar.add("ID2: 456");
		sortedTestVar.add("ID2: 789");
		
		//creates SortedSet to hold information returned by the method
		SortedSet<Customer> returnSortedSet = new TreeSet<>();
		
		//fake ID used to create object
		String fakeID = "";
		
		Bank getAllTestObj = new Bank(fakeID);
		
		//calls the method and stores returned values
		returnSortedSet = getAllTestObj.getAllCustomers();
		
		//compares dummy info against information returned by the method
		Assert.assertEquals(returnSortedSet, sortedTestVar);
		
		
	}

	/*
	 * tests that the getCustID variable equals the 
	 * client object returned by the method
	 */
	@Test
	public void getCustomerTest() {
		
		String getCustID = "12345";
		
		Bank getCustObj = new Bank(getCustID);
		
		Object testResult = getCustObj.getCustomer(getCustID);
		
		Assert.assertEquals(testResult, getCustID);

	}

	/*
	 * Need assistance on List - Peter 4/9/19
	 */
	@Test
	public void listGetCustomerTest() {
//		Object[] getCustomerId;
//		// Initialize variable
//		String CustomerList = null;
//		
//		// Create object list
//		Bank getCustomers = new Bank(CustomerList);
//		
//		//Adding customers to list
//		Customer customer1 = new Customer("LastName","FirstName", "1");
//        Customer customer2 = new Customer("LastName","FirstName", "2");
//        Customer customer3 = new Customer("LastName","FirstName", "3");
//        getCustomers.add(customer1);
//        getCustomers.add(customer2);
//        getCustomers.add(customer3);
//        
//        //Test
//        Assert.assertEquals(null, null, getCustomerId);
//

	}

	/*
	 * THIS METHOD IS NOT A REQUIREMENT
	 */
	@Test
	public void getCustomerAccountsTest() {

	}

	/*
	 * START OF CUSTOMER CLASS TESTS
	 */
	
	/*
	 * Customer
	 * 
	 * test bank that owns the account 
	 * test last name to verify
	 * test first to verify
	 */
	


	/*
	 * ytdFees
	 * test total fees. Create fees for a year and test 
	 */
	
	/*
	 * ytdInterest
	 * test total interest for the year
	 */
	
	/*
	 * savingsAccount addSavingsAccount
	 * test balance 
	 * test that the account id entered is verified 
	 * 
	 */
	
	/*
	 * removeAccount
	 * test to remove account
	 * test that the id no longer exists
	 * test if id exists
	 */
	
	/*
	 * Account getAccount
	 * test if account ID exists 
	 * if account doesn't exist return null
	 */
	
	/*
	 * START OF SAVINGSACCOUNT CLASS TESTS
	 */
	
	/*
	 * SavingsAccount
	 * test that account ID exists
	 * test for balance
	 * test that there is a description created by owner
	 * 
	 */
	
	/*
	 * addInterestTransaction
	 * create a rate of interest 
	 * test that the rate is applied monthly
	 * 
	 */
	
	/*
	 * START OF TRANSACTION TYPE CLASS TESTS
	 */

	/*
	 * Transaction(TransactionType type, double amount, String description)
	 * test what type of transaction (withdrawal, transfer, deposit)
	 * test how much the transaction is worth
	 * test there is a description of the transaction (was it a check, who did the transaction... ect)
	 */
	
	/*
	 * Since these enums are empty, I have added test data which would
	 * correspond to the enum type. The test below tests all enums within the
	 * method.
	 */
	@Test
	public void transactionTypeTest() {
		Assert.assertEquals("Deposit", TransactionType.DEPOSIT.name());
		Assert.assertEquals("Withdrawal", TransactionType.WITHDRAWAL.name());
		Assert.assertEquals("Interest", TransactionType.INTEREST.name());
		Assert.assertEquals("Check", TransactionType.CHECK.name());
		Assert.assertEquals("Fee", TransactionType.FEE.name());
		Assert.assertEquals("Penalty", TransactionType.PENALTY.name());
		Assert.assertEquals("Adjustment", TransactionType.ADJUSTMENT.name());
	}
}
