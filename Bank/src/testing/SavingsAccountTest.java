package testing;

import org.junit.Assert;
import org.junit.Test;

import banking.Account;
import banking.Customer;

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

        //Creating Objects
        SavingsAccountTest customer = new SavingsAccountTest();

        //Test that Savings Account was created
        Assert.assertTrue(customer.getCustomerId().equals(customerInfo1));

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