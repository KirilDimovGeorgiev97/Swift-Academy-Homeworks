import java.util.Scanner;

public class Task4_InchToCm {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		float inc = myObj.nextFloat();
		float cm= (float)(inc*2.54);
		System.out.println(cm);
	}
}
