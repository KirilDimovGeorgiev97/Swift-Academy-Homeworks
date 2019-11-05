package FourthTask;

import java.util.Scanner;

public class Task4_PersonCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of students");
		int n=sc.nextInt();
		Person[] a=new Person[n];
		sc.nextLine();
		
		String input;
		String[] input1=new String[10];
		String Fname;
		String Lname;
		String job;
		float height;
		float weight;
		String sex;
		float finalgrade;
		String institutionName;
		String[] DateOfBirth=new String[3];
		String[] enrollmentDate=new String[3];
		String[] graduationDate=new String[3];;
		String type;
		
		
		
		for(int i=0;i<n;i++) {
			System.out.println("Input from the Task. Input dates with dd-mmm-yyyy");
			input=sc.nextLine();
			input1=input.split(";");
			DateOfBirth=input1[4].split("-");
			enrollmentDate=input1[7].split("-");
			graduationDate=input1[8].split("-");
			Fname=input1[0];
			
			System.out.println("Weigth");           //Peter;Petrov;M;184;9.9.1985;S;SOU Pushkin;15.9.2000;20.5.2005;5.11
			
			weight=sc.nextFloat();
			
			sc.nextLine();
			
			sex=input1[2];

			height=Float.parseFloat(input1[3]);
			
			System.out.println("Job");
			
			job=sc.nextLine();
			             
			Lname=input1[1];
			
			institutionName=input1[6];
			if(input1==null)finalgrade=0;
			else finalgrade=Float.parseFloat(input1[9]);
			
			type=input1[5];
			
			//for(int j=0;j<4;j++) allgrades+=(sc.nextFloat());
			a[i]=new Person(Fname,Lname,sex,job,DateOfBirth,height,weight,finalgrade,
					institutionName,enrollmentDate,graduationDate,type);
		}

		for(int z=0;z<n;z++) System.out.println(a[z].toString());
	}

}
