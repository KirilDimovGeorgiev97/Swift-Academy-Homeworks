package ThirdTask;

import java.time.LocalDate;

public class DocumentContentFile extends ContentFile {

	protected DocumentContentFile(String name, String location, String[] creationDate, String content) {
		super(name, location, creationDate, content);
		// TODO Auto-generated constructor stub
	}

	
	protected DocumentContentFile(DocumentContentFile ef,String newLocation) {
		super(ef.getName()+"copy",newLocation,ef.getStringfromDate(LocalDate.now()),ef.getContent());
	}

	
	
}
