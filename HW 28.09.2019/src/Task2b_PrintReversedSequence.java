import java.util.Scanner;

public class Task2b_PrintReversedSequence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);;
		String st= new String();
		st=sc.nextLine();
		String[] numbers=st.split("\\s+");
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.print(numbers[i]+" ");;
		}
	}
	
}
