package com.capgemini.xyz.dao;

import java.util.List;
import java.util.Map;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;

public interface ILoanDAO {
Map<Integer,Customer>customerEntry(Customer cust);
Map<Integer,Loan> loanEntry(Loan loan);
List<Customer> findAllCustomer();
List<Loan> findAllLoan();


}
