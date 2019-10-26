package ThirdTask;

import java.util.Scanner;

public class Task3_BankManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st;
		String[] sar=new String[5];
		do {
			st=sc.nextLine();
			if(st.equals("END")) break;
			sar=st.split("\\s+");
			if(sar[0].equals("OPEN")) {
				Bank.openAccount(sar[3], sar[4], sar[1], sar[2]);
			}else if(sar[0].equals("CLOSE")) {
				Bank.closeAccount(sar[1], sar[2]);
			}else if(sar[0].equals("DEPOSIT")) {
				Bank.deposit(sar[1], Float.parseFloat(sar[2]));
			}else if(sar[0].equals("WITHDRAW")) {
				Bank.withdraw(sar[1],sar[2], Float.parseFloat(sar[3]));
			}else if(sar[0].equals("TRANSFER")) {
				Bank.transfer(sar[1],sar[2], Float.parseFloat(sar[3]),sar[4]);
			}
		}while(true);
		
		Bank.get().entrySet().stream().forEach(a -> {System.out.println(((Account) a).getName()+" "+((Account) a).getGovId()+" "+((Account) a).getBalance());});
		System.out.println(Bank.getAssets());
		
	}

}
