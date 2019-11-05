package FourthTask.education;

import java.time.LocalDate;

public abstract class Education {
/*������ � graduated, enrollmentDate, graduationDate, institutionName
o ���������� ������ � getDegree(), gotGraduated()
o �������� � isGraduated(), getEnrollmentDate(), getGraduationDate(), getInstitutionName()
o �������� - setGraduationDate()*/
	
	private boolean graduated;
	private LocalDate enrollmentDate;
	private LocalDate graduationDate;
	private String institutionName;
	
	public abstract String getDegree();
	
	protected Education(String institutionName,String[] enrollmentDate,String[] graduationDate) {
		this.institutionName=institutionName;
		this.enrollmentDate=LocalDate.of(Integer.parseInt(enrollmentDate[2]), Integer.parseInt(enrollmentDate[1]), Integer.parseInt(enrollmentDate[0]));
		this.graduationDate=LocalDate.of(Integer.parseInt(graduationDate[2]), Integer.parseInt(graduationDate[1]), Integer.parseInt(graduationDate[1]));
	
	}
	
	public abstract boolean gotGraduated(float finalGrade);
	public abstract String toString(String type);
	
	protected boolean isGraduated() {
		return this.graduated;
	}
	
	protected LocalDate getEnrollmentDate() {
		return this.enrollmentDate;
	}
	
	protected LocalDate getGraduationDate() {
		return this.graduationDate;
	}
	
	protected String getInstitutionName() {
		return this.institutionName;
	}
	
	protected void setGraduationDate(LocalDate graduationDate) {
		this.graduationDate=graduationDate;
	}
	
	protected void setGraduated(boolean t) {
		this.graduated=t;
	}
}
