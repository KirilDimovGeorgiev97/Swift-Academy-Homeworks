import java.util.Scanner;

public class Task3b_PrintLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String input = sc.nextLine(); 
        char[] word=input.toCharArray();
        
		int[][] letters = new int[word.length][2];
		int row=0;
	
		boolean boo=false;
		for(int i=0;i<word.length;i++) {
			for(int z=0;z<row;z++) {
				if(letters[z][0]==(int)(word[i])) {
					boo=true;
					break;
				}
			}
			if(boo==true) {
				boo=false;
				continue;
			}
			letters[row][0]=(int)(word[i]);
			letters[row][1]=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i]==word[j]) {
					letters[row][1]++;
				}
			}
			row++;
		}
		for(int j=0;j<row;j++) {
			System.out.println((char)(letters[j][0])+"("+letters[j][1]+")");
		}
	}
}
