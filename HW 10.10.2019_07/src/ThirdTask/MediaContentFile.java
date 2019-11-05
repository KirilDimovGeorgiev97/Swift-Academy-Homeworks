package ThirdTask;

import java.time.LocalDate;

public class MediaContentFile extends ContentFile {

	protected MediaContentFile(String name, String location, String[] creationDate, String content) {
		super(name, location, creationDate, content);
		// TODO Auto-generated constructor stub
	}
	
	protected MediaContentFile(MediaContentFile ef,String newLocation) {
		super(ef.getName()+"copy",newLocation,ef.getStringfromDate(LocalDate.now()),ef.getContent());
	}

	
	
}
