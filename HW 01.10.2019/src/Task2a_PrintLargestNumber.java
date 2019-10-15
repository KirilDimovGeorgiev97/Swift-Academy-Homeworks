import java.util.*;

public class Task2a_PrintLargestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=new String();
		st=sc.nextLine();
		st=sc.nextLine();
		String[] number=st.split("\\s+");
		int max=0;
		int[] number2=new int [number.length];	
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
		}
		for(int j=0;j<number2.length;j++) {
			if(number2[j]>=max) {
				max=number2[j];
			}
		}
		System.out.println(max);
	}
}
