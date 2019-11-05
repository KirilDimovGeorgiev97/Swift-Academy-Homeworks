package FourthTask.education;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SecondaryEducation extends GradedEducation {

	protected SecondaryEducation(String institutionName, String[] enrollmentDate, String[] graduationDate,float finalGrade) {
		super(institutionName, enrollmentDate, graduationDate,finalGrade);
	}

	public static SecondaryEducation callSecondaryEducation(String institutionName, String[] enrollmentDate, String[] graduationDate,float finalGrade) {
		return new SecondaryEducation (institutionName, enrollmentDate, graduationDate,finalGrade);
	}
	
	public String toString(String type) {
		return " secondary degree at "+this.getInstitutionName()+" on "+this.getEnrollmentDate()+" and supposed to graduate on "+this.getGraduationDate()+getDegree();
	}
}
