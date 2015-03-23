package hw113;

import java.util.Date;

public class Account {
	//data field
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//no-arg constructor
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	//A constructor that creates an account with the specified id and initial balance.
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	} 
	
	//The accessor and mutator methods
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	} 
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	//A method named getMonthlyInterestRate() that returns the monthly interest rate.
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	
	//A method named getMonthlyInterest() that returns the monthly interest.
	public double getMonthlyInterest(){
		return (balance * annualInterestRate / 1200);
	}
	//A method named withdraw that withdraws a specified amount from the account.
	public void withdraw(double money){
		balance -= money;
	}
	
	//A method named deposit that deposits a specified amount to the account.
	public void deposit(double money){
		balance += money;
	}
	
	@Override
	public String toString(){
		return ("The Account id is "+id+"\nThe balance is "+balance+"\nThe annual interest rate is "+annualInterestRate+"%\nIt created at "+dateCreated);
	}
}
