class HR{
int ID ;
String Name;
double Salary;
double Commission;

HR()//default constructor
{

System.out.println(" Default Constructor Called");
this.ID =101;
this.Name = "Vijeta";
this.Salary= 45000;
this.Commission=6000;


}

HR(int I, String N, double S,double C)//Parameterizedconstructor
{

System.out.println(" Parameterized Constructor Called");
this.ID =I;
this.Name = N;
this.Salary= S;
this.Commission=C;


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
	h2 = new HR(102,"Manjiri",50000,5000);

	h1.SetID(101);
	h1.SetName("Vijeta");
	h1.SetSalary(45000);
	h1.SetCommission(6000);


	h2.SetID(102);
	h2.SetName("Manjiri");
	h2.SetSalary(50000);
	h2.SetCommission(5000);
	System.out.println("\nHere h1 Object Start ->");

	h1.getID();
	h1.getName();
	h1.getSalary();
	h1.getCommission();
	h1.Display();

	System.out.println("-------------------------------------");

	System.out.println("\nHere h2 Object Start ->");
	h2.getID();
	h2.getName();
	h2.getSalary();
	h2.getCommission();
	h2.Display();


	//System.out.println("ID:"+h1.ID+"\nName:"+h1.Name+"\nSalary:"+h1.Salary+"\nCommision:"+h1.Commission);

	
}//main ends here
}//Test Ends Here

