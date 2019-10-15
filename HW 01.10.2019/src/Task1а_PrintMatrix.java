import java.util.Scanner;
import java.lang.Math;

public class Task1à_PrintMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int [][] Matrix=new int [n][n];
		int maxnumber=(int)(Math.pow((double)(n), 2));
		int currentvalue=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				Matrix[j][i]=currentvalue;
				currentvalue++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(Matrix[i][j]+" ");
			}
		System.out.println();
		}
	}
}
