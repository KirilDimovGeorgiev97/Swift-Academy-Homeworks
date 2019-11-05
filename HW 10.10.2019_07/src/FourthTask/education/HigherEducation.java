package FourthTask.education;

public class HigherEducation extends GradedEducation {

	protected HigherEducation(String institutionName, String[] enrollmentDate, String[] graduationDate,float finalGrade) {
		super(institutionName, enrollmentDate, graduationDate,finalGrade);
		// TODO Auto-generated constructor stub
	}
	
	public static HigherEducation callHigherEducation(String institutionName, String[] enrollmentDate, String[] graduationDate,float finalGrade) {
		return new HigherEducation (institutionName, enrollmentDate, graduationDate,finalGrade);
	}
	
	
	@Override
	public String toString(String type) {
		if(type.equals("B")) 
			return " bachelor degree at "+this.getInstitutionName()+" on "+this.getEnrollmentDate()+" and supposed to graduate on "+this.getGraduationDate()+getDegree();
		else if(type.equals("M")) 
			return "cmaster degree at "+this.getInstitutionName()+" on "+this.getEnrollmentDate()+" and supposed to graduate on "+this.getGraduationDate()+getDegree();
		else 
			return " doctorate degree at "+this.getInstitutionName()+" on "+this.getEnrollmentDate()+" and supposed to graduate on "+this.getGraduationDate()+getDegree();
	}
}
