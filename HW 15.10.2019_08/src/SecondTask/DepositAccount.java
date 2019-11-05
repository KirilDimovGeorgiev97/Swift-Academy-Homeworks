package SecondTask;

public class DepositAccount extends Account {

	protected DepositAccount(String typeOfowner,float balance ,String name,float montlyInterestRate) {
		super(typeOfowner,balance,name,montlyInterestRate);
	}
	
	
	
	@Override
	protected void calInrest(int n) {
		System.out.println(this.getMontlyInrestRate()+" RATE ");
		System.out.println(this.getBalance()+" balance ");
		System.out.println(this.getMontlyInrestRate()/100*this.getBalance()*n);
	}
	
	
	
}
