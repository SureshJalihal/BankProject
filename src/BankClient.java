
public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount("MahadevParsekar", 1245368,2000);
		SavingAccount s=new SavingAccount("M",95682456,30000);
		CurrentAccount c = new CurrentAccount("Sahliha Shaikh", 985668, 1000,5000);
		//if a constructor of the superclass is not defined we can use the default constructor super() or can ignore using altpgether
		
		b.deposit(1000);
		b.withdraw(2000);
		s.deposit(2000);
		b.withdraw(2000);
		s.setInterestofBalance();
		b.printStatement();  
		s.printStatement();
		c.withdraw(4000);
		c.printStatement();
		c.deposit(13000);
		c.printStatement();
		//polymorphism
		b=c;// works because current account is inherited from bank 
		b=s; //works because saving account is inherited from bank 

		//c=b; this do not work because the current account is inherited from bank and not vice versa,hence it is giving type mismatch

		//c=s; because they are two separate entities derived from same class but are still different than each other

		//s=c; this do not work because the saving account is inherited from bank and not vice versa,hence it is giving type mismatch
		
	}

}
//operations performed till date
/*BankAccount newaccount=new 
BankAccount secondAccount=new BankAccount("Sahliha", 12345679, 3000);
newaccount.deposit(200);
newaccount.withdraw(200);
newaccount.printStatement();
secondAccount.printStatement();
secondAccount.withdraw(3000);
secondAccount.transfer(newaccount, 1000);
newaccount.printStatement();
secondAccount.printStatement();
SavingAccount newSaving=new SavingAccount("Mahadev",95682456,30000);
newSaving.setInterestofBalance();
newSaving.printStatement();
CurrentAccount newCurrentAccount = new CurrentAccount("Deepa Nair", 895647, 1000);
newCurrentAccount.withdraw(4000);
newCurrentAccount.printStatement();
newCurrentAccount.deposit(13000);
newCurrentAccount.printStatement();*/