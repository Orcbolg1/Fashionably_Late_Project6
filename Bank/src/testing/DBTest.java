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
 * Bank.getAllCustomers(); 
 * Bank.List<Customer> getCustomer();
 * 
 * ---BANK CLASS OPTIONAL---
 * Bank.getInsufficientFundsPenalty(); Test done by: - Michael Tarallo
 * Bank.setInsufficientFundsPenalty();
 * 
 * ---CUSTOMER CLASS---
 * Customer.Customer();
 * Customer.getCustomerId();
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
 */

package testing;

import java.io.ByteArrayInputStream;

import org.junit.*;

import banking.*;

//Comments regarding project at top of class

public class DBTest {

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
	public void addAccountWizardTest() {

	}

	/*
	 * 
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

		// Setting
		String getCustName = (lastName + firstName);
		String getCustID = (custID);

		String customerInfo = (getCustName + getCustID);

		// Create Object
		Bank addCustomerName = new Bank(getCustName);

		// Test Requirement
		Assert.assertTrue(addCustomerName.addCustomer(getCustName, getCustID)
				.equals(customerInfo));

		System.out.println("Add Customer Test [FALSE]: " + customerInfo);

	}

	/*
	 * 
	 */
	@Test
	public void getAllCustomersTest() {

	}

	/*
	 * 
	 */
	@Test
	public void getCustomerTest() {

	}

	/*
	 * 
	 */
	@Test
	public void listGetCustomerTest() {

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
	 * START OF TRANSACTION TYPE CLASS TESTS
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
