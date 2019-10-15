import java.util.Scanner;
import java.lang.String;

public class Task4b_PrintCountOfWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=new String();
		st=sc.nextLine();
		//st=sc.nextLine();
		sc.close();
		String[] words =st.split("\\s+");;
		int number=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equals("a")) {
				continue;
			}else {
				number++;
			}
		}
		System.out.println(number);
	}
}
