class SalesManager{
int ID ;
String Name;
double Salary;
double Incentive;
double Target;

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
}//SalesManager ends here
class TestSalesManager{
	 public static void main(String [] args){
		SalesManager S1;
		S1 = new SalesManager();
		S1.SetID(1001);
		S1.SetName("Nikita");
		S1.SetSalary(90000);
		S1.SetIncentive(5000);
		S1.SetTarget(400);
	System.out.println("ID:"+S1.ID+"\nName:"+S1.Name+"\nSalary:"+S1.Salary+"\nIncentive:"+S1.Incentive+"\nTarget:"+S1.Target);

		
}// main ends here

}//TestSalesManager ends Here