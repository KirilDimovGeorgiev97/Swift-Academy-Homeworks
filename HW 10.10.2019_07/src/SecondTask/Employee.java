package SecondTask;

import java.util.List;
import java.util.ArrayList;

public abstract class Employee {
	private String name;
	private int telenumber;
	private int salaryPerHour;
	private int stamina=20;
	
	private static List<Employee> employees=new ArrayList<>();
	
	private static int budget=50;
	
	protected Employee(String name,int telenumber) {
		this.name=name;
		this.telenumber=telenumber;
	}
	
	protected abstract void work();
	
	protected static void add(Employee a) {
		employees.add(a);
	}
	
	protected void setStamina(int a) {
		this.stamina+=a;
	}
	
	protected int getStamina() {
		return this.stamina;
	}
	
	protected static void paySomeone(int a) {
		budget-=a;
	}
	
	protected static void studentsPay(int a) {
		budget+=a;
	}
	
	protected static boolean bankruptcy() {
		if(budget<=0) return true;
		else return false;
	}
	
	protected static int checkStamina() {
		for(Employee a:employees) {
			if(a.getStamina()<=0) {
				return employees.indexOf(a);
			}
		}
		return -1;
	}
	
	
	protected static Employee getEmployee(String name,int a) {
		if(a+1==employees.size()) return null;
		if(employees.get(a).name.equals(name)) return employees.get(a);
		else return getEmployee(name,a+1);
	}
	protected static String getEmployee2(int a) {
		return employees.get(a).name+" is not happy";
	}
	
	protected static void nobodyWorks() {
		for(Employee a:employees) {
			a.setStamina(-5);
		}
		Student.nobodySWorks();
	}
	
	protected static void someOneWorks(Class t) {
		
		if(t.getName().equals("Student")) {
			for(Employee a:employees) {
				if(a instanceof MaintenanceEmployee) {
					a.setStamina(-1);
				}
			}
			return;
		}
		
		if(t.getName().equals("Teacher")) {
			paySomeone(25);
			for(Employee a:employees) {
				if(a instanceof AdministrationEmployee) {
					a.setStamina(-1);
				}else if(a instanceof MaintenanceEmployee) {
					a.setStamina(-3);
				}
			}
			Student.setStamina(3);
			return;
		}else if(t.getName().equals("AdministrationEmployee")) {
			paySomeone(19);
			for(Employee a:employees) {
				if(a instanceof Teacher) {
					a.setStamina(3);
				}else if(a instanceof MaintenanceEmployee) {
					a.setStamina(1);
				}
			}
			Student.setStamina(3);
			return;
		}else if(t.getName().equals("MaintenanceEmployee")) {
			paySomeone(15);
			for(Employee a:employees) {
				if(a instanceof Teacher) {
					a.setStamina(2);
				}else if(a instanceof AdministrationEmployee) {
					a.setStamina(2);
				}
			}
			Student.setStamina(2);
			return;
		}
	}
	
}
