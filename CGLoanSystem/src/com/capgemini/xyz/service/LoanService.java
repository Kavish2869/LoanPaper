package com.capgemini.xyz.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;
import com.capgemini.xyz.dao.ILoanDAO;
import com.capgemini.xyz.dao.LoanDAO;
import com.capgemini.xyz.exceptions.InvalidEmailAddressException;
import com.capgemini.xyz.exceptions.InvalidLoanAmountException;
import com.capgemini.xyz.exceptions.InvalidLoanDurationException;
import com.capgemini.xyz.exceptions.InvalidMobileNumberException;

public class LoanService implements ILoanAmount {
	ILoanDAO loanAmount = new LoanDAO();
	@Override
	public Map<Integer, Loan> applyLoan(Loan loan) {
		return  loanAmount.loanEntry(loan);
		/*loan.setCustId(CustomerDBUtil.getCUSTOMER_ID());
		loan.setLoanId(LoanDBUtil.getLOAN_ID());
		LoanDBUtil.loanDetails.put(loan.getLoanId(), loan);
		return loan;*/
	}

	@Override
	public Customer validateCustomer(Customer customer) {

		return null;
	}

	@Override
	public boolean insertCust(Customer cust) {
		loanAmount.customerEntry(cust);
		return true;
	}

	@Override
	public double calculateEMI(double amount, int duration) {
		//int months = duration*12;
		double emi =amount*((0.095)*(1+0.095)*duration)/((1+0.095)*duration-1);
		return emi;
	}

    @Override
	public List<Loan> getLoanDetails() {
		return  loanAmount.findAllLoan();
	}

    @Override
	public List<Customer> getCustomerDetails() {
		return loanAmount.findAllCustomer();
	}

	@Override
	public boolean validateLoanDuration(int duration) throws InvalidLoanDurationException{
		if(duration>0)
			return true;
		else{
			throw new InvalidLoanDurationException("Enter valid loan duration");
		}
	}

	@Override
	public boolean validateLoanAmount(double amount)throws InvalidLoanAmountException {
		if(amount>0){
			return true;
		}
		else
		{
			throw new InvalidLoanAmountException("Enter valid loan amount");
		}
	}

	@Override
	public boolean validatePhoneNumber(BigInteger mobile) throws InvalidMobileNumberException {
		String number = mobile+"";
		String arr[]=number.split("");
		if(arr.length==10){
			return true;
		}
		else
		{
			throw new InvalidMobileNumberException("Enter valid mobile number");
		}
	}

	@Override
	public boolean validateEmailAddress(String email) throws InvalidEmailAddressException{
		if(email.contains("@")&& email.contains(".com")){
		return true;
		}
		else
		{
			throw new InvalidEmailAddressException("Enter valid eamil address");
		}
	}

	@Override
	public long applyLoan1(Loan loan) {
		// TODO Auto-generated method stub
		return 0;
	}

}
