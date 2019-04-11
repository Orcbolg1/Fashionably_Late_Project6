package testing;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import banking.Account;
import banking.Customer;


public class AccountTest extends Account {

		static String accDesc;
		static double initBal;
		static Customer cust;

		public AccountTest() {
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
			AccountTest customerId = new AccountTest();
			AccountTest accountId = new AccountTest();
			AccountTest localDT = new AccountTest();
			AccountTest currentBalance = new AccountTest();
			AccountTest acc = new AccountTest();

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
			AccountTest accOUT = new AccountTest();
			AccountTest accIN = new AccountTest();
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


