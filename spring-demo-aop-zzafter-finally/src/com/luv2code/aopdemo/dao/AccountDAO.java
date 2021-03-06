package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	// add new method: findAccounts()
	
	public List<Account> findAccounts(boolean tripWire) {
		
		if(tripWire) {
			throw new RuntimeException("No soup for you!");
		}
		
		List<Account> myAccounts = new ArrayList<>();
		
		// create sample accounts
		Account temp1 = new Account("John", "Silver");
		Account temp2 = new Account("Madhu", "Platinum");
		Account temp3 = new Account("Lucca", "Gold");
		
		// add them to our accounts list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
	

	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass() + ": Doing my DB work: Adding an account");
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ": Dowork()");
		
		return false;
	}

	public String getName() {
		System.out.println(getClass() + ": inside getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": inside setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": inside getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": inside setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
	
}
