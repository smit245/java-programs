/*Create a class “Account” containing accountNo, and balance as an instance variable. 
Derive the Account class into two classes named “Savings” and “Current”. The 
“Savings” class should contain instance variable named interestRate, and the “Current” 
class should contain instance variable called overdraftLimit. Define appropriate 
methods for all the classes to enable functionalities to check balance, deposit, and 
withdraw amount in Savings and Current account. 
[Ensure that the Account class cannot be instantiated. You can not create object of Account but make reference]*/

import java.util.Scanner;
class BalanceException extends Exception{
    BalanceException(String s){
        super(s);
    }
}
abstract class Account{ //abstract class
	private static int count=0;
    private int accountNo;
	protected double balance;
	{
		count++;
	}
	public Account(double bal){			
		balance=bal;
		accountNo=count;
	}
	public double checkbalance(){
		return balance;
	}
	public void display(){
		System.out.println("Account No.      :- "+accountNo);
   		System.out.println("Balance          :- "+balance);		
	}
	public void deposit(double amount){
		balance=balance+amount;
		System.out.println("Deposit Successful");
	}
	abstract public void withdraw(double amount); //abstract method
}

class Savings extends Account{
	private float interestRate;
	public Savings(float interestRate,double bal){
		super(bal);
		this.interestRate=interestRate;
	}
	
	public void withdraw(double amount){
   		try{
   		    if(balance>amount){	
		        balance=balance-amount;
			System.out.println("Withdraw Successful");
		    }
		    else{
                throw new BalanceException("Your Balance is lower then your withdrawal amount"); //throwing exception that balance is low
		    }
		}catch(BalanceException b){
		    System.out.println("Error Occoured");				    
		    System.out.println(b);
	    }
		
	}
	public void display(){  //overriding abstract method which must be done
		super.display();
		System.out.println("Interst Rate     :- "+interestRate);		

	}
}
class Current extends Account{
	private double overdraftLimit;
	public Current(double overdraftLimit,double bal){
		super(bal);
		this.overdraftLimit=overdraftLimit;
	}

	
	public void withdraw(double amount){
			try{
			    if((overdraftLimit+balance)>=amount){
				    balance=balance-amount;
				    System.out.println("Withdraw Successful");
			    }   
			    else{
			    	throw new BalanceException("Your account balance + overdraft limit is lower then your withdrawal amount"); //throwing exception that balance is low
			    }
			}catch(BalanceException b){
		        System.out.println("Error Occoured");				    
		        System.out.println(b);
	        }
	 }
	
	public void display(){ //overriding abstract method which must be done
		super.display();
		System.out.println("Overdraft Limit     :- "+overdraftLimit);	
	}	
}
public class Q9{
	public static void main(String a[]){
		double temp;
		int ch;
		Scanner sc=new Scanner(System.in);
		Account ac=null;
		
		System.out.println("1. Current Account.");
		System.out.println("2. Savings Account.");
        System.out.println("Which account do you want to make.:-");
		ch=sc.nextInt(); 
		if(ch==1){
            ac=new Current(30000,0);
		}else if( ch ==2){
		    ac=new Savings(6.5f,0);
		}else{
            System.out.println("Wrong input program will be aborted.");
            System.exit(0);
        }
		
		do{
			
			System.out.println("1. check balance.");
			System.out.println("2. Deposite.");
			System.out.println("3. Withdraw.");
			System.out.println("4. Display details");
			System.out.println("5. Exit.");
			System.out.println("Enter your choice:- ");
			ch=sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Your Balance:- "+ac.checkbalance());
				break;
				case 2:
					System.out.println("Enter amount:- ");
					temp=sc.nextInt();
					ac.deposit(temp);	
				break;
				case 3:
					System.out.println("Enter amount:- ");
					temp=sc.nextInt();
					ac.withdraw(temp);
					
				break;
				case 4:
					ac.display();
				break;
				case 5:
					System.exit(0);
				break;
				default:
					System.out.println("Wrong Input");
				break;
			}
		}while(ch!=5);
        sc.close();	
	}
}