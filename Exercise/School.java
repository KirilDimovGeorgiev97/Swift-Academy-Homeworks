package Exercise;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name of the teacher");
		String teacherName=sc.nextLine();
		System.out.println("Name of the teacher's discipline");
		String nameOfDiscipline=sc.nextLine();
		System.out.println("Hours of teaching:");
		int hours=sc.nextInt();
		
		Teacher teacher=new Teacher(teacherName,nameOfDiscipline);
		teacher.setDisciplineHours(hours);
		sc.nextLine();
		String studentName;
		System.out.println("Name of the student");
		studentName=sc.nextLine();
		int grades[]=new int[3];
		System.out.println("Student ID");
		int id=sc.nextInt();

		for(int i=0;i<3;i++) {
			System.out.println("Grade- "+ (i+1));
			grades[i]=sc.nextInt();
		}
		Student student=new Student(studentName,id,nameOfDiscipline);
		student.setGrades(3,grades);
		
		System.out.println(student.toString());
		System.out.println(teacher.toString());
	}

}
