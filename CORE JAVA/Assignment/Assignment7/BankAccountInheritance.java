
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
 }
class SavingAccount extends BankAccount{
	double intrest;
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
	
}
class Test{
	
	public static void main(String[] args) {
		BankAccount B1 = new BankAccount();
		B1.Display();
		BankAccount B2 = new BankAccount(222,"ABC",600);
		B2.Display();
		
		CurrentAccount C1 = new CurrentAccount();
		C1.Display();
		CurrentAccount C2 = new CurrentAccount(333, "XYZ",400,700.0);
		C2.Display();
		
	    SavingAccount  S1 = new SavingAccount();
		S1.Display();
		SavingAccount S2 = new SavingAccount(444,"PQR",500,7.6);
		S2.Display();
		
	}//main end here
	
	
}//test end here

