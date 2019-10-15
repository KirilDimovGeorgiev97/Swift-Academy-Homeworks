import java.lang.Object;
import java.util.Scanner;
import java.lang.Math;

public class Òask1b_PrintMatrix {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int [][] Matrix=new int [n][n];
		int currentvalue=1;
		for(int i=0;i<n;i++) {
			if(i==1) {
				for(int j=n-1;j>=0;j--) {
					Matrix[j][i]=currentvalue;
					//System.out.println(j + " " + i + "   " + currentvalue);
					currentvalue++;	
				}
			}else if(i%2==0) {

				for(int j=0;j<n;j++) {
					Matrix[j][i]=currentvalue;
					currentvalue++;
				}
			}else if(i%2!=0){
				for(int j=n-1;j>=0;j--) {
					Matrix[j][i]=currentvalue;
					//System.out.println(j + " " + i + "   " + currentvalue);
					currentvalue++;	
				}
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
