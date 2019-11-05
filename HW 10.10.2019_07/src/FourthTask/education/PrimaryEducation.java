package FourthTask.education;

public class PrimaryEducation extends Education {

	protected PrimaryEducation(String institutionName, String[] enrollmentDate, String[] graduationDate) {
		super(institutionName, enrollmentDate, graduationDate);
		// TODO Auto-generated constructor stub
	}
	
	public static PrimaryEducation callPrimaryEducation(String institutionName, String[] enrollmentDate, String[] graduationDate) {
		return new PrimaryEducation(institutionName, enrollmentDate, graduationDate);
	}

	@Override
	public boolean gotGraduated(float finalGrade) {
		return true;
	}

	public String toString(String type) {
		return "cprimary degree at"+this.getInstitutionName()+" on "+this.getEnrollmentDate()+" and supposed to graduate on "+this.getGraduationDate();
	}

	@Override
	public String getDegree() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
