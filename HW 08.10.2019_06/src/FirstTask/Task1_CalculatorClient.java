package FirstTask;
import java.util.*;


public class Task1_CalculatorClient extends Calculator {
	public static void main(String[] args) {
		//SUM, SUB, MUL, DIV, PER.
		Scanner sc=new Scanner(System.in);
		String command=sc.nextLine();
		String[] command2=command.split("\\s+");
		if(command2[0].equals("SUM")) {
			System.out.println(sum(command2[1],command2[2]));
		}else if(command2[0].equals("SUB")) {
			System.out.println(subtract(command2[1],command2[2]));
		}else if(command2[0].equals("MUL")) {
			System.out.println(multiply(command2[1],command2[2]));
		}else if(command2[0].equals("DIV")) {
			System.out.println(divide(command2[1],command2[2]));
		}else if(command2[0].equals("PER")) {
			System.out.println(percentage(command2[1],command2[2]));
		}
		
		
	}
}
