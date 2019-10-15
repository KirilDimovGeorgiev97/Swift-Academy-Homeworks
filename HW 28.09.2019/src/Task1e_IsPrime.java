import java.util.Scanner;
import java.lang.Math;

public class Task1e_IsPrime {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean prime=true;
		for(int i=1;i<=Math.pow(number, 0.5);i++) {
			if(number%i==0 && i!=1) {
				prime=false;
				System.out.print(prime);
				return;
			}
		}
		System.out.println(prime);
	}
}
