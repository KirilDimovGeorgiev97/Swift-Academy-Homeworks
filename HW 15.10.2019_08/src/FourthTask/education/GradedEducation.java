package FourthTask.education;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class GradedEducation extends Education {
	
	private float finalGrade;
	
	protected GradedEducation(String institutionName, String[] enrollmentDate, String[] graduationDate,float finalGrade) {
		super(institutionName, enrollmentDate, graduationDate);
		this.setFinalGrade(finalGrade);
	}
		

	public boolean gotGraduated(float getFinalGrade) {
		if(this.getFinalGrade()>=3) setGraduated(true);
		else setGraduated(false);
		return this.isGraduated();
	}
	
	public float getFinalGrade() {
		return this.finalGrade;
	}
	
	public void setFinalGrade(float finalGrade) {
		if(ChronoUnit.YEARS.between(this.getGraduationDate(),LocalDate.now())>0)
			this.finalGrade=finalGrade;
		else {
			this.finalGrade=-1;
			return;
		}
		this.gotGraduated(getFinalGrade());
	}
	
	public String getDegree() {
		if(getFinalGrade()==-1) return "";
		else return " The grade is "+getFinalGrade();
	}
	public abstract String toString(String type);
}
