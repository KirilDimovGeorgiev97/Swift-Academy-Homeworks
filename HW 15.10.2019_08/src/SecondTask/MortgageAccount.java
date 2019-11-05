package SecondTask;

public class MortgageAccount extends Account {

	protected MortgageAccount(String typeOfowner,float balance,String name,float montlyInterestRate) {
		super(typeOfowner,balance, name,montlyInterestRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void calInrest(int n) {
		if(this.typeOfowner()==1 && n>6) System.out.println(this.getMontlyInrestRate()/100*this.getBalance()*(n-6));
		else 
			if(n>12) System.out.println(this.getMontlyInrestRate()/100*this.getBalance()/2 + this.getMontlyInrestRate()/100*this.getBalance()*(n-12));
			else System.out.println(this.getMontlyInrestRate()/100*this.getBalance()/2);
		
	}

}
