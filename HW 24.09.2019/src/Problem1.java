import java.util.*;

public class Problem1 {
	
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
;		char s;
		do {
			s=sc.next().charAt(0);
			System.out.println(s=='m');
			System.out.println(s!='f' || s!='m');
		}while(s!='f' && s!='m');
		
		System.out.println(s);
	}
}
