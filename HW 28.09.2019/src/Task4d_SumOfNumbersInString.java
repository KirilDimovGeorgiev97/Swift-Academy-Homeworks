import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=new String();
		st=sc.nextLine();
		sc.close();
		String[] words =st.split("\\s+");;
		String[] numbers= {"0","1","2","3","4","5","6","7","8","9"};
		int sum=0;
		int currentvalue;
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(words[i].contains(numbers[j])==true) {
					currentvalue=Integer.parseInt(words[i]);
					sum+=currentvalue;
				}
			}
		}
		System.out.println(sum);
	}
}
