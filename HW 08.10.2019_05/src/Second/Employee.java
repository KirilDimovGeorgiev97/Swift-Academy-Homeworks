package Second;

public class Employee implements Comparable<Employee> {
	private String name;
	private float salary;
	private String position;
	private String department;
	private int age; 
	private String email;
	
	protected Employee(String name,float salary,String position,String department,int age,String email) {
		this.name=name;
		this.salary=salary;
		this.position=position;
		this.department=department;
		this.age=age;
		this.email=email;
	}
	
	@Override
	public int compareTo(Employee other) {
		if(this.salary-other.salary>0) return 1;
		else if(this.salary-other.salary<0) return -1;
		else return 0;
	}
	
	@Override 
	public String toString() {
		return this.name+" "+this.department+" "+this.position+" "+this.email;
	}
	
}
