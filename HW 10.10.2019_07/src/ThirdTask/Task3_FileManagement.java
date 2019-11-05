package ThirdTask;

import java.util.Scanner;

public class Task3_FileManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st;
		String[] s;
		File f;
		String[] creation= {"5","5","2011"};
		String resources="";
		do {
			st=sc.nextLine();
			s=st.split("\\s+");
			
			if(st.equals("END")) {
				sc.close();
				break;
			}
			
			if(s[0].equals("MAKE")) {
				if(st.contains("CONTENT")) {
					if(s[1].contains(".mp3")||s[1].contains(".avi")) {
						f=new MediaContentFile(s[1],s[2],creation,s[3]);
					}else {
						f=new DocumentContentFile(s[1],s[2],creation,s[3]);
					}
				}else {
					for(int i=3;i<s.length;i++) {
						if(i==3)
						resources=s[i];
						else resources=resources+" "+s[i];
					}
					f=new ExecutableFile(s[1],s[2],creation,resources);
				}
			}else if(s[0].equals("MOVE")) {
				f=File.getFilefromC(s[1], 0);
				if(f==null) {
					f=File.getFilefromD(s[1], 0);
					f.move(s[2]);
					continue;
				}
				f.move(s[2]);
			}else if(s[0].equals("MOD")){
				f=File.getFilefromC(s[1], 0);
				if(f==null) {
					f=File.getFilefromD(s[1], 0);
					((ContentFile)f).modify(s[2]);
					continue;
				}
				((ContentFile)f).modify(s[2]);
			}else if(s[0].equals("COPY")) {
				f=File.getFilefromC(s[1], 0);
				if(f==null) {
					f=File.getFilefromD(s[1], 0);
					f.copy(s[2]);                                 /*MAKE ozzy.mp3 D:\music\ CONTENT=010101111101010111
MAKE acdc.mp3 D:\music\ CONTENT=110101111101010111
MAKE acdc2.mp3 C:\music\ CONTENT=110101111101010111
MAKE ozzy2.mp3 C:\music\ CONTENT=010101111101010111   COPY ozzy.mp3 C:\music\
MAKE exefile.exe C:\music\ ozzy2.mp3 acdc2.mp3

MAKE exefile2.exe D:\music\ ozzy.mp3 acdc.mp3
EXE exefile2.exe*/
					continue;
				}
				f.copy(s[2]);
			}else if(s[0].equals("DEL")) {
				f=File.getFilefromC(s[1], 0);
				if(f==null) {
					f=File.getFilefromD(s[1], 0);
					f.setToisDeleted();
					continue;
				}
				f.setToisDeleted();
			}else if(s[0].equals("EXE")) {
				f=File.getFilefromC(s[1], 0);
				if(f==null) {
					f=File.getFilefromD(s[1], 0);
				//	if(f.getClass().toString().equals("ExecutableFile")) {
						((ExecutableFile)f).execute();
					//}
					//continue;
				}
			}else if(s[0].equals("INFO")) {
				f=File.getFilefromC(s[1], 0);
				if(f==null) {
					f=File.getFilefromD(s[1], 0);
					System.out.println(f.toString());
					continue;
				}
				System.out.println(f.toString());
			}
			
		}while(true);
	}
}
