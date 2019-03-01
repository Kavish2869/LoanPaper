package com.capgemini.xyz.util;

import java.util.HashMap;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.beans.Loan;

public class LoanDBUtil {
	public static int LOAN_ID= (int) (Math.random()*1000);

	public static int getLOAN_ID() {
		return LOAN_ID;
	}
public static HashMap<Integer, Loan> loanDetails= new HashMap<>();

public HashMap<Integer, Loan> getLoanDetails() {
	return loanDetails;
}


}
