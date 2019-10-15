import java.util.Scanner;
import java.lang.Math;

public class Task1b_PrintMirrorNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int n=0;
		for(int i=1;number>=i;i=i*10) {
			n++;
		}
		for(int q=0;q<n;q++) {
			System.out.print((number/(int)(Math.pow(10, q))%10));
		}
	}
}
