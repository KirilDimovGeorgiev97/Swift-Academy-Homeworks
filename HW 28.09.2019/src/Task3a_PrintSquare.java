import java.util.Scanner;

public class Task3a_PrintSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int q=0;q<n;q++) {
				if(i==0||i==n-1) {
					System.out.print("*"+" ");
				}else {
					if(q==0 || q==n-1) {
						System.out.print("* "); 
					}else {
						System.out.print("  ");
					}
					
				}
			}
			System.out.println();
		}
	}
}
