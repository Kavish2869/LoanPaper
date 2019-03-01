package com.capgemini.xyz.beans;

import java.math.BigInteger;

public class Customer {
	@Override
	public String toString() {
		return "Customer Details are: custId=" + custId + ", custName=" + custName + ", address=" + address + ", mobile=" + mobile
				+ ", email=" + email;
	}

	private int custId;
	private String custName;
	private String address;
	private BigInteger mobile;
	private String email;
	private Loan loan;

	public Customer(){}

	public Customer(String custName, String address, BigInteger mobile, String email, Loan loan) {
		super();
		this.custName = custName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.loan = loan;
	}
	

	/*public Customer(int custId, String custName, String address, long mobile, String email) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}*/

	
	public Customer(int custId, String custName, String address, BigInteger mobile, String email) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getMobile() {
		return mobile;
	}

	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((loan == null) ? 0 : loan.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (loan == null) {
			if (other.loan != null)
				return false;
		} else if (!loan.equals(other.loan))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		return true;
	}

	

}

