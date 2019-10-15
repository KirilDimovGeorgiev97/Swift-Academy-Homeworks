import java.util.Scanner;
import java.lang.String;

public class Task2a_PrintSumOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);;
		String st= new String();
		int n=sc.nextInt();
		sc.nextLine();
		st=sc.nextLine();
		String[] numbers=st.split("\\s+");
	
		int sum=0;
		int currentnumber=0;
		for(int i=0;i<n;i++)
		{
			if(n>numbers.length && i+1==numbers.length) {
				break;
			}
			currentnumber=Integer.parseInt(numbers[i]);
			sum+=currentnumber;
		}
		System.out.println(sum);
	}
}
