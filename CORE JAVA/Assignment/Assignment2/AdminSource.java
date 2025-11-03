class Admin{
int ID; 
String Name;
double Salary;
double Allowance;

void SetID(int I){
	
	this.ID = I;
}
void SetName(String N){
	this.Name = N;
}
void SetSalary(double S){
	this.Salary = S;
}
void SetAllowance(double A){
	this.Allowance = A;
}
int getID(){
	return this.ID;

}
String getName()
{
	return this.Name;
}
double getSalary()
{
	return this.Salary;
}
double getAllowance()
{
	return this.Allowance;
}
void Display(){
	System.out.println("ID is:"+this.ID);
	System.out.println("Name is:"+this.Name);
	System.out.println("Salary is:"+this.Salary);
	System.out.println("Salary is:"+this.Allowance);

}





}//admin ends here
class TestAdmin{
	public static void main(String[] args){
		Admin a1, a2;//ref
       		a1=new Admin();
		a2=new Admin();
		a1.SetID(101);
		a1.SetName("Krutika");
		a1.SetSalary(500000);
		a1.SetAllowance(5000);

		a2.SetID(102);
		a2.SetName("Nikita");
		a2.SetSalary(80000);
		a2.SetAllowance(500);
		System.out.println("\nHere a1 Object Start ->");

		a1.getID();
		a1.getName();
		a1.getSalary();
		a1.getAllowance();	
		a1.Display();

		System.out.println("-------------------------------------");
		System.out.println("\nHere a2 Object Start ->");

		a2.getID();
		a2.getName();
		a2.getSalary();
		a2.getAllowance();	
		a2.Display();




//System.out.println("ID:"+a1.ID+"\nName:"+a1.Name+"\nSalary"+a1.Salary+"\nAllowance:"+a1.Allowance);
}//main ends here
}//Test ends here