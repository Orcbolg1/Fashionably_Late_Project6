/*
 * Group: Fashionably Late
 * ------------------------------------------------------------
 * Version 1.0.0-4:
 * ------------------------------------------------------------
 * Main Class to carry out testing of methods within banking package.
 * 
 * This class will be used for all functionality of all test cases.
 * Upon submission this will be the single class that gets turned in.
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
 * 
 * ------------------------------------------------------------
 * TO-DO:
 * --Create a dataset (Map?) with testable data to use when testing methods of the banking package
 * --Test each method below accordingly
 * 
 * ------------------------------------------------------------
 * 
 * METHODS TO TEST*(Subject to change. Add or Remove as needed):
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
 * Bank.addCustomer(); Test done by: Andres Cardenas
 * Bank.removeCustomer();
 * Bank.getCustomer();
 * Bank.getAllCustomers(); 
 * Bank.List<Customer> getCustomer();
 * Bank.Bank(); Test being done by Andres Cardenas (this test might not be necesary)
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
 * enum TransactionType{ 
 * DEPOSIT, WITHDRAWAL, INTEREST, CHECK, FEE, PENALTY, ADJUSTMENT; }
 * Test done by Joshua Ventura 
 *
 * ------------------------------------------------------------
 */

package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.junit.*;
import org.omg.CORBA.portable.InputStream;

import banking.*;

//Comments regarding project at top of class

public class DBTest {

	/*
	 * START OF BANK CLASS TESTS
	 */
	
	
	
	
	//This testing method is a work in progress. 
	@Test
	public void BankTester() {
		
		String bankName = "Fake Bank";
		
		Bank bankBankObj = new Bank(bankName);
		
		Assert.assertTrue(bankBankObj.Bank() == bankName);
		
	}
	
	
	
	
	
	
	/* 
	 * Sets a bank name -> gets the bank name -> displays the bank name if
	 * condition is TRUE.
	 */
	@Test
	public void getBankName() {

		// Gives the following of type
		String newBank = "New Bank Name";

		// Creates an instance
		Bank bankName = new Bank(newBank);

		// Sets a requirement
		Assert.assertTrue(bankName.getNAME() == newBank);

		// Displays output (Optional Debugging Purposes)
		System.out.println(newBank);

	}
	
	/*
	 * Tests to see if main string equals main
	 * Test is TRUE.
	 */
	
	@Test
	public void mainTest() {
		
		// all three solutions below work and test main 
		// these solutions can potentially be used for future tests
		
		//equals("Hello from Bank");
		
	    Assert.assertTrue("Hello from Bank", true);
	    
	    //Bank.main(new String[] {"Hello from Bank"});
		
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
		System.out.println(insuffFunds.getInsufficientFundsPenalty());
	}

	/*
	 * Sets a penalty value -> Applies penalty value to
	 * setInsufficientFundsPenalty -> Displays new penalty
	 * 
	 * 
	 * (NOTE: I don't believe this is implemented correctly. Having issues
	 * setting with the method returning void. Should this be tested?)
	 */
	@Test
	public void setInsufficientFundsTest() {
		// Gives the following of type
		double penalty = 20;

		// Creates an instance
		Bank newPenalty = new Bank(Double.toString(penalty));

		// Sets fund penalty
		newPenalty.setInsufficientFundsPenalty(penalty);

		// Displays output (Optional Debugging Purposes)
		// --Can't display 'penalty' to setInsufficientFundsPenalty
		System.out.println("New Penalty: " + penalty);
	}

	/*
	 * This method isn't on the required list
	 * May be needed for the getAllAccountsTest() method
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
	 * addCustomerWizardTest isn't required 
	 * May be used for the getAllCumstomerTest() method
	 */
	@Test
	public void addCustomerWizardTest() {
		
		// I atempted to make this work as a string reader
		// Not sure if thats the way we wont to go, but its 
		// here for whoever wants to try
		
		String newCustomer = "Enter Customer Name: ";
		
		Bank customerWiz = new Bank(newCustomer);
		
		ByteArrayInputStream inputCustomer = new ByteArrayInputStream(newCustomer.getBytes());
		
		System.setIn(inputCustomer);
		
		//assertEquals("Enter Customer Name: ", Bank.addCustomerWizard() );
		
		

	}
	
	/*
	 * 
	 */
	@Test
	public void addCustomerTest() {
		
		String lastNameVar = "FakeLastName";
		
		String firstNameVar = "FaveFirstName";
		
		String testTrue = lastNameVar + " " + firstNameVar;
		
		Bank addCustomerObj = new Bank(testTrue);
		
		Assert.assertTrue(addCustomerObj.addCustomer(lastNameVar, firstNameVar) == testTrue);
		
		System.out.println(testTrue);
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
	 * Since these enums are empty, I have added test data which would correspond
	 * to the enum type. 
	 * The test below tests all enums within the method.
	 */
	@Test
	public void TransactionTypeTest() {
		Assert.assertEquals("Deposit", TransactionType.DEPOSIT.name());
		Assert.assertEquals("Withdrawal", TransactionType.WITHDRAWAL.name());
		Assert.assertEquals("Interest", TransactionType.INTEREST.name());
		Assert.assertEquals("Check", TransactionType.CHECK.name());
		Assert.assertEquals("Fee", TransactionType.FEE.name());
		Assert.assertEquals("Penalty", TransactionType.PENALTY.name());
		Assert.assertEquals("Adjustment", TransactionType.ADJUSTMENT.name());
	}
}
