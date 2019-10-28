package Exercise;

public class Discipline {
	private String name;
	private int numberOfhours;
	
	protected Discipline(String name) {
		this.name=name;
	}
	
	protected void setNumberOfHours(int numberOfhours) {
		this.numberOfhours=numberOfhours;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.numberOfhours;
	}
}
