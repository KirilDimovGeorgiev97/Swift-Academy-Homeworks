package Second;

import java.util.Scanner;

import ThirdTask.Vehicle;

import java.util.Arrays;

public class Task2_EmployeeSalarySort {



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employee[] a=new Employee[n];
		sc.nextLine();
		
		String name;
		float salary;
		String position;
		String department;
		int age; 
		String email;
		
		for(int i=0;i<n;i++) {
			name=sc.nextLine();
			salary=sc.nextFloat();
			sc.nextLine();
			position=sc.nextLine();
			department=sc.nextLine();
			age=sc.nextInt(); 
			sc.nextLine();
			email=sc.nextLine();
			a[i]=new Employee(name,salary,position,department,age,email);
		}
		sc.close();
		Arrays.sort(a);
		
		Employee[] b=new Employee[3];
		for(int j=0;j<3;j++) b[j]=a[n-1-j];
		
		System.out.println(Arrays.toString(b));
	}
}
