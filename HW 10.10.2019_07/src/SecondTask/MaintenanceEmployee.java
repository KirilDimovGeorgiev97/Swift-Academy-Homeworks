package SecondTask;

public class MaintenanceEmployee extends Employee{

	protected MaintenanceEmployee(String name, int telenumber) {
		super(name, telenumber);
		add(this);
	}

	@Override
	protected void work() {
		someOneWorks(this.getClass());
	}
	
	

}
