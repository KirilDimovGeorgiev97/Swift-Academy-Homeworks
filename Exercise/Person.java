package Exercise;

public abstract class Person {
	private String name;

	protected Person(String name) {
		this.name=name;
	}
	
	protected String GetName() {
		return this.name;
	}
}
