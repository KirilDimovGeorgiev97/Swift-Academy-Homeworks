import java.util.Scanner;

public class Task1d_PrintMatrix {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int [][] Matrix=new int [n][n];
		int currentvalue=1;
		int row=0;
		int col=0;
		
		
		int RowLR=1;
		int ColUD=0;
		int RowRL=0;
		int ColDU=0;
		
		for(int i=0;i<n+n-1;i++) {
		//	System.out.println(currentvalue +" " + i + " " +row+" "+RowRL);
			
			
			if(i==0) {
				for(int j=col;j<n;j++) {
					Matrix[row][j]=currentvalue;
					currentvalue++;
					if(j+1==n)col=j;
			//		System.out.println("Col is "+ col);
				}
				continue;	//break;
			}
			
			if(i%2==0 && row==0+RowLR) {
				for(int j=col+1;j<n-RowLR;j++) {
					Matrix[row][j]=currentvalue;
					currentvalue++;
					if(j==n-1-RowLR) {
						col=j;
						RowLR++;
						break;
					}
				//	System.out.println("Col is "+ col);
				}
				continue;
			}
			
			
			if(i%2==1&&col==n-1-ColUD) {
	//			System.out.println("Vutre sum v ColUD");
				for(int j=row+1;j<n-ColUD;j++) {
					Matrix[j][col]=currentvalue;
					currentvalue++;
					if(j==n-1-ColUD) {
						ColUD++;
						row=j;
						break;
					}
				}
			continue;
			}
			
			if(i%2==0&&row==n-1-RowRL) {
		//		System.out.println("Vutre sum v RowRL");
				for(int j=col-1;j>=0+RowRL;j--) {
					Matrix[row][j]=currentvalue;
				//	System.out.println("RowRL "+currentvalue);
					currentvalue++;
					if(j==0+RowRL) {
		//				System.out.println("Vutre sum v RowRL");
						col=j;
						RowRL++;
						break;
					}
				}
			continue;
			}
			if(i%2==1&&col==0+ColDU) {
				for(int j=row-1;j>0+ColDU;j--) {
					Matrix[j][col]=currentvalue;
					currentvalue++;
					if(j==1+0+ColDU) {
						ColDU++;
						row=j;
						break;
					}
				}
			}
		continue;
		}
		if(n%2==0)
		Matrix[n/2][(n/2)-1]=(int)(Math.pow((double)(n),2.0));
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(Matrix[i][j]+" ");
			}
		System.out.println();
		}
	}
}
