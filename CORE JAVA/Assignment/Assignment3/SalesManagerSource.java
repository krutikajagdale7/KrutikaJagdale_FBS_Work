class SalesManager{
int ID ;
String Name;
double Salary;
double Incentive;
double Target;

SalesManager(){

System.out.println(" Default Constructor Called");
this.ID =101;
this.Name = "Krutika";
this.Salary= 50000;
this.Incentive=500;
this.Target = 400;


}

SalesManager(int I, String N,double S, double IN, double T)//Parameterizedconstructor
{

System.out.println(" Parameterized Constructor Called");
this.ID =I;
this.Name = N;
this.Salary= S;
this.Incentive = IN;
this.Target=T;
}

void SetID(int I){
	this.ID = I;
}
void SetName(String N){
	this.Name = N;
}
void SetSalary(double S){
	this.Salary = S;
}
void SetIncentive(double IN){
	this.Incentive = IN;
}
void SetTarget(double T){
	this.Target = T;
}
int getID(){
	return this.ID;
}
String getName()
{
	return this.Name;
}
double getSalary(){

	return this.Salary;
}
double getIncentive(){
	return this.Incentive;
}
double getTarget(){
	return this.Target;
}
void Display()
{
	System.out.println("ID is:"+this.ID+"\nName is:"+this.Name+"\nSalary is:"+this.Salary+"\nIncentive is:"+this.Incentive+"\nTarget"+this.Target);
}
}//SalesManager ends here
class TestSalesManager{
	 public static void main(String [] args){
		SalesManager S1,S2;
		S1 = new SalesManager();
		S2 = new SalesManager(101,"XXX",300000, 700, 200);
		S1.SetID(1001);
		S1.SetName("Nikita");
		S1.SetSalary(90000);
		S1.SetIncentive(5000);
		S1.SetTarget(400);

		S2.SetID(1002);
		S2.SetName("Vaishnavi");
		S2.SetSalary(80000);
		S2.SetIncentive(3000);
		S2.SetTarget(200);
		System.out.println("\nHere S1 Object Start ->");

		S1.getID();
		S1.getName();
		S1.getSalary();
		S1.getIncentive();
		S1.getTarget();
		S1.Display();

		System.out.println("-------------------------------------");
		System.out.println("\nHere S2 Object Start ->");
		S2.getID();
		S2.getName();
		S2.getSalary();
		S2.getIncentive();
		S2.getTarget();
		S2.Display();
		



	//System.out.println("ID:"+S1.ID+"\nName:"+S1.Name+"\nSalary:"+S1.Salary+"\nIncentive:"+S1.Incentive+"\nTarget:"+S1.Target);

		
}// main ends here

}//TestSalesManager ends Here