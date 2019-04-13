package testing;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import banking.Account;
import banking.Customer;
import banking.Transaction;

public class AccountTest extends Account {

	static String accDesc;
	static double initBal;
	static Customer cust;

	public AccountTest() {
		super(cust, initBal, accDesc);

	}

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

		// Given variables
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
		AccountTest customerId = new AccountTest();
		AccountTest accountId = new AccountTest();
		AccountTest localDT = new AccountTest();
		AccountTest currentBalance = new AccountTest();
		AccountTest acc = new AccountTest();

		// Testing

		Assert.assertTrue(customerId.getCustomerId().equals(customerID));

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

		AccountTest theDeposit = new AccountTest();
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

		// Given
		String accountOUT = "420";
		String accountIN = "123";
		double currentBalance = 0.00;
		double transferredAmount = 10.00;

		// Creating objects
		AccountTest accOUT = new AccountTest();
		AccountTest accIN = new AccountTest();

		AccountTest balSet = new AccountTest();
		balSet.balance = currentBalance;

		// Starting balance of accIN and accOUT
		Assert.assertTrue(accIN.balance == (currentBalance));
		transferredAmount = accOUT.balance;
		Assert.assertTrue(accOUT.getBalance() == (transferredAmount));

		// Tests that balances changed from transfer
		Assert.assertTrue(accIN.balance == (transferredAmount));
		Assert.assertTrue(accOUT.balance == (currentBalance));

		// Tests that accounts exist in list
		Assert.assertTrue(accOUT.customer.getCustomerAccounts().equals(
				accountOUT));
		Assert.assertTrue(accIN.customer.getCustomerAccounts()
				.equals(accountIN));

	}

	/*
	 * List<Transaction> getTransactions test to see if the list contains any
	 * transaction test to see if items are added to the list
	 */
	@Test
	public void getTransactionsTest() {

		List<Transaction> transactionList = new ArrayList<>();

		AccountTest addTransaction = new AccountTest();

		Assert.assertTrue(addTransaction.getTransactions().equals(
				transactionList));

	}

	/*
	 * Transaction getTransaction (int transactionId) check to see if
	 * transaction exists
	 */

	@Test
	public void getTransaction() {
		int transactionID = 1;

		AccountTest transactionId = new AccountTest();

		System.out.println(transactionID);

		Assert.assertTrue(transactionId.getTransaction(transactionID).equals(
				transactionID));
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
