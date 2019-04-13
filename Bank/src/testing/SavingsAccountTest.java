package testing;

import org.junit.Assert;
import org.junit.Test;

import banking.Account;
import banking.Customer;
import banking.SavingsAccount;

public class SavingsAccountTest extends Account {

	static String accDesc;
	static double initBal;
	static Customer cust;

	public SavingsAccountTest() {
		super(cust, initBal, accDesc);

	}

	@Test
	public void savingsAccountTest() {
		String customerID = "CustID-420";
		double currentBal = 0.00;
		String newDescription = "New Account Description";
		String balToString;

		String custStrings = (customerID + newDescription);
		balToString = Double.toString(currentBal);

		String customerInfo1 = (custStrings + balToString);

		System.out.println(customerID + " | " + "Balance: " + currentBal);
		System.out.println(newDescription);

		// Creating Objects
		SavingsAccountTest customer = new SavingsAccountTest();
		SavingsAccountTest currentBalance = new SavingsAccountTest();
		SavingsAccountTest acc = new SavingsAccountTest();

		// Test that Savings Account was created
		Assert.assertTrue(customer.getCustomerId().equals(customerInfo1));
		Assert.assertTrue(currentBalance.getBalance() == (currentBal));
		Assert.assertTrue(acc.getAccountDescription().equals(newDescription));

	}

	public void addInterestTransactionTest() {

		// interest rate
		double rate = 2.0;
		// current balance(not needed, but good for clarity)
		double balance = 100.50;

		double balanceAfterInterest = 201.00;

		SavingsAccount interestTransaction = new SavingsAccount(customer, rate,
				accountId);

		double currentBalance = interestTransaction.getBalance();

		// test that rate equals default interest rate
		Assert.assertTrue(SavingsAccount.getDefaultInterestRate() == (rate));

		// tests that new balance after interest has been applied equals new
		// current balance.
		Assert.assertTrue(balanceAfterInterest == currentBalance);

	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

	}
}