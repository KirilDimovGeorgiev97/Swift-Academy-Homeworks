package FirstTask;

import java.util.*;

public class Task1_DateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		SwiftDate first=new SwiftDate();
		first.Setdate(sc.nextInt(), sc.nextInt(), sc.nextInt());

		
		SwiftDate second=new SwiftDate();
		second.Setdate(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		first.printInfo();
		second.printInfo();
	
		System.out.println(first.getDaysDifference(second));
	}

}
