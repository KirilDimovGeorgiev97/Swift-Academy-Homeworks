import java.util.Scanner;

public class Task5_PersonCharacteristics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String Fname[]=new String[n];
		String Lname[]=new String[n];
		String job[]=new String[n];
		int DateOfBirth[]=new int[n];
		float height[]=new float[n];
		float weight[]=new float[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("First Name");
			Fname[i]=sc.nextLine();
			if(Fname[i].length()==0) {
				Fname[i]=sc.nextLine();
			}
			do {
				System.out.println("weight");
				weight[i]=sc.nextFloat();
				System.out.println("Date of birth");
				DateOfBirth[i]=sc.nextInt();
				System.out.println("height");
				height[i]=sc.nextFloat();
				System.out.println("Job");
				job[i]=sc.nextLine();
				if(job[i].length()==0) {
					job[i]=sc.nextLine();
				}
			}while((DateOfBirth[i]>2019||DateOfBirth[i]<1900)||(height[i]<150||height[i]>220)
					||(weight[i]<50||weight[i]>180));
			System.out.println("Last Name");
			Lname[i]=sc.nextLine();
			if(Lname[i].length()==0) {
				Lname[i]=sc.nextLine();
			}
		}
		sc.close();
		for(int j=0;j<n;j++) {
			if(2019-DateOfBirth[j]<=18) {
				System.out.println(Fname[j]+" "+Lname[j] + " is " +(2019-DateOfBirth[j])+ " years old. His weight is " + weight[j] +  
						" and he is "+height[j]+" cm tall. He is a "+job[j] +"."+"He is under-aged");
				System.out.println();
			}else {
				System.out.println(Fname[j]+" "+Lname[j] + " is " +(2019-DateOfBirth[j])+ " years old. His weight is " + weight[j] +  
						" and he is "+height[j]+" cm tall. He is a "+job[j] +".");
				System.out.println();
			}
		}
	}
}
