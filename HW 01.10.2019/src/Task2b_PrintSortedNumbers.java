
import java.util.*;

public class Task2b_PrintSortedNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=new String();
		st=sc.nextLine();
		st=sc.nextLine();
		sc.close();
		String[] number=st.split("\\s+");
		int[] number2=new int [number.length];	
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
		}
		Arrays.sort(number2);
		for(int j=0;j<number2.length;j++) {
			System.out.print(number2[j]+" ");
		}
	}
}
