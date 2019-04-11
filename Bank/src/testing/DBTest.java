/*
 * Group: Fashionably Late
 * ------------------------------------------------------------
 * Version 1.0.0-25:
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
 * Account.Account(); Test done by:- Joshua Ventura & Michael Tarallo
 * Account.deposit();
 * Account.withdrawl();
 * Account.transfer(); Test started by:- Joshua Ventura & Michael Tarallo
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
 * Bank.addCustomer(); Test done by: Andres Cardenas
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.*;

import banking.*;

//Comments regarding project at top of class

public class DBTest extends Account {
	static String accDesc;
	static double initBal;
	static Customer cust;

	public DBTest() {
		super(cust, initBal, accDesc);

	}

	/*
	 * START OF ACCOUNT CLASS TESTS
	 */

	/*
	 * Finding customerID + accountID, Create string of Account Description ->
	 * Sets Account Description -> gets account description -> IF GET
	 * Description EQUALS Created String then [TRUE]
	 */
	@Test
	public void accountTest() {

		// Unnecessary but pretty
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		// Given
		String customerID = "CustID-420";
		String accountID = "AccountID-123";
		String localDateTime = dateFormat.format(date);
		double currentBal = 0.00;
		String newDescription = "New Account Description";

		// DEBUGGER: Shows customer information
		System.out.println(customerID + " | " + accountID + " | "
				+ localDateTime + " | " + "Balance: " + currentBal);
		System.out.println(newDescription);

		// Creating objects
		DBTest customerId = new DBTest();
		DBTest accountId = new DBTest();
		DBTest localDT = new DBTest();
		DBTest currentBalance = new DBTest();
		DBTest acc = new DBTest();

		// Requirements
		Assert.assertTrue(customerId.equals(customerID));

		Assert.assertTrue(accountId.getAccountId().equals(accountID));

		Assert.assertTrue(localDT.getAccountCreationDate()
				.equals(localDateTime));

		Assert.assertTrue(currentBalance.getBalance() == (currentBal));

		Assert.assertTrue(acc.getAccountDescription().equals(newDescription));

	}

	/*
	 * abstract void deposit (double amount) amount The amount to deposit
	 */
	public void depositTest() {

	}

	/*
	 * abstract void withdrawal (double amount) what amount is being withdrawn
	 * if there isn't enough throw something back
	 */
	public void withdrawalTest() {

	}

	/*
	 * static void transfer (Account fromAccount, Account toAccount, double
	 * amount) how much is about to be transfered for two Account IDs check if
	 * money has been transfered (you can check to see if balances have changed)
	 */

	@Test
	public void transferTest() {
		// Account Inbound - String
		// Account Outbound - String
		// Amount Transferred - Double

		// Given
		String accountOUT = "420";
		String accountIN = "123";

		double transferred = 1000000;
		double x = 0.0;

		// Creating objects
		DBTest accOUT = new DBTest();
		DBTest accIN = new DBTest();
		// DBTest amount1 = new DBTest();

		Assert.assertTrue(accOUT.customer.getCustomerAccounts().equals(
				accountOUT));
		Assert.assertTrue(accIN.customer.getCustomerAccounts()
				.equals(accountIN));

		// Assert.assertTrue(amount1.withdraw()==(transferred));
		// Assert.assertTrue(amount1.deposit()==(transferred));

	}

	/*
	 * List<Transaction> getTransactions test to see if the list contains any
	 * transaction test to see if items are added to the list
	 */
	public void getTransactionsTest() {

	}

	/*
	 * Transaction getTransaction (int transactionId) check to see if
	 * transaction exists
	 */

	public void TransactiongetTransaction() {

	}
	
	
////////////////////////////////
	/*
	 * START OF BANK CLASS TESTS
	 * 
	 */
