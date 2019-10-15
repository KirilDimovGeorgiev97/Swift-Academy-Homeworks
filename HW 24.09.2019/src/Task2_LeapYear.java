import java.util.Scanner;
public class Task2_LeapYear {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		boolean LeapYear=false;
		int year = myObj.nextInt();
		System.out.println(year);
		if(((year % 100==0) && (year % 400==0))) {
				LeapYear=true;
				System.out.println(LeapYear);
		}else if (year%4==0 && year%100==0){
			System.out.println(LeapYear);
			
		}
		if(year%4==0 && ((year%400==0))){
			LeapYear=true;
			System.out.println(LeapYear);
		}
		System.out.println(LeapYear);
	}
}

