package SecondTask;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee {
	private String[] tsubjects=new String[20];
	
	protected Teacher(String name, int telenumber,String[] tsubjects) {
		super(name, telenumber);
		this.setTsubjects(tsubjects);
		add(this);
	}
	
	protected void setTsubjects(String[] a) {
		for(int i=0;i<20;i++) {
			this.tsubjects[i]=a[i];
		}
	}

	@Override
	protected void work() {
		someOneWorks(this.getClass());
		
	}
	
	
}
