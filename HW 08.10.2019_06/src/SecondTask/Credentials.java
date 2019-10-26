package SecondTask;

import java.util.*;

public class Credentials {

	
	private String username; //You cannot resize an array in java.Once the size of array is declared, it remains fixed.
	private ArrayList<String> password = new ArrayList<String>();
	
	private Credentials(String username,String password) {
		this.username=username;
		this.password.add(password);
	}
	
	public static Credentials makenewcredentials(String username,String password) { 
		return new Credentials(username,password);
	}
	
	protected boolean setnewpass(String oldpass,String newpass) {
		if(this.password.contains(oldpass)) {
			password.add(newpass);
			return true;
		}
		return false;
	}
	
	protected String getpass() {
		return password.get((int)((password.size()-1)));
	}
	
	public String getusername() {
		return this.username;
	}
	
	public boolean authpass(String password) {
		if(this.getpass().equals(password)) return true;
		return false;
	}
	
	
	
	
}
