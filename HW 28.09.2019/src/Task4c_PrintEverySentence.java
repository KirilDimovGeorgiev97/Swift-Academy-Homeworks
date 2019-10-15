import java.util.Scanner;

public class Task4c_PrintEverySentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=new String();
		st=sc.nextLine();
		sc.close();
		String[] array=new String [st.length()/2];
		int q=0;
		int z=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='.' || st.charAt(i)=='?'||st.charAt(i)=='!') {
				array[q]=st.substring(z, i+1);
				z=i+2;
				q++;
			}
		}
		for(int j=0;j<q;j++) {
			System.out.println(array[j]);
		}
	}
}
