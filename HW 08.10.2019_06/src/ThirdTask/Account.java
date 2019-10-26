package ThirdTask;

import SecondTask.Credentials;
import SecondTask.Task2_CredentialsManager;

public class Account {

	private String name;
	private String govId;
	private float balance;
	private Credentials cr;
	
	
	protected Account(String name,String govId,String username,String password) {
		this.name=name;
		this.govId=govId;
		this.balance=0;
		this.cr= Credentials.makenewcredentials(username,password);
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected String getGovId() {
		return this.govId;
	}
	
	protected float getBalance() {
		return this.balance;
	}
	
	protected void withdraw(float amount) {
		this.balance-=amount;
	}
	
	protected void deposit(float amount) {
		this.balance+=amount;
	}
	
	protected Credentials getCredentials() {
		return this.cr;
	}
	
	
}
