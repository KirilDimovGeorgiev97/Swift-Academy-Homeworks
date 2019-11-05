package FirstTask;

public class Student {
	/*�������� �������� Task1_PeoplePresentation, ����� �� ������� 2 ����� � Student � Worker. 
	 * �� ����� ����� ���������������� ����� (firstName) � �������� ��� (lastName) �� ����.
	 *  ������ Student ��� ������������ ���������� ����� (facultyNumber), ���� ������ (lectureCount) �� ������� � ���� ���������� (exerciseCount), 
	 *  � Worker ��� �������� ������� (weekSalary) � ���� ������� ������ �� ��� (workHoursPerDay).*/
	
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
