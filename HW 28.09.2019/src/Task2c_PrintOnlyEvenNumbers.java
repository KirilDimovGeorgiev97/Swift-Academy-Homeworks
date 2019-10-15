import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);;
		String st= new String();
		st=sc.nextLine();
		String[] numbers=st.split("\\s+");
		int n=sc.nextInt();
		int currentnumber=0;
		for(int i=0;i<n;i++)
		{
			if(n>numbers.length && i+1==numbers.length) {
				break;
			}
			currentnumber=Integer.parseInt(numbers[i]);
			if(currentnumber%2==0) {
				System.out.print(currentnumber+" ");
			}
		}
	}
}
