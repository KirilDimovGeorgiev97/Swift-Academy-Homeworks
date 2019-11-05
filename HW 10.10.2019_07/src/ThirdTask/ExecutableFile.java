package ThirdTask;

import java.time.LocalDate;

public class ExecutableFile extends File{
	private LocalDate lastExecutionDate;
	private String requiredResources;

	protected ExecutableFile(String name, String location, String[] creationDate,String requiredResources) {
		super(name, location, creationDate);
		//String[] lastExecutionDate
		//this.lastExecutionDate=LocalDate.of(Integer.parseInt(lastExecutionDate[2]),
			//	Integer.parseInt(lastExecutionDate[1]), Integer.parseInt(lastExecutionDate[0]));
		this.requiredResources=requiredResources;
	}
	
	protected LocalDate getlastExecution() {
		return this.lastExecutionDate;
	}
	
	protected void setExecution() {
		this.lastExecutionDate=LocalDate.now();
	}
	
	protected ExecutableFile(ExecutableFile ef,String newLocation) {
		super(ef.getName()+"copy",newLocation,ef.getStringfromDate(LocalDate.now()));
		this.requiredResources=ef.requiredResources;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.getName()+"\n "+"Location"+this.getLocation()+"\n"+"Creation date: "+this.getCreationDate()+"\n"
	+"Last execution:"+this.getlastExecution().toString();
	}
	
	protected void execute() {
		System.out.println("Execute "+this.getName());
		String[] resources=this.requiredResources.split("\\s+");
		System.out.println(this.requiredResources);
		File f;
		this.setExecution();
		if(this.getLocation().contains("D")) {
			for(int i=0;i<resources.length;i++) {
				f=File.getFilefromD(resources[i], 0);
				if(f==null) continue;
				else {
					if(f.getClass().toString().equals("MediaContentFile")) {
						System.out.println("\266B "+ f.getName());
						System.out.println(((ContentFile) f).getContent());
					}else { 
						System.out.println("\2713 "+ f.getName());
						System.out.println(((ContentFile) f).getContent());
					}
				}
			}
		}else {
			for(int i=0;i<resources.length;i++) {
				f=File.getFilefromC(resources[i], 0);
				if(f==null) continue;
				else {
					if(f.getClass().toString().equals("MediaContentFile")) {
						System.out.println("\266B "+ f.getName());
						System.out.println(((ContentFile) f).getContent());
					}else {
						System.out.println("\2713 "+ f.getName());
						System.out.println(((ContentFile) f).getContent());
					}
				}
			}
		}
	}
}
