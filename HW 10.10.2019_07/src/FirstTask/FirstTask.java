package FirstTask;

import java.util.Scanner;
public class FirstTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st;
		
		String[] st1;		
		do {
			st=sc.nextLine();
			st1=st.split("\\s+");
			System.out.println(st1.length);
			if(st.equals("END")) break;
			if(st1.length==5) {
				Student s=new Student();
				s.setfirstName(st1[0]);
				s.setlastName(st1[1]);
				s.setfacultyNumber(Integer.parseInt(st1[2]));
				s.setlectureHours(Integer.parseInt(st1[3]));
				s.setexerciseHours(Integer.parseInt(st1[4]));
				System.out.println(s.toString());
			}else {
				Worker w = new Worker();
				w.setfirstName(st1[0]);
				w.setlastName(st1[1]);
				w.setHoursperDay(Integer.parseInt(st1[3]));
				w.setweekSalary(Integer.parseInt(st1[2]));
				System.out.println(w.toString());
			}
			
		}while(true);
		
		
	}

}
