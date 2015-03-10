package PS3;
public class Test {
	public static void main(String[] arg) throws InsufficientFundsException{
		Account account = new Account(1122,20000,0.045);
		account.deposit(3000);
		account.withdraw(2500);
		
		System.out.println("Your balance in the account is " + account.getbalance());
		System.out.println("Your monthly interest is " + account.getMouthlyInteratedRate()*account.getbalance());
		System.out.println("The date of your account was created" + account.getdateCreated());
	}

}
