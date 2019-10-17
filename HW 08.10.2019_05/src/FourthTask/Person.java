package FourthTask;

public class Person {
	private String Fname;
	private String Lname;
	private char sex;
	private String job;
	private int DateOfBirth;
	private float height;
	private float weight;
	private float allgrades;
	
	
	protected Person(String Fname,String Lname,char sex,String job,int DateOfBirth,float height,float weight,float allgrades) {
		this.Fname=Fname;
		this.Lname=Lname;
		this.sex=sex;
		this.job=job;
		this.DateOfBirth=DateOfBirth;
		this.height=height;
		this.weight=weight;
		this.allgrades=allgrades;
	}
	

	@Override
	public String toString() {
		if(2019-this.DateOfBirth<=18) {
			if(this.sex=='F') {
				return this.Fname+" "+this.Lname + " is " + (2019-this.DateOfBirth)+ " years old. Her weight is " + this.weight +  
					" and she is "+this.height+" cm tall. She is a "+this.job +"."+"She is under-aged.She has average grade "+ this.allgrades/4;
			}else {
				return this.Fname+" "+this.Lname + " is " +(2019-this.DateOfBirth)+ " years old. His weight is " + this.weight +  
						" and he is "+this.height+" cm tall. He is a "+this.job +"."+"He is under-aged.He has average grade "+this.allgrades/4;
			}
		}else {
			if(this.sex=='M') {
				return this.Fname+" "+this.Lname + " is " +(2019-this.DateOfBirth)+ " years old. His weight is " + this.weight +  
					" and he is "+this.height+" cm tall. He is a "+this.job +".His average grade is "+this.allgrades/4;
			}else {
				return this.Fname+" "+this.Lname + " is " +(2019-this.DateOfBirth)+ " years old. Her weight is " + this.weight +  
						" and she is "+this.height+" cm tall. She is a "+this.job +".Her average grade is "+this.allgrades/4;
			}
		}
	
	}
}
