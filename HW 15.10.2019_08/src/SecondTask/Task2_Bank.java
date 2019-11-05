package SecondTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class Task2_Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st;
		String[] s=new String[6];
		Map<Integer,Account> accs=new HashMap<>();
		
		Account a;
		do {
			st=sc.nextLine();
			if(st.equals("END")) break;
			s=st.split("\\s+");
			if(s[0].equals("OPEN")){
				a=choose(s[3],s[2],Float.parseFloat(s[4]),s[1],Float.parseFloat(s[5]));
				accs.put(a.sIBAN(),a);
				System.out.println(a.getIBAN());
			//	System.out.println(a.getClass());
			//	System.out.println(a instanceof LoanAccount);
			}else if(s[0].equals("PUT")) {
				accs.get(new Integer(s[1])).deposit( Float.parseFloat(s[2]));
				
			}else if(s[0].equals("GET")) {
				accs.get(new Integer(s[1])).withdraw(accs.get(new Integer(s[1])), Float.parseFloat(s[2]));
				System.out.println(accs.get(new Integer(s[1])).getBalance());
			}else if(s[0].equals("INFO")) {
				accs.get(new Integer(s[1])).calInrest(Integer.parseInt(s[2]));
			}
		}while(true);
	}
	protected static <T> T choose(String s,String typeOfowner,float balance,String name,float montlyInterestRate) {
		if(s.equals("1")) return (T) new DepositAccount(typeOfowner,balance,name,montlyInterestRate);
		else if(s.equals("2 ")) return (T) new LoanAccount(typeOfowner,balance,name,montlyInterestRate);
		else return (T) new MortgageAccount(typeOfowner,balance,name,montlyInterestRate);
		
	}
}
