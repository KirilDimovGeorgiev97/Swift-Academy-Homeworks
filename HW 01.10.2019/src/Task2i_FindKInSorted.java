import java.util.Scanner;

public class Task2i_FindKInSorted {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String st=new String();
		st=sc.nextLine();
		st=sc.nextLine();
		sc.close();
		String[] number=st.split("\\s+");
		int[] number2=new int [number.length];	
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
			if(number2[i]==k) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("No");
	}
}
