package FifthTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SecondaryEducation {
	private float finalGrade;
	private boolean graduated;
	private LocalDate enrollmentDate;
	private LocalDate graduationDate;
	private String institutionName;
	

	protected SecondaryEducation(String institutionName,String[] enrollmentDate,String[] graduationDate,float finalGrade) {
		this.institutionName=institutionName;
		this.enrollmentDate=LocalDate.of(Integer.parseInt(enrollmentDate[2]), Integer.parseInt(enrollmentDate[1]), Integer.parseInt(enrollmentDate[0]));
		this.graduationDate=LocalDate.of(Integer.parseInt(graduationDate[2]), Integer.parseInt(graduationDate[1]), Integer.parseInt(graduationDate[1]));
		this.finalGrade=finalGrade;
		if(finalGrade>3) this.graduated=true;
	}
	
	protected void setGraduatedAndFinalGrade(float finalGrade) {
		this.finalGrade=finalGrade;
		if(finalGrade>3) this.graduated=true;
	}
	
	
	protected String getInstitutionName() {
		return this.institutionName;
	}
	
	protected String getDates() {
		return this.enrollmentDate.format(DateTimeFormatter
	            .ofPattern("dd.LL.yyyy")).toString()+" and finished on "+this.graduationDate.format(DateTimeFormatter
	    	            .ofPattern("dd.LL.yyyy")).toString()+" ";
	}
	
	protected float getfinalGrade() {
		if(this.finalGrade>=2) return this.finalGrade;
		else return -1;
	}
}
