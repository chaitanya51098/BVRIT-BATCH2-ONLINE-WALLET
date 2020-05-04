package com.capg.onlinewallet.entities;

public class TransferBean {
	 private int customerId1;
	 private int customerId2;
	 private int accountBalance;
	 private int amount;
	 public int getCustomerId1() {
		return customerId1;
	}
	public void setCustomerId1(int customerId1) {
		this.customerId1 = customerId1;
	}
	public int getCustomerId2() {
		return customerId2;
	}
	public void setCustomerId2(int customerId2) {
		this.customerId2 = customerId2;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
