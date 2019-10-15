import java.util.Scanner;

public class Task3c_PrintChristmasTree {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i+1);k++) {
				if(i==n-1 && k==n/2)
				{
					System.out.print("*");
					break;
				}else {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
