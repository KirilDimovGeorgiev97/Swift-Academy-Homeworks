import java.util.Scanner;

public class Task3c_CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String input = sc.nextLine(); 
        String function=sc.nextLine();
        char[] sentence=input.toCharArray();
        
        
        if(function.equals("decode")){
        	for(int i=0;i<sentence.length;i++) {
        		if(sentence[i]==' ')continue;
        		sentence[i]++;
        	}
        String result=new String(sentence);
        System.out.println(result);
        return;
        }
        if(function.equals("encode")){
        	for(int i=0;i<sentence.length;i++) {
        		if(sentence[i]==' ')continue;
        		sentence[i]--;
        	}
        String result=new String(sentence);
        System.out.println(result);
        }
	}

}
