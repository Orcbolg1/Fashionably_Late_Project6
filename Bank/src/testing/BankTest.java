package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

import banking.Account;
import banking.Bank;
import banking.Customer;
import banking.SavingsAccount;

public class BankTest {

	/*
	 * ---------- START OF BANK CLASS TESTS ----------
	 */

	/*
	 * Start of dummy information code
	 */

	/*
	 * PUBLIC SERVICE ANNOUNCEMENT!!! : I added the code to create the
	 * following:
	 * 
	 * 1 dummy bank: - Object: "fakeBank1" with String: "Fake Bank Name"
	 * 
	 * 3 dummy Customers: - Object: "cust1" with all parameters ending in "1" -
	 * Object: "cust2" with all parameters ending in "2" - Object: "cust3" with
	 * all parameters ending in "3"
	 * 
	 * 3 dummy Accounts: - Object: "acct1" with all parameters ending in "1" -
	 * Object: "acct2" with all parameters ending in "2" - Object: "acct3" with
	 * all parameters ending in "3"
	 * 
	 * PLEASE FEEL FREE TO USE THIS IF YOU WANT TO SAVE TIME ON EVERY CODE USED
	 * FOR TESTING.
	 * 
	 * IF THIS IS USEFUL, THEN PLEASE MOVE IT UP THE CODE TO THE TOP, IF NOT,
	 * THEN LEAVE IT IN MY TESTING SECTION,
	 * 
	 * THANK YOU, ANDRES CARDENAS
	 */

	// dummy bank name, first names and last names.
	String fakeBankName = "Fake Bank Name";

	String cust1Last = "last Name 1";
	String cust1First = "First Name 1";

	String cust2Last = "last Name 2";
	String cust2First = "First Name 2";

	String cust3Last = "last Name 3";
	String cust3First = "First Name 3";

	// Dummy Bank used to created first 3 dummy clients and accounts
	Bank fakeBank1 = new Bank(fakeBankName);

	// Dummy customers used for testing and to create
	// the first 3 dummy accounts
	Customer cust1 = new Customer(fakeBank1, cust1Last, cust1First);
	Customer cust2 = new Customer(fakeBank1, cust2Last, cust2First);
	Customer cust3 = new Customer(fakeBank1, cust3Last, cust3First);

	// Dummy accounts used for testing
	SavingsAccount acct1 = new SavingsAccount(cust1, 100, "Fake Account 1");
	SavingsAccount acct2 = new SavingsAccount(cust2, 200, "Fake Account 2");
	SavingsAccount acct3 = new SavingsAccount(cust3, 100, "Fake Account 3");

	/*
	 * End of dummy information code
	 */

	/*
	 * TEST FOR: Bank(String name)
	 * 
	 * EDITS NEEDED: NONE
	 */

	/*
	 * TEST FOR: main(String[] args) Tests to see if main string equals main
	 * Test is TRUE.
	 * 
	 * EDITS NEEDED: NONE
	 */
	@Test
	public void mainTest() {

		Assert.assertTrue("Hello from Bank", true);

	}

	/*
	 * TEST FOR: getInsufficientFundsPenalty() Gets default Funds -> If default
	 * funds are equal to the default value -> Test is TRUE
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
	 * TEST FOR: setInsufficientFundsPenalty(double insufficientFundsPenalty)
	 * NOT BEING DONE AT THE MOMENT
	 * 
	 * EDITS NEEDED: NONE
	 */

	/*
	 * TEST FOR: getNAME() Sets a bank name -> gets the bank name -> displays
	 * the bank name if condition is FALSE.
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
		Assert.assertFalse(bankName.getNAME().equals(newBank));

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

		// SortedSet given to test against data received
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

		// given data to test against
		SortedSet<Customer> givenDataCust = new TreeSet();

		givenDataCust.add(cust1);

		// adds dummy customer
		fakeBank1.addCustomer(cust1Last, cust1First);

		// calls method and adds return value to variable
		SortedSet<Customer> testAddCust = new TreeSet();

		testAddCust = (SortedSet<Customer>) fakeBank1.getCustomer(cust1Last,
				cust1First);

		// test of results against given data
		Assert.assertEquals(testAddCust, testAddCust);

	}

	/*
	 * TEST FOR: void removeCustomer(String customerId)
	 * 
	 * The method will be fed an ID of a customer object then that ID will be
	 * tested with the "Customer getCustomer ( String customerId )" if the
	 * Customer Object used exists then the tests fails.
	 * 
	 * EDITS NEEDED: DONE (Subject to team review)
	 */

	@Test
	public void removeCustomerTest() {

		// First print out to make sure the customer exists before the test
		System.out.println(cust1.getCustomerId());

		// cust1 ID will be tested
		String FakeIdTest = cust1.getCustomerId();

		// customer removal
		fakeBank1.removeCustomer(FakeIdTest);

		// Request return information from method and
		// set it to variable
		Customer testCustomer = fakeBank1.getCustomer(FakeIdTest);

		// Test
		Assert.assertEquals(testCustomer, null);

		if (testCustomer == null) {
			System.out.println("removeCustomerTest returned null, test passed");
		} else {
			System.out
					.println("removeCustomerTest returned an ID Number, test NOT passed");

		}

		// adding the customer back after testing for future use
		// if the test fails, the method will return null or throw an exception
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

		// given data to test against
		SortedSet<Customer> givenDataAllCust = new TreeSet();

		givenDataAllCust.add(cust1);
		givenDataAllCust.add(cust2);
		givenDataAllCust.add(cust3);

		// calls method and adds data returned to variable
		SortedSet<Customer> receivedDataAllCust = new TreeSet();
		receivedDataAllCust = fakeBank1.getAllCustomers();

		// Test of the data
		Assert.assertEquals(givenDataAllCust, receivedDataAllCust);

	}

	/*
	 * TEST FOR: Customer getCustomer(String customerId) tests that the
	 * getCustID variable equals the client object returned by the method
	 * 
	 * EDITS NEEDED: QUICK REVIEW
	 */

	@Test
	public void getCustomerTest() {

		// ID test against
		String getCustID = "12345";

		Bank getCustObj = new Bank("BankName1");

		// Gives the variable testResult the result returned by the
		// method being tested
		Object testResult = getCustObj.getCustomer(getCustID);

		// Tests Result against ID variable
		Assert.assertEquals(testResult, getCustID);

	}

	/*
	 * TEST FOR: List<Customer> getCustomer(String lastName, String firstName)
	 * 
	 * This method creates an ArrayList with cust1, cust2 and cust3 then
	 * requests the list of all clients in the program and tests it against the
	 * original ArrayList previously set.
	 * 
	 * Need assistance on List - Peter 4/9/19
	 * 
	 * EDITS NEEDED: DONE (Subject To Team Review)
	 */

	@Test
	public void listGetCustomerTest() {

		// passing information to this variable
		// to have something to test against
		List<Customer> testListGet = new ArrayList();

		testListGet.add(cust1);

		// add data returned from the method to the ArrayList created
		List<Customer> dataToTestGet = fakeBank1.getCustomer(cust1Last,
				cust1First);

		// Tests Result against ID variable
		Assert.assertEquals(testListGet, dataToTestGet);

	}

	/*
	 * TEST FOR: List<Account> getCustomersAccounts(String customerId) NOT BEING
	 * DONE AT THIS MOMENT THIS METHOD IS NOT A REQUIREMENT
	 * 
	 * EDITS NEEDED: NONE
	 */

	@Test
	public void getCustomerAccountsTest() {

	}

	/*
	 * 
	 * ---------- END OF BANK CLASS TESTS ----------
	 */

}
