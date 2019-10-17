package FourthTask;

import java.util.Scanner;

public class Task4_PersonCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Person[] a=new Person[n];
		sc.nextLine();
		
		String Fname;
		String Lname;
		String job;
		int DateOfBirth;
		float height;
		float weight;
		char sex;
		float allgrades = 0;
		
		for(int i=0;i<n;i++) {
			System.out.println("First Name");
			Fname=sc.nextLine();
			if(Fname.length()==0) {
				Fname=sc.nextLine();
			}
			do {
				System.out.println("weight");
				weight=sc.nextFloat();
				System.out.println("Sex");
				sex=sc.next().charAt(0);
				System.out.println("Date of birth");
				DateOfBirth=sc.nextInt();
				System.out.println("height");
				height=sc.nextFloat();
				System.out.println("Job");
				job=sc.nextLine();
				if(job.length()==0) {
					job=sc.nextLine();
				}
			}while((DateOfBirth>2019||DateOfBirth<1900)||(height<150||height>220)
					||(weight<50||weight>180));
			
			System.out.println("Last Name");
			Lname=sc.nextLine();
			if(Lname.length()==0) {
				Lname=sc.nextLine();
			}
			
			for(int j=0;j<4;j++) allgrades+=(sc.nextFloat());
			a[i]=new Person(Fname, Lname, sex, job, DateOfBirth, height, weight, allgrades);
		}
		for(int z=0;z<n;z++) System.out.println(a[z].toString());
	}
}
