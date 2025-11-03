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

}//HR ends here
class TestHR{
public static void main(String[]args){

	HR h1;
	h1 = new HR();
	h1.SetID(101);
	h1.SetName("Vijeta");
	h1.SetSalary(45000);
	h1.SetCommission(6000);
	System.out.println("ID:"+h1.ID+"\nName:"+h1.Name+"\nSalary:"+h1.Salary+"\nCommision:"+h1.Commission);

	
}//main ends here
}//Test Ends Here

