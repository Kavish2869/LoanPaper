package com.capgemini.xyz.beans;


public class Loan {
	private int loanId;
	private double loanAmount;
	private int custId;
	private int duration;
	

	public Loan(){}

	public Loan(int loanId, double loanAmount, int custId, int duration) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration;
	}

	/*public Loan(int loanId, double loanAmount, int custId, int duration) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration;

	}*/

	public Loan(double loanAmount, int duration) {
		this.loanAmount=loanAmount;
		this.duration=duration;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}









	@Override
	public String toString() {
		return "Loan Details are: loanId=" + loanId + ", loanAmount=" + loanAmount + ", custId=" + custId + ", duration=" + duration
				;
	}

}
