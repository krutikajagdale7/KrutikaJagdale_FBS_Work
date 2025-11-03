class HR{
int ID ;
String Name;
double Salary;
double Commission;
void SetID(int I){
	
	this.ID = I;
}
void SetName(String N){
	this.Name = N;
}
void SetSalary(double S){
	this.Salary = S;
}
void SetCommission(double C){
	this.Commission = C;
}
int getID()
{  return this.ID;
}
String getName()
{
	return this.Name;
}
double getSalary()
{ return this.Salary;
}
double getCommission()
{
	return this.Commission;
}
void Display()
{
	System.out.println("ID is:"+this.ID+"\nName is:"+this.Name+"\nSalary is:"+this.Salary+"\nCommision is:"+this.Commission);

}
}//HR ends here
class TestHR{
public static void main(String[]args){

	HR h1,h2;
	h1 = new HR();
	h2 = new HR();

	h1.SetID(101);
	h1.SetName("Vijeta");
	h1.SetSalary(45000);
	h1.SetCommission(6000);


	h2.SetID(102);
	h2.SetName("Majiri");
	h2.SetSalary(50000);
	h2.SetCommission(5000);
	System.out.println("\nHere h1 Object Start");

	h1.getID();
	h1.getName();
	h1.getSalary();
	h1.getCommission();
	h1.Display();

	System.out.println("-------------------------------------");

	System.out.println("\nHere h2 Object Start");
	h2.getID();
	h2.getName();
	h2.getSalary();
	h2.getCommission();
	h2.Display();


	//System.out.println("ID:"+h1.ID+"\nName:"+h1.Name+"\nSalary:"+h1.Salary+"\nCommision:"+h1.Commission);

	
}//main ends here
}//Test Ends Here

