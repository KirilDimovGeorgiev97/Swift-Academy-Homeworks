package SecondTask;

import java.util.ArrayList;

import java.util.List;

public class Student {
	private String name;
	private int teleNumber;
	private int facultyNumber;
	private int stamina=20;
	private String[] ssubjects=new String[20];
	protected static List<Student> students=new ArrayList<>();
	
	protected Student(String name,int teleNumber, int facultyNumber,String[] ssubjects) {
		this.name=name;
		this.teleNumber=teleNumber;
		this.facultyNumber=facultyNumber;
		this.setSsubjects(ssubjects);
		add(this);
	}
	
	protected void setSsubjects(String[] a) {
		for(int i=0;i<20;i++) {
			this.ssubjects[i]=a[i];
		}
	}
	
	protected static void setStamina(int a) {
		for(Student b:students) {
			b.stamina+=a;
			if(b.stamina==50) 
				Employee.studentsPay(10);
		}
	}
	

	protected int getStamina() {
		return this.stamina;
	}
	
	protected static int checkStamina() {
		for(Student a:students) {
			if(a.getStamina()<=0) {
				return students.indexOf(a);
			}
		}
		return -1;
	}
	
	protected void studentWorks() {
		setStamina(2);
		Employee.someOneWorks(this.getClass());
	}
	
	protected static void nobodySWorks() {
		for(Student a:students) {
			a.setStamina(-5);
		}
	}
	
	protected static void add(Student a) {
		students.add(a);
	}
	
	protected static Student getStudent(String name,int a) {
		if(a+1==students.size()) return null;
		if(students.get(a).name.equals(name)) return students.get(a);
		else return getStudent(name,a+1);
	}
	
	protected static String getStudent2(int a) {
		return students.get(a).name+" is not happy";
	}
	
}
