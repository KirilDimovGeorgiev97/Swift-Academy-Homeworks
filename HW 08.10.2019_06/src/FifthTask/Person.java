package FifthTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Person {
	private String Fname;
	private String Lname;
	private String sex;
	private String job;
	private  LocalDate date;;
	private float height;
	private float weight;
	private float allgrades;
	private SecondaryEducation se;
	
	protected Person(String Fname,String Lname,String sex,String job,String[] date,float height,float weight,float allgrades,
			String institutionName,String[] enrollmentDate,String[] graduationDate) {
		this.Fname=Fname;
		this.Lname=Lname;
		this.sex=sex;
		this.job=job;
		this.date=LocalDate.of(Integer.parseInt(date[2]),Integer.parseInt(date[1]), Integer.parseInt(date[0]));
		this.height=height;
		this.weight=weight;
		this.allgrades=allgrades;
		this.se=new SecondaryEducation(institutionName, enrollmentDate, graduationDate,allgrades);
	}
	

	@Override
	public String toString() {
		if(ChronoUnit.YEARS.between(date,LocalDate.now())>=18) {
			if(this.sex.equals("F")) {
				return this.Fname+" "+this.Lname + " is " + ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. Her weight is " + this.weight +  
					" and she is "+this.height+" cm tall. She is a "+this.job +"."+"She is under-aged.She started at "+this.se.getInstitutionName()+"on "+
						this.se.getDates()+ "with "+this.se.getfinalGrade();
			}else {
				return this.Fname+" "+this.Lname + " is " +ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. His weight is " + this.weight +  
						" and he is "+this.height+" cm tall. He is a "+this.job +"."+"He is under-aged.He started at "+this.se.getInstitutionName()+"on "+
						this.se.getDates()+ "with "+this.se.getfinalGrade();
			}
		}else {
			if(this.sex.equals("M")) {
				return this.Fname+" "+this.Lname + " is " +ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. His weight is " + this.weight +  
					" and he is "+this.height+" cm tall. He is a "+this.job +".He started at" +this.se.getInstitutionName()+"on "+
					this.se.getDates()+ "with "+this.se.getfinalGrade();
			}else {
				return this.Fname+" "+this.Lname + " is " +ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. Her weight is " + this.weight +  
						" and she is "+this.height+" cm tall. She is a "+this.job +".She started at "+this.se.getInstitutionName()+"on "+
						this.se.getDates()+ "with "+this.se.getfinalGrade();
			}
		}
	
	}
}