/*
 * Group: Fashionably Late
 * ------------------------------------------------------------
 * Version 1.0.0-25:
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
 * 
 * 
 * ------------------------------------------------------------
 * TO-DO:
 * --Create a dataset (Map?) with testable data to use when testing methods of the banking package
 * --Test each method below accordingly
 * 
 * ------------------------------------------------------------
 * METHODS TO TEST*(Subject to change. Add or Remove as needed):
 * ------------------------------------------------------------
 * 
 * ---ACCOUNT CLASS---
 * Account.Account(); Test done by:- Joshua Ventura & Michael Tarallo
 * Account.deposit(); Untestable? no body, abstract
 * Account.withdrawl(); Untestable? no body, abstract
 * Account.transfer(); Test done by:- Joshua Ventura & Michael Tarallo
 * Account.List<Transaction> getTransactions(); Test done by:- Joshua Ventura & Michael Tarallo
 * Account.Transaction getTransaction(); Test done by:- Joshua Ventura & Michael Tarallo
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
 * Bank.getAllCustomers(); Test done by: Andres Cardenas
 * Bank.List<Customer> getCustomer();
 * 
 * ---BANK CLASS OPTIONAL---
 * Bank.getInsufficientFundsPenalty(); Test done by: - Michael Tarallo
 * Bank.setInsufficientFundsPenalty();
 * 
 * ---CUSTOMER CLASS---
 * Customer.Customer();
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
 * TransactionType; Test done by:- Joshua Ventura 
 * 
 *
 * ------------------------------------------------------------
 * 
 * As on 4/9/2019
 * Andres is finishing what is left of Bank class and Transaction class
 * 
 * Josh is taking SavingsAccount and working on methods in Account and Customer
 * 
 * Mike is taking Account
 * 
 * Peter is taking Customer
 */

package testing;

import java.io.ByteArrayInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.*;

import banking.*;

//Comments regarding project at top of class



