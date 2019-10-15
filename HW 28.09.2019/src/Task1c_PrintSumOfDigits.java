import java.util.Scanner;
import java.lang.Math;
public class Task1c_PrintSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int n=0;
		for(int i=1;number>=i;i=i*10) {
			n++;
		}
		int sumdigits=0;
		for(int q=0;q<n;q++) {
			sumdigits+=(number/(int)(Math.pow(10, q))%10);
		}
		System.out.println(sumdigits);
	}
}
