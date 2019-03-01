package com.capgemini.xyz.util;

import java.util.HashMap;

import com.capgemini.xyz.beans.Customer;

public class CustomerDBUtil {
	public static int CUSTOMER_ID=(int) (Math.random()*1000);

	public static int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public static HashMap<Integer,Customer> customer = new HashMap<Integer,Customer>();

	public static HashMap<Integer, Customer> getCust() {
		return customer;
	}
	
}


