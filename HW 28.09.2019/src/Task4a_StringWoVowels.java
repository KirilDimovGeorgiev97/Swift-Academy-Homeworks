import java.util.Scanner;

public class Task4a_StringWoVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=new String();
		st=sc.nextLine();
		sc.close();
		st=st.replace("A","");
		st=st.replace("a","");
		st=st.replace("O","");
		st=st.replace("o","");
		st=st.replace("I","");
		st=st.replace("i","");
		st=st.replace("E","");
		st=st.replace("e","");
		st=st.replace("U","");
		st=st.replace("u","");
		System.out.println(st);
		
	}

}
