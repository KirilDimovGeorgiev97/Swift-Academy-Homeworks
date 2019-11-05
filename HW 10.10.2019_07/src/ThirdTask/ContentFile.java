package ThirdTask;

import java.time.LocalDate;

public class ContentFile extends File {
	private String content;
	private LocalDate lastModifiedDate;

	protected ContentFile(String name, String location, String[] creationDate,String content) {
		super(name, location, creationDate);
		this.content=content;
		//this.lastModifiedDate=LocalDate.of(Integer.parseInt(lastModifiedDate[2]),
				//Integer.parseInt(lastModifiedDate[1]), Integer.parseInt(lastModifiedDate[0]));
		this.lastModifiedDate=LocalDate.of(2015,
				8,31);
	}
	
	
	protected void modify(String content) {
		this.content=content;
		this.setModifiedDate();
	}
	
	protected void setModifiedDate() {
		String[] lastModifiedDate1=this.getStringfromDate(LocalDate.now());
		this.lastModifiedDate=LocalDate.of(Integer.parseInt(lastModifiedDate1[2]),
				Integer.parseInt(lastModifiedDate1[1]), Integer.parseInt(lastModifiedDate1[0]));
	}
	
	protected String getContent() {
		return this.content;
	}
	
	protected LocalDate getlastModifiedDate() {
		return this.lastModifiedDate;
	}


	@Override
	public String toString() {
		return "Name: "+this.getName()+"\n "+"Location: "+this.getLocation()+"\n"+"Creation date: "+this.getCreationDate()+"\n"
			+"Last modification: "+this.getlastModifiedDate().toString();
	}
	
	
}
