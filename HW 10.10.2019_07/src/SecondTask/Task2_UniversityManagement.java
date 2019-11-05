package SecondTask;

import java.util.Scanner;

public class Task2_UniversityManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st;
		String[] st1=new String[10];
		String [] subjects=new String[5];
		
		Employee e;
		Student s;
		boolean check;
		
		do {
			st=sc.nextLine();
			if(st.equals("END")) break;
			st1=st.split("\\s+");
			if(st1.length>4) {
				for(int i=3;i<st1.length;i++) {
					subjects[i]=st1[i];
				}
			}
			if(st1[0].equals("NEW")) {
				if(st1[1].equals("TEACH"))
					e=new Teacher(st1[2],Integer.parseInt(st1[3]),subjects);
				else if(st1[1].equals("ADMIN"))
					e=new AdministrationEmployee(st1[2],Integer.parseInt(st1[3]),subjects);
				else if(st1[1].equals("MAIN"))
					e=new MaintenanceEmployee(st1[2],Integer.parseInt(st1[3]));
				else 
					s=new Student(st1[2],Integer.parseInt(st1[3]),Integer.parseInt(st1[4]),subjects);
			}
			else if(st1[0].equals("WORK")) {
				e=Employee.getEmployee(st1[1], 0);
				if(e==null) {
					s=Student.getStudent(st1[1], 0);
					s.studentWorks();
				}else Employee.someOneWorks(e.getClass());
				
				if(Employee.bankruptcy()) {
					System.out.println("Bankruptcy");
					break;
				}
			}
			else if(st1[0].equals("IDLE")) {
				Employee.nobodyWorks();
				System.out.println(Employee.checkStamina()==-1 ? "": Employee.getEmployee2(Employee.checkStamina()));
				System.out.println(Student.checkStamina()==-1 ? "": Student.getStudent2(Student.checkStamina()));
			}
		}while(true);
	}
}
