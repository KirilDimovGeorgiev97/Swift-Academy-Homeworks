import java.util.Scanner;

public class Task1a_PrintFirstDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int a=1;
		for(int b = 1;(number>=b);b=b*10) {
			a=b;
		}
		//a=a/10;
		System.out.println(a);
		System.out.println(number/a);
		
	}
}
