import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {

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
		int numberofelements=1;
		int numberofelements2=0;
		for(int i=0;i<number.length;i++) {
			number2[i]=Integer.parseInt(number[i]);
		}
		
		for(int j=0;j<number2.length;j++) {
			if(j+1==number2.length) {
				if(numberofelements2<numberofelements) {
					System.out.println(numberofelements2 + " "+numberofelements);
					//System.out.println(number2[j]+" "+number2[j+1]);
					numberofelements2=numberofelements;
					numberofelements=1;
					position=j;
					break;
				}
			}
			if(number2[j]<number2[j+1]) {
				numberofelements=numberofelements+1;
				System.out.println(numberofelements);
				System.out.println(number2[j]+" "+number2[j+1]);
			}else {
				if(numberofelements2==0) {
					numberofelements2=numberofelements;
					numberofelements=1;
					position=j;
					System.out.println(numberofelements2 + " "+numberofelements);
					System.out.println(number2[j]+" "+number2[j+1]);
					continue;
				}
				if(numberofelements2<numberofelements) {
					System.out.println(numberofelements2 + " "+numberofelements);
					System.out.println(number2[j]+" "+number2[j+1]);
					numberofelements2=numberofelements;
					numberofelements=1;
					position=j;
				}else continue;
			}
		}
		
		for(int z=position-numberofelements2+1;z<=position;z++) {
			System.out.print(number2[z]+" ");
		}
	}
}
