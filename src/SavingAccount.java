
public class SavingAccount extends BankAccount {
	public SavingAccount(String customer, int acountNumber, int balance) {
		super(customer, acountNumber, balance);
		
		// TODO Auto-generated constructor stub
	}
	static double rateOfInterst=0.1; 
	
	public double getRateofInterest(){
		return rateOfInterst;
	}
	public double calculateInterset(){
		return this.getRateofInterest()*this.Balance;
	}
	public void setInterestofBalance(){
		this.Balance=(int) (this.Balance+this.calculateInterset());
	}
}
