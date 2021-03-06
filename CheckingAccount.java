package hw113;

public class CheckingAccount extends Account{
	private double overDrift;
	
	public void setOverDrift(double overDrift){
		this.overDrift = overDrift;
	}
	
	@Override
	public void withdraw(double coin){
		//sure the coin won't over the balance 
		if(coin <= super.getBalance()){
			super.withdraw(coin);
		}else {
			System.out.println("Error!\nOverdrawn.");
		}
	}
	@Override
	public String toString(){
		return("Welcome to the bank of Holic.\n"+super.toString());
	}
}
