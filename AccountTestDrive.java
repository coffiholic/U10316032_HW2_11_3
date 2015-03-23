package hw113;

public class AccountTestDrive {
	public static void main(String[] args){
		Account member = new Account();
		SavingsAccount save = new SavingsAccount();
		CheckingAccount check = new CheckingAccount();
		System.out.println(member.toString()+"\n\n"+save.toString()+"\n\n"+check.toString());
	}
}
