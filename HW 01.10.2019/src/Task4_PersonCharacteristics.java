import java.util.Scanner;

public class Task4_PersonCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String Fname[]=new String[n];
		String Lname[]=new String[n];
		String job[]=new String[n];
		int DateOfBirth[]=new int[n];
		float height[]=new float[n];
		float weight[]=new float[n];
		char sex []=new char [n];
		float grade[][]=new float[n][4];
		float allgrade[]=new float[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("First Name");
			Fname[i]=sc.nextLine();
			if(Fname[i].length()==0) {
				Fname[i]=sc.nextLine();
			}
			do {
				System.out.println("weight");
				weight[i]=sc.nextFloat();
				System.out.println("Sex");
				sex[i]=sc.next().charAt(0);
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
					||(weight[i]<50||weight[i]>180)||sex[i]!='F'||sex[i]!='M');
			System.out.println("Last Name");
			Lname[i]=sc.nextLine();
			if(Lname[i].length()==0) {
				Lname[i]=sc.nextLine();
			}
			for(int j=0;j<4;j++) {
				grade[i][j]=sc.nextFloat();
				allgrade[i]+=grade[i][j];
			}
		}
		sc.close();
		for(int j=0;j<n;j++) {
			if(2019-DateOfBirth[j]<=18) {
				if(sex[j]=='F') {
					System.out.println(Fname[j]+" "+Lname[j] + " is " +(2019-DateOfBirth[j])+ " years old. Her weight is " + weight[j] +  
						" and she is "+height[j]+" cm tall. She is a "+job[j] +"."+"She is under-aged.She has average grade "+allgrade[j]/4);
					System.out.println();
				}else {
					System.out.println(Fname[j]+" "+Lname[j] + " is " +(2019-DateOfBirth[j])+ " years old. His weight is " + weight[j] +  
							" and he is "+height[j]+" cm tall. He is a "+job[j] +"."+"He is under-aged.He has average grade "+allgrade[j]/4);
						System.out.println();
				}
			}else {
				if(sex[j]=='M') {
					System.out.println(Fname[j]+" "+Lname[j] + " is " +(2019-DateOfBirth[j])+ " years old. His weight is " + weight[j] +  
						" and he is "+height[j]+" cm tall. He is a "+job[j] +".His average grade is"+allgrade[j]/4);
					System.out.println();
				}else {
					System.out.println(Fname[j]+" "+Lname[j] + " is " +(2019-DateOfBirth[j])+ " years old. Her weight is " + weight[j] +  
							" and she is "+height[j]+" cm tall. She is a "+job[j] +".Her average grade is"+allgrade[j]/4);
						System.out.println();
				}
			}
		}
	}
}
