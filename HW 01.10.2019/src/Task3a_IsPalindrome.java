import java.util.*;

public class Task3a_IsPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String input = sc.nextLine(); 
        sc.close();
        StringBuilder input1 = new StringBuilder(); 
        input1.append(input);
        input1=input1.reverse();
        
        String input2=new String(input1); 
        
        System.out.println(input1);
        
        if(input2.equals(input)) System.out.println(true); 
        else System.out.println(false); 
	
	
	
	
	
	
	}
}
