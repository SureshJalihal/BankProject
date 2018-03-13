
public class BankAccount {
	private static final int MINBAL = 1000;
	int Balance;
	String Customer;
	int AcountNumber;
	//Bank Creates a new account
	public BankAccount(String customer, int acountNumber,int balance) {
		super();
			this.deposit(balance);;
			this.Customer=customer;
			this.AcountNumber=acountNumber;
		
	}
	public int getBalance() {
		return this.Balance;
	}
	public void deposit(int balance){
		this.Balance=this.Balance+balance;
		//this.setBalance(this.getBalance()+balance);
	}
	public void transfer(BankAccount account, int amount){
		if(this.withdraw(amount)==true){
			int gst=amount*5/100;
			account.deposit(amount-gst);
		}else{
			System.out.println("Error: cannot Transfer amount as The minimum balance is not present in "+this.AcountNumber+"\nCurrent Balance: "+this.Balance);
		}
	}
	public boolean withdraw(int amount){
		if(this.getBalance()-amount<MINBAL){
			System.out.println("Error: Cannot Withdraw. Exceed Minimum Balance required. Account Name: "+this.Customer+"\nCurrent Balance: "+this.Balance);
			return false;
		}
		this.setBalance(this.getBalance()-amount);
		return true;
		
	}
	public void printStatement(){
		System.out.println("\nAccount Number: "+this.AcountNumber+"\nAccount Name: "+this.Customer+"\nBalance: "+this.getBalance());
	}
	private void setBalance(int balance) {
		this.Balance = balance;
	}

}
