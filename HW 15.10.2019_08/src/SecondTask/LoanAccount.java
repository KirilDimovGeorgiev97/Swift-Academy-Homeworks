package SecondTask;

public class LoanAccount extends Account {

	protected LoanAccount(String typeOfowner,float balance,String name,float montlyInterestRate) {
		super(typeOfowner,balance,name,montlyInterestRate);
	}

	@Override
	protected void calInrest(int n) {
		if(this.typeOfowner()==1 && n>3) System.out.println(this.getMontlyInrestRate()/100*this.getBalance()*(n-3));
		else 
			if(n>2) System.out.println(this.getMontlyInrestRate()/100*this.getBalance()*(n-2));
	}
	
}
