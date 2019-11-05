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
1) ��������� ���
2) ������ ���
3) ������� ���
4) ��� (M/F)
5) ���� �� ������� (������ d.M.yyyy)
6) �������� (� ��)
7) �������
8) ����
9) ������
10) �������� ���
11) �����
12) �����
13) ���� (���� �� � ������)
14) ���������� (���� �� � ������)
15) ��� �� ����������� (P/S/B/M/D)
16) ��� �� ����������
17) ���� �� ��������� �� ������������� (������ d.M.yyyy)
18) ���� �� ����������� �� ������������� (������ d.M.yyyy)
19) ������ (��� ������������� �� � P(rimary) � ������ �� ���������� ���� � ������)*/
		
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
