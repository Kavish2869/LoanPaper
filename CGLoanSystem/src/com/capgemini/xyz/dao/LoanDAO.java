package com.capgemini.xyz.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;
import com.capgemini.xyz.util.CustomerDBUtil;
import com.capgemini.xyz.util.LoanDBUtil;

public class LoanDAO implements ILoanDAO{

	@Override
	public Map<Integer, Customer> customerEntry(Customer cust) {
		cust.setCustId(CustomerDBUtil.getCUSTOMER_ID());
		CustomerDBUtil.customer.put(cust.getCustId(), cust);
		return CustomerDBUtil.customer ;
	}

	@Override
	public Map<Integer, Loan> loanEntry(Loan loan) {
		loan.setLoanId(LoanDBUtil.getLOAN_ID());
		//loan.setCustId(CustomerDBUtil.getCUSTOMER_ID());
		LoanDBUtil.loanDetails.put(loan.getLoanId(),loan);
		return LoanDBUtil.loanDetails;
	}

	@Override
	public List<Customer> findAllCustomer() {
		return new ArrayList<>( CustomerDBUtil.customer.values());
	}

	@Override
	public List<Loan> findAllLoan() {
		return new ArrayList<>(LoanDBUtil.loanDetails.values());
	}

}


