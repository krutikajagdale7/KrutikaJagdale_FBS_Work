
import java.time.LocalDate;
import java.time.Period;

class BankAccount {

	 int accountNumber;
	 String accountHolderName;
	 double currentBalance;
	
	 BankAccount(){

	 System.out.println(" Bank Acc Default Constructor Called");

	 this.accountNumber =981;
	 this.accountHolderName = "Krutika";
	 this.currentBalance = 7000;
	 //this.interstRate =8.5;

	 }

	 BankAccount(int AN, String str, double CB){

	 System.out.println(" Bank Acc Parameterized Constructor Called");

	 this.accountNumber = AN;
	 this.accountHolderName = str;
	 this.currentBalance = CB;
	 //this.interstRate = IR;

	 }
	 void SetAccountNumber(int AN){
	 	this.accountNumber =AN;
	 }
	 void SetAccountHolderName(String str){
	 this.accountHolderName=str;

	 }
	 void SetCurrentBalance(double CB){
	 this.currentBalance=CB;
	 }


	 int getAccountNumber()
	 {
	 return this.accountNumber;

	 }
	 String getAccountHolderName()
	 {
	 return this.accountHolderName;

	 }
	 double getCurrentBalance()
	 {
	 return this.currentBalance;

	 }



	 void Display(){
	 	System.out.println("AccNO is:"+this.accountNumber);
	 	System.out.println("acc holder Name is:"+this.accountHolderName);
	 	System.out.println("current balance is:"+this.currentBalance);
	 	

	 }
	 
	 
	 void withdraw(double amount) {
	        
	        if (amount <= currentBalance) {
	            currentBalance = amount -currentBalance;
	            System.out.println("*Withdrawn:" + amount);
	        } else {
	            System.out.println("*Insufficient balance");
	        }
	        System.out.println("*Updated Balance: " + currentBalance);
	    }
		 
		 
		 
	 
}//BankAccount End Here
 class CurrentAccount extends BankAccount{
	 double OverdraftLimit;
	 CurrentAccount()
	 {

		 super();
		 System.out.println(" current Acc Default Constructor Called");
		 
		 this.accountNumber = 123;
		 this.accountHolderName = "Krutika";
		 this.currentBalance = 700;
		 this.OverdraftLimit = 560.0;

		 
	 }	 
	 CurrentAccount(int AN, String AHN, double CB,double OL)
	 {
		 super(AN,AHN,CB);
		 System.out.println(" current Acc Parameterized Constructor Called");
		 this.accountNumber = AN;
		 this.accountHolderName = AHN;
		 this.currentBalance = CB;
		 this.OverdraftLimit = OL;
	 }	 
	 
	 
	 public double getOverdraftLimit() {
		return OverdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		OverdraftLimit = overdraftLimit;
	}
	
	void withdraw(double amount) {
        
        if (amount <= currentBalance + OverdraftLimit) {
            currentBalance = amount -currentBalance ;
            System.out.println("*Withdrawal successful Amount: " + amount);
        } else {
            System.out.println("*Withdrawal denied Exceeds overdraft limit.");
        }
        System.out.println("*Updated Balance: " + currentBalance);
    }
	void Display(){
			super.Display();
		 	System.out.println("OverdraftLimit is:"+this.OverdraftLimit);
		 	

		 }
 }
class SavingAccount extends BankAccount{
	double intrest;
	double MIN_BALANCE = 500.0;
	SavingAccount()
	 {
		 super();
		 System.out.println(" SavingAccount Default Constructor Called");
		 this.accountNumber = 345;
		 this.accountHolderName = "Nikita";
		 this.currentBalance = 900;
		 this.intrest = 7.8;
		 
		 
	 }	 
	SavingAccount(int AN, String AHN, double CB, double I)
	 {
		 super(AN,AHN,CB);
		 System.out.println(" SavingAccount Parameterized Constructor Called");
		 this.accountNumber = AN;
		 this.accountHolderName =AHN;
		 this.currentBalance = CB;
		 this.intrest = I;
		 
		 
	 }
	public double getIntrest() {
		return intrest;
	}
	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
	
	
	void withdraw(double amount) {
        
        if (currentBalance - amount >= MIN_BALANCE) {
            currentBalance -= amount;
            System.out.println("*Withdrawal successful! Amount: " + amount);
        } else {
            System.out.println("*Withdrawal denied! Minimum balance of " + MIN_BALANCE + " required.");
        }
        System.out.println("*Updated Balance: " + currentBalance);
    }
		
		
		
	
	void Display(){
		super.Display();
	 	System.out.println("intrest is:"+this.intrest);
	 	
	 	

	 }
	
}
class SalaryAccount extends BankAccount{
	LocalDate lastTransactionDate;
	
	SalaryAccount() {
        super();
        this.lastTransactionDate = LocalDate.now().minusMonths(1);
        System.out.println("SalaryAccount Default Constructor Called");
    }

    SalaryAccount(int AN, String AHN, double CB, LocalDate LTD) {
        super(AN, AHN, CB);
        this.lastTransactionDate = LTD;
        System.out.println("SalaryAccount Parameterized Constructor Called");
    }

	public LocalDate getLastTransactionDate() {
		return lastTransactionDate;
	}

	public void setLastTransactionDate(LocalDate lastTransactionDate) {
		this.lastTransactionDate = lastTransactionDate;
	}
void Display() {
	
	super.Display();
 	System.out.println("lastTransactionDate is:"+this.lastTransactionDate);
	
	
}
void withdraw(double amount) {
    LocalDate today = LocalDate.now();
    Period diff = Period.between(lastTransactionDate, today);

    if (diff.getMonths() >= 2) {
        System.out.println(" *Transaction denied! Last transaction was over 2 months ago.*");
    } else if (amount <= currentBalance) {
        currentBalance = amount - currentBalance;
        lastTransactionDate = today; 
        System.out.println(" **Withdrawal successful  New balance: " + currentBalance);
    } else {
        System.out.println(" *Insufficient balance*");
    }
}
	
	
}//salary account end here
class Test3{
	
	public static void main(String[] args) {
		
		
		BankAccount B1 = new BankAccount(222,"ABC",600);
		B1.Display();
		B1.withdraw(900);
		B1 = new CurrentAccount(333, "XYZ",400,700.0);
		B1.Display();
		B1.withdraw(9000);
		B1 = new SavingAccount(444,"PQR",500,7.6);
		B1.Display();
		B1.withdraw(90000);
		
		B1 = new SalaryAccount(444,"PQR",500,LocalDate.parse("2025-08-10"));
		B1.Display();
		B1.withdraw(9000);
		
		
//		BankAccount B1 = new BankAccount();
//		B1.Display();
//		BankAccount B2 = new BankAccount(222,"ABC",600);
//		B2.Display();
//		
//		CurrentAccount C1 = new CurrentAccount();
//		C1.Display();
//		CurrentAccount C2 = new CurrentAccount(333, "XYZ",400,700.0);
//		C2.Display();
//		
//	    SavingAccount  S1 = new SavingAccount();
//		S1.Display();
//		SavingAccount S2 = new SavingAccount(444,"PQR",500,7.6);
//		S2.Display();
		
	}//main end here
	
	
}//test end here

