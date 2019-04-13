package testing;

import org.junit.Assert;

import banking.Transaction;

public class TransactionTest {

	/*
	 * Transaction(TransactionType type, double amount, String description) test
	 * what type of transaction (withdrawal, transfer, deposit) test how much
	 * the transaction is worth test there is a description of the transaction
	 * (was it a check, who did the transaction... ect)
	 * 
	 * 
	 * 
	 * this.id = 1; this.type = null; this.amount = 0.00; this.description = "";
	 * this.timestamp = LocalDateTime.now();
	 */

	public void transactionTypeTest() {

		// test transaction types
		String deposit = "DepositType";
		String withdrawal = "WithdrawalType";
		String transfer = "TransferType";
		String typeList = deposit + withdrawal + transfer;
		// test id
		int id = 1;
		// test amount of transaction
		double transactionAmount = 10;
		// test description
		String description = "Transaction One";

		Transaction transactionType = new Transaction(null, 0, null);

		// consolidated test types into one test
		Assert.assertTrue(transactionType.getType().equals(typeList));
		// test transaction 1d
		Assert.assertTrue(transactionType.getId() == (id));
		// test amount
		Assert.assertTrue(transactionType.getAmount() == (transactionAmount));
		// test description of transaction
		Assert.assertTrue(transactionType.getDescription().equals(description));

	}

}
