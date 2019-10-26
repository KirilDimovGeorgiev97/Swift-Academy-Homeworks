package SecondTask;

import java.util.*;

public class Task2_CredentialsManager {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st;
		String[] s=new String[4];
		ArrayList<Credentials> c = new ArrayList<Credentials>();
		Credentials q=null;
		ArrayList<String> result1=new ArrayList<String>();
		String currentresult;
		do {
			st=sc.nextLine();
			s=st.split("\\s+");
			if(st.equals("END")) break;
			if(s[0].equals("ENROLL")) {
				if(contains(c,s[1],0)) continue;
				c.add(Credentials.makenewcredentials(s[1],s[2]));
				currentresult="ENROLL success";
				result1.add(currentresult);
					
			}else if(s[0].equals("CHPASS")) {
				
				if(c.get(get(c,s[1],0)).setnewpass(s[2],s[3])) {
					currentresult="CHPASS success";
					result1.add(currentresult);
				}else {
					currentresult="CHPASS fails";
					result1.add(currentresult);
				}
				
			}else if(s[0].equals("AUTH")) {
				if(c.get(get(c,s[1],0)).authpass(s[2])) {
					currentresult="AUTH success";
					result1.add(currentresult);
				}else {
					currentresult="AUTH fails";
					result1.add(currentresult);
				}
			}
		}while(true);
		result1.forEach(System.out::println);
	}
	
	protected static boolean contains(ArrayList<Credentials> c,String q,int n) {
		if(n==c.size()) return false;
		if(q.equals(c.get(n).getusername())) return true;
		else return contains(c,q,n+1);

	}
	
	protected static int get(ArrayList<Credentials> c,String q,int n) {
		if(n==c.size()) return -1;
		if(q.equals(c.get(n).getusername())) return n;
		else return get(c,q,n+1);
	}

}
