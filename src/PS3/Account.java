package PS3;

import java.util.Date;
public class Account {
	private int ID = 0;
	private double balance = 0.0;
	private double AnnualInterateRate = 0.0;
	Date dateCreated = new Date();
    
    public Account(int ID, double balance, double AnnualInterateRate)
    {
    	this.ID = ID;
    	this.balance = balance;
    	this.AnnualInterateRate = AnnualInterateRate;
    	}
    
    public int getID() {
    	return this.ID;
    }
    
    public void setID(int newID){
    	this.ID = newID;
    }
    
    public double getAnnualInterateRate(){
    	return this.AnnualInterateRate;
    }
    
    public void setAnnualInterateRate(double newAnnualInterateRate){
    	this.AnnualInterateRate = newAnnualInterateRate;
    }
    
    public double getbalance(){
    	return this.balance;
    }
    
    public void setbalance(double newbalance){
    	this.balance = newbalance;
    }
    
    public Date getdateCreated(){
    	return dateCreated;
    }
    
    public double getMouthlyInteratedRate(){
    	return AnnualInterateRate/12;
    }
    
    public void withdraw(double withdraw)throws 
	InsufficientFundsException{
    	if(balance >= withdraw){
    	balance -= withdraw;
    }
    	else{
    		double x = withdraw - balance;
    		System.out.println("You are short by " + x);
    		throw new InsufficientFundsException(x);
    	}
    }
    
    public void deposit(double deposite){
    	balance += deposite;
    }
    
    
} 