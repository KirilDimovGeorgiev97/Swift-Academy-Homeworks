import java.util.Arrays;
import java.util.Scanner;

public class Task2c_PrintClusterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=new String();
		st=sc.nextLine();
		st=sc.nextLine();
		sc.close();
		String[] number=st.split("\\s+");
		int[] number2=new int [number.length];	
		int currentvalue;
		int numberofclusters=0;
		boolean toadd=false;
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
		}
		currentvalue=number2[0];
		for(int j=0;j<number2.length;j++) {
			if(j==number2.length-1) break;
			if(currentvalue==number2[j+1] && toadd==false) {
				toadd=true;
				numberofclusters++;
				continue;
			}else if(currentvalue==number2[j+1]&&toadd==true) {
				continue;
			}else {
				currentvalue=number2[j+1];
				toadd=false;
			}
		}
		System.out.println(numberofclusters);
	}
}
