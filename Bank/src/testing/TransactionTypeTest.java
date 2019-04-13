package testing;

import org.junit.Assert;
import org.junit.Test;

import banking.TransactionType;

public class TransactionTypeTest {

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
