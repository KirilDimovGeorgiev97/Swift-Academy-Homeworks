import java.util.Scanner;

public class Task2f_LargestSumOfKSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		String st=new String();
		st=sc.nextLine();
		st=sc.nextLine();
		sc.close();
		
		String[] number=st.split("\\s+");
		int[] number2=new int [number.length];	
		int position=0;
		int maxsum=0;
		int currentsum=0;
		
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
		}
		
		for(int i=0;i<number2.length;i++) {
			if(i+k>number2.length) break;
			for(int j=i;j<i+k;j++) {
				currentsum+=number2[j];
				//if(j+1==number2.length) break;
			}
			if(currentsum>maxsum) {
				maxsum=currentsum;
				currentsum=0;
				position=i;
			}else {
				currentsum=0;
				continue;
			}
		}
		
		for(int i=position;i<position+k;i++) {
			System.out.print(number2[i]+" ");
			
		}
	}
}
