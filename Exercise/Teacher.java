package Exercise;

public class Teacher extends Person {
	private Discipline discipline;
	
	protected Teacher(String name,String disciplineName) {
		super(name);
		this.discipline=new Discipline(disciplineName);
	}
	
	protected Discipline getDiscipline() {
		return this.discipline;
	}
	
	protected void setDisciplineHours(int n) {
		this.getDiscipline().setNumberOfHours(n);
	}
	
	@Override
	public String toString() {
		return this.GetName()+" and is a teacher in "+this.discipline.toString();
	}
}
