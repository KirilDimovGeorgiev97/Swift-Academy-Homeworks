package FourthTask;

import java.time.LocalDate;


import java.time.temporal.ChronoUnit;

import FourthTask.education.*;

public class Person {
	private String Fname;
	private String Lname;
	private String ex;
	private String job;
	private  LocalDate date;;
	private float height;
	private float weight;
	private float finalGrade;
	private Education e;
	private String type;
	
	protected Person(String Fname,String Lname,String ex,String job,String[] date,float height,float weight,float finalGrade,
			String institutionName,String[] enrollmentDate,String[] graduationDate,String type) {
		this.Fname=Fname;
		this.Lname=Lname;
		this.ex=ex;
		this.job=job;
		this.date=LocalDate.of(Integer.parseInt(date[2]),Integer.parseInt(date[1]), Integer.parseInt(date[0]));
		this.height=height;
		this.weight=weight;
		this.type=type;
		this.e=choose(finalGrade,institutionName, enrollmentDate, graduationDate,type);
	}
	
	
	protected static Education choose(float finalGrade,String institutionName,String[] enrollmentDate,String[] graduationDate,String type) {
		if(type.equals("P")) return PrimaryEducation.callPrimaryEducation(institutionName, enrollmentDate, graduationDate);
		else if(type.equals("S")) return SecondaryEducation.callSecondaryEducation(institutionName, enrollmentDate, graduationDate,finalGrade);
		else return HigherEducation.callHigherEducation(institutionName, enrollmentDate, graduationDate,finalGrade);
	}
	
	
	
	
	@Override
	public String toString() {
		if(ChronoUnit.YEARS.between(date,LocalDate.now())>=18) {
			if(this.ex.equals("F")) {
				return this.Fname+" "+this.Lname + " is " + ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. Her weight is " + this.weight +  
					" and she is "+this.height+" cm tall. She is a "+this.job +"."+"She is under-aged.She started "+this.e.toString(type)
					+this.e.getDegree();
			}else {
				return this.Fname+" "+this.Lname + " is " +ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. His weight is " + this.weight +  
						" and he is "+this.height+" cm tall. He is a "+this.job +"."+"He is under-aged.He started "+this.e.toString(type)
						+this.e.getDegree();
			}
		}else {
			if(this.ex.equals("M")) {
				return this.Fname+" "+this.Lname + " is " +ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. His weight is " + this.weight +  
					" and he is "+this.height+" cm tall. He is a "+this.job +".He started "+this.e.toString(type)
					+this.e.getDegree();
			}else {
				return this.Fname+" "+this.Lname + " is " +ChronoUnit.YEARS.between(date,LocalDate.now())+ " years old. Her weight is " + this.weight +  
						" and she is "+this.height+" cm tall. She is a "+this.job +".She started "+this.e.toString(type)
						+this.e.getDegree();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}