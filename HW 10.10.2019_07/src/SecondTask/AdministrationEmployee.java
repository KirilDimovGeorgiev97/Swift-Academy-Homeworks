package SecondTask;

import java.util.ArrayList;
import java.util.List;

public class AdministrationEmployee extends Employee {
	private String[] asubjects=new String[20];
	
	protected AdministrationEmployee(String name, int telenumber,String[] asubjects) {
		super(name, telenumber);
		this.setAsubjects(asubjects);
		add(this);
	}
	
	protected void setAsubjects(String[] a) {
		for(int i=0;i<20;i++) {
			this.asubjects[i]=a[i];
		}
	}

	@Override
	protected void work() {
		someOneWorks(this.getClass());
		
	}


}
