package FirstTask;

public class Worker {
	
	
	private String firstName;
	private String lastName;
	private int weekSalary;
	private int workHoursPerDay;
	
	protected Worker () {
	}
	
	protected void setfirstName(String firstName) {
		if(firstName.length()<2 || firstName.length()>30) {
			System.out.println("Incorrect length of firstname");
			return;
		}else if(!(Character.isUpperCase(firstName.charAt(0)))) {
			System.out.println("No uppercase");
			return;
		}else if(!firstName.matches("\\p{L}+")) {
			System.out.println("There are other letters,not only latin");
			return;
		}
		this.firstName=firstName;
	}
	
	protected void setlastName(String lastName) {
		if(lastName.length()<2 || lastName.length()>30) {
			System.out.println("Incorrect length of firstname");
			return;
		}else if(!(Character.isUpperCase(lastName.charAt(0)))) {
			System.out.println("No uppercase");
			return;
		}else if(!lastName.matches("\\p{L}+")) {
			System.out.println("There are other letters,not only latin");
			return;
		}
		this.lastName=lastName;
	}
	
	protected void setHoursperDay(int weekSalary) {
		if(weekSalary<0) {
			System.out.println("Negative value");
			return;
		}
		this.weekSalary=weekSalary;
	}
	
	protected void setweekSalary(int workHoursPerDay) {
		if( workHoursPerDay<0) {
			System.out.println("Negative value");
			return;
		}
		this.workHoursPerDay=workHoursPerDay;
	}

	@Override
	public String toString() {
		return "Worker [firstName=" + firstName + ", lastName=" + lastName + ", weekSalary=" + weekSalary
				+ ", workHoursPerDay=" + workHoursPerDay +" salary per hour= "+(this.weekSalary/(this.workHoursPerDay*5))+ "]";
	}
	
}
