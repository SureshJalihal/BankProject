
public class CurrentAccount extends BankAccount {

	public CurrentAccount(String customer, int acountNumber, int balance, int overdraft) {
		super(customer, acountNumber, balance);
		this.overdraft=overdraft;
		// TODO Auto-generated constructor stub
	}
	int overdraft=5000;
	@Override   //safety machanism to ensure that the function called is same as that of the superclass
	public boolean withdraw(int balance){
		if(this.Balance-balance>=-getOverdraft()){
			this.Balance=this.Balance-balance;
			return true;
		}else{
			System.out.println("Error: cannot Withdraw from Account exceeding overdraft");
		}
		return false;
	}
	public int getOverdraft(){
		return overdraft;
	}
}
