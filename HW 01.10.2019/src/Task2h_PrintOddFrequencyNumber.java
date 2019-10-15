import java.util.Arrays;
import java.util.Scanner;

public class Task2h_PrintOddFrequencyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=new String();
		st=sc.nextLine();
		st=sc.nextLine();
		sc.close();
		String[] number=st.split("\\s+");
		int counter=0;
		int[] number2=new int [number.length];	
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
		}
		
		Arrays.sort(number2);
		
		for(int j=0;j<number2.length;j++) {
			if(j+1==number2.length) {
				counter++;
				if(counter%2==1) {
					System.out.println(number2[j]);
					return;
				}else break;
			}
			if(number2[j]==number2[j+1]) {
				counter++;
				continue;
			}else {
				counter++;
				if(counter%2==1) {
					System.out.println(number2[j]);
					return;
				}
			}
		}
		System.out.println("Number of all elements is even");
	}
}
