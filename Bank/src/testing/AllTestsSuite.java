/*
 * Group: Fashionably Late
 * -Michael Tarallo
 * -Joshua Ventura
 * -Peter Quach
 * -Andres Cardenas
 * 
 * ------------------------------------------------------------
 * Version 1.0.0-33:
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
 * --Created multiple test classes for clarity (We will make a JUnit Suite later).
 * --Created AllTestsSuite as a final commit
 * 
 * 
 * ------------------------------------------------------------
 * TO-DO:
 * --Test each method below accordingly
 * 
 * ------------------------------------------------------------
 * METHODS TO TEST*(Subject to change. Add or Remove as needed):
 * ------------------------------------------------------------
 * 
 * ---ACCOUNT CLASS---
 * Account.Account(); 								|	Test done by:- Joshua Ventura & Michael Tarallo
 * Account.deposit(); 								|	[Irrelevant Testing]
 * Account.withdrawl(); 							|	[Irrelevant Testing]
 * Account.transfer(); 								|	Test done by:- Joshua Ventura & Michael Tarallo
 * Account.List<Transaction> getTransactions(); 	|	Test done by:- Joshua Ventura & Michael Tarallo
 * Account.Transaction getTransaction(); 			|	Test done by:- Joshua Ventura & Michael Tarallo
 * 
 * 
 * ---BANK CLASS---
 * Bank.getNAME(); 									|	Test done by: - Michael Tarallo
 * Bank.main(); 									|	Test done by: - Joshua Ventura 
 * Bank.getAllAccounts(); 							|	Test done by: Andres Cardenas
 * Bank.addCustomer(); 								|	Test done by: Andres Cardenas
 * Bank.removeCustomer();							|	Test done by: Andres Cardenas
 * Bank.getCustomer(); 								|	Test done by: Andres Cardenas
 * Bank.getAllCustomers(); 							|	Test done by: Andres Cardenas
 * Bank.List<Customer> getCustomer(); 				|	Test done by: Andres Cardenas
 * 
 * ---BANK CLASS OPTIONAL---
 * Bank.getInsufficientFundsPenalty(); 				|	Test done by: - Michael Tarallo
 * 
 * ---CUSTOMER CLASS---
 * Customer.Customer(); 							|	Tests done by: - Peter Quach
 * Customer.ytdFees(); 								|	Test done by: - Michael Tarallo
 * Customer.ytdInterest(); 							|	Test done by: - Michael Tarallo
 * Customer SavingsAccount addSavingsAccount();		|	Test done by: - Peter Quach
 * Customer.removeAccount(); 						|	Test done by: - Peter Quach
 * Customer.Account getAccount(); 					|	Test done by: - Peter Quach
 * 
 * 
 * ---SAVINGS ACCOUNT CLASS---
 * SavingsAccount.SavingsAccount(); 				|	Test done by:- Michael Tarallo and Joshua Ventura
 * SavingsAccount.addInterest(); 					|	Test done by:- Michael Tarallo and Joshua Ventura
 * 
 * 
 * ---TRANSACTION CLASS---
 * Transaction.Transaction(); 						|	Test done by:- Joshua Ventura
 * 
 * ---TRASACTION TYPE CLASS---
 * TransactionType; 								|	Test done by:- Joshua Ventura 
 * 
 *
 * ------------------------------------------------------------
 */

//Comments regarding project at top of class

package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccountTest.class, BankTest.class, CustomerTest.class,
		SavingsAccountTest.class, TransactionTypeTest.class })
public class AllTestsSuite {

}
