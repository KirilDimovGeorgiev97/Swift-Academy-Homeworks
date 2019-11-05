package ThirdTask;

import java.util.Scanner;

import java.lang.ArrayIndexOutOfBoundsException;

public class Task3_PersonCharacteristics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of students");
		int n=sc.nextInt();
		Person[] a=new Person[n];
		sc.nextLine();
		
		String input;
		String[] input1=new String[19];
		String Fname;
		String Mname;
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
		
		String country;
		String city;
		String municipality;
		int postalCode;
		String street;
		int number;
		int floor;
		int apartmentNo;
		
/*
1) Собствено име
2) Бащино име
3) Фамилно име
4) Пол (M/F)
5) Дата на раждане (формат d.M.yyyy)
6) Височина (в см)
7) Държава
8) Град
9) Община
10) Пощенски код
11) Улица
12) Номер
13) Етаж (може да е празно)
14) Апартамент (може да е празно)
15) Код за образование (P/S/B/M/D)
16) Име на институция
17) Дата на започване на образованието (формат d.M.yyyy)
18) Дата на приключване на образованието (формат d.M.yyyy)
19) Оценка (ако образованието не е P(rimary) и датата на завършване вече е минала)*/
		
		for(int i=0;i<n;i++) {
			System.out.println("Input from the Task. Input dates with dd-mmm-yyyy");
			input=sc.nextLine();
			input1=input.split(";");
			DateOfBirth=input1[4].split("-");
			enrollmentDate=input1[16].split("-");
			graduationDate=input1[17].split("-");
			Fname=input1[0];
			Mname=input1[1];
			
			System.out.println("Weigth");           //Peter;Petrov;M;184;9.9.1985;S;SOU Pushkin;15.9.2000;20.5.2005;5.11
			
			weight=sc.nextFloat();
			
			sc.nextLine();
			
			sex=input1[3];

			height=Float.parseFloat(input1[5]);
			
			System.out.println("Job");
			
			job=sc.nextLine();
			             
			Lname=input1[2];
			
			country=input1[6];
			
			city=input1[7];
			municipality=input1[8];
			postalCode=Integer.parseInt(input1[9]);
			street=input1[10];
			number=Integer.parseInt(input1[11]);
			floor=Integer.parseInt(input1[12]);
			apartmentNo=Integer.parseInt(input1[13]);
			
			institutionName=input1[15];
			try {
				finalgrade=Float.parseFloat(input1[18]);
			}catch(ArrayIndexOutOfBoundsException e) {
				finalgrade=0;
			}
			type=input1[14];
			
			//for(int j=0;j<4;j++) allgrades+=(sc.nextFloat());
			a[i]=new Person(Fname,Lname,sex,job,DateOfBirth,height,weight,finalgrade,
					institutionName,enrollmentDate,graduationDate,type,
					country,city,municipality,postalCode,street,number,floor,apartmentNo);
		}

		for(int z=0;z<n;z++) System.out.println(a[z].toString());
	}
}
