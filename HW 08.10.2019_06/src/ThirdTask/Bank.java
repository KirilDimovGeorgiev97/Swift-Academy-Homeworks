package ThirdTask;

import SecondTask.*;
import java.util.*;

public class Bank {
	/*void openAccount(name, govId, username, password)
void closeAccount(username, password)
void deposit(username, amount)*/
	
	protected static Map<String,Account> accs=new HashMap<>();
	private static float assets=0;
	
	protected static Map<String,Account> get(){
		return accs;
	}
	
	protected static void openAccount(String name,String govId,String username,String password) {
		Account ac=new Account(name,govId,username,password);
		accs.put(ac.getCredentials().getusername(),ac);
		System.out.println("Open success");
	}
	
	protected static void closeAccount(String username,String password) {
		if(accs.containsKey(username) && accs.get(username).getCredentials().authpass(password)) {
			System.out.println("Close success");
		}else
		System.out.println("Close fail");
	}
	
	protected static void deposit(String username,float amount) {
		if(amount>0) {
			accs.get(username).deposit(amount);
			System.out.println("Deposit success");
			assets+=amount;
		}else System.out.println("Deposit fails");
	}
	
	protected static void withdraw(String username,String password,float amount) {
		if(amount>0 && amount<=accs.get(username).getBalance() && accs.get(username).getCredentials().authpass(password)) {
			accs.get(username).withdraw(amount);
			System.out.println("Withdraw success");
			assets-=amount;
		}else System.out.println("Withdraw fails");
	}
	
	protected static void transfer(String username, String password,float amount,String recipient) {
		if(amount>0 && amount<=accs.get(username).getBalance() && accs.get(username).getCredentials().authpass(password)) {
			accs.get(username).withdraw(amount);
			accs.get(recipient).deposit(amount);
			System.out.println("Transfer success");
		}else System.out.println("Transfer fails");
	}
	
	protected static float getAssets() {
		return assets;
	}
}
