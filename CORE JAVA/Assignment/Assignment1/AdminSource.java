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
}//admin ends here
class TestAdmin{
	public static void main(String[] args){
		Admin a1;//ref
       		a1=new Admin();
		a1.SetID(101);
		a1.SetName("Krutika");
		a1.SetSalary(500000);
		a1.SetAllowance(5000);
System.out.println("ID:"+a1.ID+"\nName:"+a1.Name+"\nSalary"+a1.Salary+"\nAllowance:"+a1.Allowance);
}//main ends here
}//Test ends here