package com.capgemini.xyz.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;
import com.capgemini.xyz.exceptions.InvalidEmailAddressException;
import com.capgemini.xyz.exceptions.InvalidLoanAmountException;
import com.capgemini.xyz.exceptions.InvalidLoanDurationException;
import com.capgemini.xyz.exceptions.InvalidMobileNumberException;

public interface ILoanAmount {
	public Map<Integer,Loan> applyLoan(Loan loan);
	public long applyLoan1(Loan loan);
	public Customer validateCustomer(Customer customer);
	public boolean insertCust(Customer cust);
	public double calculateEMI(double amount,int duration);
	//public Customer getCustomerDetails(int customerId);
	//public Loan getLoanDetails(int loanId);
	List<Customer> getCustomerDetails();
	List<Loan> getLoanDetails();
	public boolean validateLoanDuration(int duration) throws InvalidLoanDurationException;
	public boolean validateLoanAmount(double amount)throws InvalidLoanAmountException;
	public boolean validatePhoneNumber(BigInteger mobile)throws InvalidMobileNumberException;
	public boolean validateEmailAddress(String email) throws InvalidEmailAddressException;
	
}