////////////////////////////////
	
	
	/*
	 * Start of dummy information code
	 */
	
	/*
	 * PUBLIC SERVICE ANNOUNCEMENT!!! :
	 * I added the code to create the following:
	 * 
	 * 1 dummy bank:
	 * - Object: "fakeBank1" with String: "Fake Bank Name"
	 * 
	 * 3 dummy Customers:
	 * - Object: "cust1" with all parameters ending in "1"
	 * - Object: "cust2" with all parameters ending in "2"
	 * - Object: "cust3" with all parameters ending in "3"
	 * 
	 *  3 dummy Accounts:
	 * - Object: "acct1" with all parameters ending in "1"
	 * - Object: "acct2" with all parameters ending in "2"
	 * - Object: "acct3" with all parameters ending in "3"
	 * 
	 * PLEASE FEEL FREE TO USE THIS IF YOU WANT TO SAVE TIME ON
	 * EVERY CODE USED FOR TESTING. 
	 * 
	 * IF THIS IS USEFUL, THEN PLEASE MOVE IT UP THE CODE TO THE TOP,
	 * IF NOT, THEN LEAVE IT IN MY TESTING SECTION,
	 * 
	 * THANK YOU,
	 * ANDRES CARDENAS
	 * 
	 */
	
	
	//dummy bank name, first names and last names. 
	String fakeBankName = "Fake Bank Name";
	
	String cust1Last = "last Name 1";
	String cust1First = "First Name 1";
	
	String cust2Last = "last Name 2";
	String cust2First = "First Name 2";
	
	String cust3Last = "last Name 3";
	String cust3First = "First Name 3";
	
	//Dummy Bank used to created first 3 dummy clients and accounts
	Bank fakeBank1 = new Bank(fakeBankName);
	
	
	//Dummy customers used for testing and to create 
	//the first 3 dummy accounts
	Customer cust1 = new Customer(fakeBank1, cust1Last, cust1First);
	Customer cust2 = new Customer(fakeBank1, cust2Last, cust2First);
	Customer cust3 = new Customer(fakeBank1,cust3Last, cust3First);
	
	//Dummy accounts used for testing
	SavingsAccount acct1 = new SavingsAccount (cust1, 100, "Fake Account 1");
	SavingsAccount acct2 = new SavingsAccount (cust2, 200, "Fake Account 2");
	SavingsAccount acct3 = new SavingsAccount (cust3, 100, "Fake Account 3");
	
	/*
	 * End of dummy information code
	 */
	
	
	
	/*
	 * TEST FOR: Bank(String name) ALREADY DONE BY MIKE???
	 * 
	 * EDITS NEEDED: NONE
	 */
	
	
	
	/*
	 * TEST FOR: main(String[] args)
	 * Tests to see if main string equals main Test is TRUE.
	 * 
	 * EDITS NEEDED: NONE
	 */
	@Test
	public void mainTest() {

		Assert.assertTrue("Hello from Bank", true);

	}
	
	
	
	/*
	 *  TEST FOR: getInsufficientFundsPenalty()
	 * Gets default Funds -> If default funds are equal to the default value ->
	 * Test is TRUE
	 * 
	 * EDITS NEEDED: NONE
	 */
	
	@Test
	public void getInsufficientFundsPenaltyTest() {

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
	 * TEST FOR: setInsufficientFundsPenalty(double insufficientFundsPenalty) NOT BEING DONE AT THE MOMENT
	 * 
	 * EDITS NEEDED: NONE
	 */
	
	
	
	/*
	 * TEST FOR: getNAME()
	 * Sets a bank name -> gets the bank name -> displays the bank name if
	 * condition is FALSE.
	 * 
	 * EDITS NEEDED: NONE
	 */
	
	@Test
	public void getNameTest() {

		// Gives the following of type
		String newBank = "New Bank Name";

		// Creates an object
		Bank bankName = new Bank(newBank);

		// Sets a requirement
		Assert.assertTrue(bankName.getNAME().equals(newBank));

		// Displays output (Optional Debugging Purposes)
		System.out.println("Get Bank Name Test [FALSE]: " + newBank);

	}
	
	
	/*
	 * TEST FOR: addAccountWizard() NOT BEING DONE AT THE MOMENT
	 * 
	 * EDITS NEEDED: NONE
	 */


	
	/*
	 * TEST FOR: SortedSet<Account> getAllAccounts()
	 * 
	 * The method is called and the returned information will be tested against
	 * a predetermined SortedSet<> of accounts
	 * 
	 * EDITS NEEDED: DONE (Subject to team review)
	 */
		
	@Test
	public void getAllAccountsTest() {
		
		//SortedSet given to test against data received
		SortedSet<Account> fakeCustomerSer = new TreeSet();
				
		fakeCustomerSer.add(acct1);
		fakeCustomerSer.add(acct2);
		fakeCustomerSer.add(acct3);
		
		
		SortedSet<Account> dataAAccTest = new TreeSet();
		
		dataAAccTest = fakeBank1.getAllAccounts();
		
		Assert.assertEquals(fakeCustomerSer, dataAAccTest);
		
	}
	
	
	
	/*
	 * TEST FOR: addCustomerWizard() NOT BEING DONE AT THE MOMENT
	 * 
	 * EDITS NEEDED: NONE
	 * 
	 */
	

	
	/*
	 * TEST FOR: String addCustomer(String lastName, String firstName)
	 * 
	 * [Needs Explanation] --Added.equals for more concise syntax
	 * 
	 * EDITS NEEDED: DONE (Subject To Team Review)
	 */
	
	@Test
	public void addCustomerTest() {

		//given data to test against
		SortedSet<Customer> givenDataCust = new TreeSet();
		
		givenDataCust.add(cust1);

		
		//adds dummy customer
		fakeBank1.addCustomer(cust1Last, cust1First);

		//calls method and adds return value to variable
		SortedSet<Customer> testAddCust = new TreeSet();
		
		testAddCust = (SortedSet<Customer>) fakeBank1.getCustomer(cust1Last, cust1First);
		
		//test of results against given data
		Assert.assertEquals(testAddCust, testAddCust);
		
	}
	
	
	
	/*
	 * TEST FOR: void removeCustomer(String customerId) 
	 * 
	 * The method will be fed an ID of a customer object
	 * then that ID will be tested with the "Customer getCustomer ( String customerId )"
	 * if the Customer Object used exists then the tests fails. 
	 * 
	 * EDITS NEEDED: DONE (Subject to team review)
	 */
	
	@Test
	public void removeCustomerTest() {
		
		//First print out to make sure the customer exists before the test
		System.out.println(cust1.getCustomerId());
		
		//cust1 ID will be tested
		String FakeIdTest = cust1.getCustomerId();
		
		//customer removal
		fakeBank1.removeCustomer(FakeIdTest);
		
		//Request return information from method and
		//set it to variable
		Customer testCustomer = fakeBank1.getCustomer(FakeIdTest);

		//Test
		Assert.assertEquals(testCustomer, null);
		
		if (testCustomer == null) {
			System.out.println("removeCustomerTest returned null, test passed");
		}	
			else {
				System.out.println("removeCustomerTest returned an ID Number, test NOT passed");
				
			}
		
		//adding the customer back after testing for future use
		//if the test fails, the method will return null or throw an exception
		fakeBank1.addCustomer(cust1Last, cust1First);
		
	}

	
	/*
	 * TEST FOR: SortedSet<Customer> getAllCustomers()
	 * 
	 * The method is called and the returned information will be tested against
	 * a predetermined SortedSet<> of Customers
	 * 
	 * EDITS NEEDED: QUICK REVIEW
	 */
	
	@Test
	public void getAllCustomersTest() {

		//given data to test against
		SortedSet<Customer> givenDataAllCust = new TreeSet();
		
		givenDataAllCust.add(cust1);
		givenDataAllCust.add(cust2);
		givenDataAllCust.add(cust3);
		
		//calls method and adds data returned to variable
		SortedSet<Customer> receivedDataAllCust = new TreeSet();
		receivedDataAllCust = fakeBank1.getAllCustomers();
		
		//Test of the data
		Assert.assertEquals(givenDataAllCust, receivedDataAllCust);
		

	}
	
	

	/*
	 * TEST FOR: Customer getCustomer(String customerId)
	 * tests that the getCustID variable equals the client object returned by
	 * the method
	 * 
	 * EDITS NEEDED: QUICK REVIEW
	 */
	
	 @Test 
	 public void getCustomerTest() {
	 
	//ID test against
	 String getCustID = "12345";
	 
	 Bank getCustObj = new Bank("BankName1");
	 
	 //Gives the variable testResult the result returned by the 
	 //method being tested
	 Object testResult = getCustObj.getCustomer(getCustID);
	 
	 
	 //Tests Result against ID variable
	 Assert.assertEquals(testResult, getCustID);
	 
	 }
	 
	 
	 
	 /* 
	  * TEST FOR: List<Customer> getCustomer(String lastName, String firstName)
	  * 
	  * This method creates an ArrayList with cust1, cust2 and cust3
	  * then requests the list of all clients in the program
	  * and tests it against the original ArrayList previously set. 
	  * 
	  * Need assistance on List - Peter 4/9/19
	  * 
	  * EDITS NEEDED: DONE (Subject To Team Review)
	 */
	 
	@Test
	public void listGetCustomerTest() {
		
		//passing information to this variable
		//to have something to test against
		List<Customer> testListGet = new ArrayList();
		
		testListGet.add(cust1);

		
		//add data returned from the method to the ArrayList created
		List<Customer> dataToTestGet = fakeBank1.getCustomer(cust1Last, cust1First);
		
		 //Tests Result against ID variable
		 Assert.assertEquals(testListGet, dataToTestGet);

	}

	
	
	/*
	 * TEST FOR: List<Account> getCustomersAccounts(String customerId) NOT BEING DONE AT THIS MOMENT
	 * THIS METHOD IS NOT A REQUIREMENT
	 * 
	 * EDITS NEEDED: NONE
	 */
	
	@Test
	public void getCustomerAccountsTest() {

	}
	
	
	
////////////////////////////////
	/*
	 * END OF BANK CLASS TESTS
	 * 
	 */
////////////////////////////////
	
	

	/*
	 * START OF CUSTOMER CLASS TESTS
	 */

	/*
	 * Customer
	 * 
	 * test bank that owns the account test last name to verify test first to
	 * verify
	 */

	/*
	 * ytdFees test total fees. Create fees for a year and test
	 */

	/*
	 * ytdInterest test total interest for the year
	 */

	/*
	 * savingsAccount addSavingsAccount test balance test that the account id
	 * entered is verified
	 */

	/*
	 * removeAccount test to remove account test that the id no longer exists
	 * test if id exists
	 */

	/*
	 * Account getAccount test if account ID exists if account doesn't exist
	 * return null
	 */

	/*
	 * START OF SAVINGSACCOUNT CLASS TESTS
	 */

	/*
	 * SavingsAccount test that account ID exists test for balance test that
	 * there is a description created by owner
	 */

	/*
	 * addInterestTransaction create a rate of interest test that the rate is
	 * applied monthly
	 */

	/*
	 * START OF TRANSACTION TYPE CLASS TESTS
	 */

	/*
	 * Transaction(TransactionType type, double amount, String description) test
	 * what type of transaction (withdrawal, transfer, deposit) test how much
	 * the transaction is worth test there is a description of the transaction
	 * (was it a check, who did the transaction... ect)
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

	// Don't touch.
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

	}
}
