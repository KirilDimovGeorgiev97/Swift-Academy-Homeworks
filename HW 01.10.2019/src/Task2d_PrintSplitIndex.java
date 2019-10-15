import java.util.Scanner;

public class Task2d_PrintSplitIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=new String();
		st=sc.nextLine();
		st=sc.nextLine();
		sc.close();
		String[] number=st.split("\\s+");
		int[] number2=new int [number.length];	
		int position=0;
		int sum=0;
		int sum2=0;
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
			sum2=sum2+number2[i];
		}
		
		for(int j=0;j<number2.length;j++) {
			sum+=number2[j];
			sum2-=number2[j];
			if(sum==sum2) {
				position=j;
				break;
				
			}
		}
		
		if(position==0) System.out.println("No");
		else System.out.println(position);
	}
}
