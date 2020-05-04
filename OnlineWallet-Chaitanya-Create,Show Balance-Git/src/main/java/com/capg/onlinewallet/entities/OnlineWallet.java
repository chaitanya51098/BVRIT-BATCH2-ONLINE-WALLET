package com.capg.onlinewallet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Onlinewallet_Spring")
public class OnlineWallet {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerId;

	
	//@NotNull(message = "Customer Password is Mandatory field. Please provide customer Password")
	private String customerPassword;

	//@NotNull(message = "Please provide account name")
	//@Size(min=2, max=10,message= "Length of the Name must be in between 2-10 letters")
	private String customerName;

	//@NotNull(message = "Account Balance should not be null") 
	private int accountBalance;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

}
