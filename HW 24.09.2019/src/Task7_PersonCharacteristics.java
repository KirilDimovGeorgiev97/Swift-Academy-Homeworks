import java.util.Scanner;

public class Task7_PersonCharacteristics {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String Fname = myObj.nextLine();
		String Lname = myObj.nextLine();
		String job = myObj.nextLine();
		int DateOfBirth = myObj.nextInt();
		float height=myObj.nextFloat();
		float weight=myObj.nextFloat();
		
		System.out.println(Fname+Lname + " is " +(2019-DateOfBirth)+ " years old. His weight is " + weight +  
		" and he is "+height+" cm tall. He is a "+job +".");
	}

}
