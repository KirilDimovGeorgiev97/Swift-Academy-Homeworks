package ThirdTask;

import java.util.Arrays;
import java.util.Scanner;

import Second.Employee;

public class Task3_VehicleMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Vehicle[] a=new Vehicle[n];
		float fuelPrice=sc.nextFloat();
		sc.nextLine();
		
		String type;
		String model;
		int HorsePower;
		float fuelConsumption;
		int yearProduced; 
		int licenseNo=1000;
		int weight;
		String color;
		float distance;
		
		
		
		for(int i=0;i<n;i++) {
			type=sc.nextLine();
			model=sc.nextLine();
			HorsePower=sc.nextInt();
			fuelConsumption=sc.nextFloat();
			yearProduced=sc.nextInt(); 
			weight=sc.nextInt();
			sc.nextLine();
			color=sc.nextLine();
			distance=sc.nextFloat();
			a[i]=new Vehicle(type, model,HorsePower,fuelConsumption,yearProduced,licenseNo,weight,color,distance);
			licenseNo++;
		}
		sc.close();
		
		for(int j=0;j<n;j++) System.out.println(a[j].toString()+a[j].calculateTripPrice(fuelPrice, a[j].GetDistance()));
		
	}
}
