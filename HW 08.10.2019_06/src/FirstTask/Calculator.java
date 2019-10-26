package FirstTask;

public class Calculator {
	
	
	protected static float sum(String a, String b) {
		return Float.parseFloat(a)+Float.parseFloat(b);
	}
	
	protected static float subtract(String a, String b) {
		return Float.parseFloat(a)-Float.parseFloat(b);
	}
	
	protected static float multiply(String a, String b){
		return Float.parseFloat(a)*Float.parseFloat(b);
	}
	
	protected static float divide(String a, String b){
		return Float.parseFloat(a)/Float.parseFloat(b);
	}
	protected static float percentage(String a, String b){
		return Float.parseFloat(a)%Float.parseFloat(b);
	}
}
