

 class Employee {

	 int ID;
	 String Name;
	 double Salary;
	 
	 Employee()//default constructor
	 {

	 System.out.println(" Employee Default Constructor Called");
	 this.ID =102;
	 this.Name = "Vijeta";
	 this.Salary= 50500;


	 }

	 Employee(int I, String N, double S)//Parameterizedconstructor
	 {

	 System.out.println(" Emp Parameterized Constructor Called");
	 this.ID =I;
	 this.Name = N;
	 this.Salary= S;


	 }
	 void setID(int I){
	  	this.ID = I;

	 }
	 void setName(String N)
	 { 
	 	this.Name= N;
	 }
	 void setSalary(double D){
	  	this.Salary = D;
	 }
	 int getID(){
	 	return this.ID;
	 }
	 String getName(){
	 	return this.Name;
	 }
	 double getSalary(){
	 	return this.Salary;
	 }
	 
	 double CalSal() {
		 
		 return this.Salary;
		 
		 
	 }
	 void Display(){
	 	System.out.println("ID is:"+this.ID);
	 	System.out.println("Name is:"+this.Name);
	 	System.out.println("Salary is:"+this.Salary);
	 }

}//Employee Ends Here
 class Admin extends Employee{ //step 1 is-a

	 double Allowance;

	 Admin(){
	 	 
	 
	 super();//step 3a
	 this.ID =101;
	 this.Name = "Krutika";
	 this.Salary= 50000;
	 this.Allowance=500;
	 System.out.println(" Admin Default Constructor Called");


	 }
	 Admin(int I, String N, double S, double A)//Parameterizedconstructor
	 {
	 super(I,N,S);//step 3b
	 System.out.println(" Admin Parameterized Constructor Called");
	 //System.out.println(" --Deatils Of Admin--");
	 this.ID =I;
	 this.Name = N;
	 this.Salary= S;
	 this.Allowance = A;

	 }


	 void SetAllowance(double A){
	 	this.Allowance = A;
	 }
	 double getAllowance()
	 {
	 	return this.Allowance;
	 }
	 
 double CalSal() {
		 
		 return this.Salary + this.Allowance;
		 
		 
	 }
	 void Display(){
		super.Display();//step4
	 	System.out.println("Salary is:"+this.Allowance);

	 }

	 
	 
	 
 }//Admin ends here
class HR extends Employee{
	
double Commission;
	HR()//default constructor
	{
		super();//step 3a
	this.ID =101;
	this.Name = "Vijeta";
	this.Salary= 45000;
	this.Commission=6000;
	System.out.println(" HR Default Constructor Called");


	}

	HR(int I, String N, double S,double C)//Parameterizedconstructor
	{
		super(I,N,S);//step 3b
	System.out.println("HR  Parameterized Constructor Called");
	//System.out.println(" --Deatils Of HR--");

	this.ID =I;
	this.Name = N;
	this.Salary= S;
	this.Commission=C;


	}


	void SetCommission(double C){
		this.Commission = C;
	}
	double getCommission()
	{
		return this.Commission;
	}
	
	double CalSal() {
		 
		 return this.Salary + this.Commission;
		 
		 
	 }
	void Display()
	{
		super.Display();//step 4
	 	System.out.println("Commision is:"+this.Commission);
	}

	
}//HR ensd here

class SalesManager extends Employee{//step 1 is a
	
	double Incentive;
	double Target;

	SalesManager(){
	super();//step 3a

	
	this.ID =101;
	this.Name = "Krutika";
	this.Salary= 50000;
	this.Incentive=500;
	this.Target = 400;
	System.out.println(" SalesManager Default Constructor Called");


	}

	SalesManager(int I, String N,double S, double IN, double T)//Parameterizedconstructor
	{
     super(I,N,S);
	System.out.println("SalesManager Parameterized Constructor Called");
	//System.out.println(" --Deatils Of SalesManager--");

	this.ID =I;
	this.Name = N;
	this.Salary= S;
	this.Incentive = IN;
	this.Target=T;
	}

	void SetIncentive(double IN){
		this.Incentive = IN;
	}
	void SetTarget(double T){
		this.Target = T;
	}

	double getIncentive(){
		return this.Incentive;
	}
	double getTarget(){
		return this.Target;
	}
	
	
	double CalSal() {
		 
		 return this.Salary + this.Incentive;
		 
		 
	 }
	void Display()
	{
		super.Display();
		System.out.println("Insenctive is"+this.Incentive);
		System.out.println("Target is:"+this.Target);
	}
	
	
}//SalesManager Ends Here


class Test{
	
	public static void main(String[]args) {
		
	  Employee E1;
	E1 = new Employee(101,"Sachin", 20000);
		E1.Display();
		System.out.println("Total Calculated Salry:"+E1.CalSal());
	E1 = new Admin(102,"Rahul", 230000,200);
		E1.Display();
		System.out.println("Total Calculated Salry:"+E1.CalSal());
	E1 = new HR(103,"Virat", 50000,400);
		E1.Display();
	System.out.println("Total Calculated Salry:"+E1.CalSal());
	E1 = new SalesManager(104,"Rohit", 40000,400,90);
		E1.Display();
		System.out.println("Total Calculated Salry:"+E1.CalSal());
		
	}//main ends here
	
	
	
}//Test End Here
