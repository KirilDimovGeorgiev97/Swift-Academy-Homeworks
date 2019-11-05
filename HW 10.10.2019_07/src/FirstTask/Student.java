package FirstTask;

public class Student {
	/*Напишете програма Task1_PeoplePresentation, която да съдържа 2 класа – Student и Worker. 
	 * За двата класа характеристиките първо (firstName) и последно име (lastName) са общи.
	 *  Класът Student има допълнително факултетен номер (facultyNumber), брой лекции (lectureCount) на седмица и брой упражнения (exerciseCount), 
	 *  а Worker има седмична заплата (weekSalary) и брой работни часове на ден (workHoursPerDay).*/
	
	private String firstName;
	private String lastName;
	private long facultyNumber;
	private int lectureCount;
	private int exerciseCount;
	
	protected Student () {
		
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
	
	protected void setfacultyNumber(long facultyNumber) {
		if(facultyNumber<5000 || facultyNumber>999999999) {
			System.out.println("number of digits should be between 5 and 10");
			return;
		}
		this.facultyNumber=facultyNumber;
	}
	
	protected void setexerciseHours(int exerciseCount) {
		if(exerciseCount<0) {
			System.out.println("Negative value");
			return;
		}
		this.exerciseCount=exerciseCount;
	}
	
	protected void setlectureHours(int lectureCount) {
		if(lectureCount<0) {
			System.out.println("Negative value");
			return;
		}
		this.lectureCount=lectureCount;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", facultyNumber=" + facultyNumber
				+ " hours per day "+(this.exerciseCount*1.5+this.lectureCount*2)/5+"]";
	}
	
	
}
