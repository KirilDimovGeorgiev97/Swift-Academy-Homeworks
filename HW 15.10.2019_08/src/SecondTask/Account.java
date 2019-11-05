package SecondTask;


public abstract class Account {

	private int IBAN;
	private float balance;
	private float montlyInterestRate;
	private Customer c;
	private static int counter=0;
	
	
	protected Account(String typeOfowner,float balance,String name,float montlyInterestRate) {
		this.balance=balance;
		this.IBAN=hashCode();
		this.montlyInterestRate=montlyInterestRate;
		if(typeOfowner.equals("1")) c=new IndividualCustomer(name);
		else c=new CompanyCustomer(name);
	}
	
	@Override
	public int hashCode() {
		int result=10000000+counter;
		counter++;
		return result;
	}
	

	protected int typeOfowner() {
		if(c instanceof IndividualCustomer) return 1;
		else return 2;
	}
	
	protected int getIBAN() {
		return this.IBAN;
	}
	
	protected Integer sIBAN() {
		return new Integer(this.getIBAN());
	}
	
	protected float getBalance() {
		return this.balance;
	}
	
	protected void setBalance(float f) {
		this.balance+=f;
	}
	
	protected float getMontlyInrestRate() {
		return this.montlyInterestRate;
	}
	
	protected <T> void withdraw(T t,float amount) {
		if(t instanceof DepositAccount && amount<=this.balance) {
			this.balance-=amount;
			//System.out.println("uspeshno");
		}
		else return;
		}
	
	protected void deposit(float amount) {
		this.balance+=amount;
	}
	
	protected abstract void calInrest(int n);
	
	
		

}
	