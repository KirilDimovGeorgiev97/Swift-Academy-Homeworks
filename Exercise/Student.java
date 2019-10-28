package Exercise;

public class Student extends Person {
	private int id;
	private int[] grades;
	private Discipline dis;
	
	protected Student(String name,int id,String nameOfDis) {
		super(name);
		this.id=id;
		this.dis=new Discipline(nameOfDis);
	}
	
	protected void setGrades(int n,int[] grades) { //setter
		this.grades=new int[n];
		for(int i=0;i<n;i++) {
			this.grades[i]=grades[i];
		}
	}
	
	
	protected int[] getGrades() { //getter
		return this.grades;
	}
	
	protected int averageGrades() {
		int sum=0;
		for(int i=0;i<this.grades.length;i++) {
			sum+=grades[i];
		}
		return sum/this.grades.length;
	}
	
	@Override
	public String toString() {
		return this.GetName()+" has an id-"+this.id+" and has a achievement: "+this.averageGrades();
	}

}
