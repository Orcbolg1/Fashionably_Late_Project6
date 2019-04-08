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
 * Account.getBalance();
 * Account.getCustomerId();
 * Account.getAccountId();
 * 
 * ---BANK CLASS---
 * Bank.getNAME(); Test done by: - Michael Tarallo
 * Bank.getInsufficientFundsPenalty(); Test done by: - Michael Tarallo
 * Bank.setInsufficientFundsPenalty(); 
 * Bank.getAllAccounts();
 * Bank.addCustomer();
 * Bank.removeCustomer();
 * Bank.getCustomer();
 * Bank.getAllCustomers();
 * 
 * ---CUSTOMER CLASS---
 * Customer.getCustomerId();
 * Customer.getBank();
 * Customer.getFirstName();
 * Customer.getLastName();
 * Customer.getCustomerAccounts();
 * 
 * ---TRANSACTION CLASS---
 * Transaction.getId();
 * Transaction.getType();
 * Transaction.getAmount();
 * Transaction.getDescription();
 * Transaction.getTimestamp();
 * 
 * 
 * ------------------------------------------------------------
 */

package testing;

import org.junit.*;
import banking.*;

//Comments regarding project at top of class

public class DBTest {

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

}
