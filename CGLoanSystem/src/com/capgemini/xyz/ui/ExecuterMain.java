
package com.capgemini.xyz.ui;

import java.math.BigInteger;
import java.util.Scanner;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;
import com.capgemini.xyz.dao.ILoanDAO;
import com.capgemini.xyz.dao.LoanDAO;
import com.capgemini.xyz.exceptions.InvalidEmailAddressException;
import com.capgemini.xyz.exceptions.InvalidLoanAmountException;
import com.capgemini.xyz.exceptions.InvalidLoanDurationException;
import com.capgemini.xyz.exceptions.InvalidMobileNumberException;
import com.capgemini.xyz.service.ILoanAmount;
import com.capgemini.xyz.service.LoanService;
import com.capgemini.xyz.util.CustomerDBUtil;
import com.capgemini.xyz.util.LoanDBUtil;

public class ExecuterMain {
	
	public static void main(String[] args) throws InvalidMobileNumberException, InvalidLoanDurationException, InvalidLoanAmountException, InvalidEmailAddressException {
		int custId=0;
		String custName="";
		String address="";
		BigInteger mobile;
		String email="";
		Loan loan=null;
		ILoanAmount loanService = new LoanService();
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		custName=sc.next();
		System.out.println("Enter Address");
		address= sc.next();
		System.out.println("Enter Email");
		email=sc.next();
		loanService.validateEmailAddress(email);
		System.out.println("Enter Mobile Number");
		mobile=sc.nextBigInteger();
		loanService.validatePhoneNumber(mobile);
		Customer custDetails= new Customer(custName, address, mobile, email, loan);
		loanService.insertCust(custDetails);
		System.out.println("Customer information saved successfully");
		System.out.println("Your customer Id is "+ CustomerDBUtil.getCUSTOMER_ID());
		System.out.println("Do you wish to apply for loan?");
		String answer=sc.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter the loan amount");
			double amount=sc.nextFloat();
			loanService.validateLoanAmount(amount);
			System.out.println("Enter the loan duration in years");
			int duration = sc.nextInt();
			loanService.validateLoanDuration(duration);
			Loan loanDet = new Loan(amount,duration);
			loanService.applyLoan(loanDet);
			System.out.println("For loan amount"+amount+"and"+duration+"Years duration");
			System.out.println("Your EMI per month will be "+loanService.calculateEMI(amount, duration));
			System.out.println("Do you want to apply for loan now?");
			String loanAnswer = sc.next();
			if(loanAnswer.equalsIgnoreCase("yes"))
			{
				System.out.println("Your Loan request is generated");
				System.out.println("Your Loan ID is "+LoanDBUtil.LOAN_ID);
			}
		
		else
		{
			System.out.println("Thank you!!!!!!!");
		}
		System.out.println(loanService.getCustomerDetails());
		System.out.println(loanService.getLoanDetails());
	}
	else
	{
		System.out.println("Thank you!!!!!!");
		
	}
	}catch(InvalidEmailAddressException|InvalidLoanAmountException|InvalidMobileNumberException|InvalidLoanDurationException e){
		e.printStackTrace();
	}
}
}