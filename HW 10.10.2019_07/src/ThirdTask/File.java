package ThirdTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class File {
	private String name;
	private String location;
	private LocalDate creationDate;
	private boolean isDeleted;
	
	private static  List<File> C = new ArrayList<>();
	private static List<File> D = new ArrayList<>();
	
	
	protected File(String name,String location,String[] creationDate) {
		this.name=name;
		this.location=location;
		this.creationDate=LocalDate.of(Integer.parseInt(creationDate[2]),Integer.parseInt(creationDate[1]), 
				Integer.parseInt(creationDate[0]));
		if(location.contains("D")) D.add(this);
		else C.add(this);
	}

	protected String getName() {
		return this.name;
	}
	
	protected String getLocation() {
		return this.location;
	}
	
	protected LocalDate getCreationDate() {
		return this.creationDate;
	}
	
	protected static File getFilefromD(String name,int a) {
		if(a==D.size()) return null; 
		if(D.get(a).getName().equals(name))
			return D.get(a);
		else return getFilefromD(name,a+1);
		
	}
	
	protected static File getFilefromC(String name,int a) {
		if(a==C.size()) return null; 
		
		if(C.get(a).getName().equals(name))
			return C.get(a);
		else return getFilefromC(name,a+1);
		
	}
	
	protected  void setToisDeleted() {
		this.isDeleted=true;
		this.delete();
	}
	
	
	protected String[] getStringfromDate(LocalDate d) {
		String [] date=new String[3];
		date[2]=Integer.toString((d.getYear()));
		date[1]=Integer.toString((d.getMonthValue()));
		date[0]=Integer.toString((d.getDayOfMonth()));
		return date;
	}
	
	protected void move(String newLocation) {
		if(newLocation.contains("D:")&&this.location.contains("D:")) {
			this.location=newLocation;
		}else if(newLocation.contains("C:")&&this.location.contains("C:")) {
			this.location=newLocation;
		}else if(newLocation.contains("D:")&&this.location.contains("C:")) {
			D.add(this);
			C.remove(this);
			this.location=newLocation;
		}else {
			C.add(this);
			D.remove(this);
			this.location=newLocation;
		}
	}
	
	protected void copy(String newLocation) {
		File f;
		if(this instanceof ExecutableFile) {
			if(newLocation.contains("D:")) {
				f=new ExecutableFile((ExecutableFile)this,newLocation);
				D.add(f);
				System.out.println("Copy-operation was made successfully");
				return;
			}else {
				f=new ExecutableFile((ExecutableFile)this,newLocation);
				C.add(f);
				System.out.println("Copy-operation was made successfully");
				return;
			}
		}else if(this instanceof MediaContentFile) {
			if(newLocation.contains("D:")) {
				f=new MediaContentFile((MediaContentFile)this,newLocation);
				D.add(f);
				System.out.println("Copy-operation was made successfully");
				return;
			}else {
				f=new MediaContentFile((MediaContentFile)this,newLocation);
				C.add(f);
				System.out.println("Copy-operation was made successfully");
				return;
			}
		}else {
			if(newLocation.contains("D:")) {
				f=new DocumentContentFile((DocumentContentFile)this,newLocation);
				D.add(f);
				System.out.println("Copy-operation was made successfully");
				return;
			}else {
				f=new DocumentContentFile((DocumentContentFile)this,newLocation);
				C.add(f);
				System.out.println("Copy-operation was made successfully");
				return;
			}
		}
	}
	
	protected void delete() {
		if(D.contains(this)) {
			D.remove(this);
			System.out.println("File is deleted with success");
			return;
		}else {
			C.remove(this);
			System.out.println("File is deleted with success");
			return;
		}
	}
	
	/*protected static void execute(String disk) {
		if(disk.equals("D"))
			for(File a:D) {
				if(a.getClass().toString()=="ExecutableFile") {
					System.out.println("Execute"+a.getName());
					((ExecutableFile)a).Execuresources("D");
				}else {
					
			}
		}
	}*/


	
	
	
}
