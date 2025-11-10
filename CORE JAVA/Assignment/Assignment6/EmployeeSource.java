class Employee{

String Name;
double Salary;
static double CompanyBounsRate = 10.9;

Employee()
{
System.out.println(" Default Constructor Called");

this.Name = "Krutika";
this.Salary = 80000;

}
Employee(String N, double S){
System.out.println(" Parameterized Constructor Called");

this.Name = N;
this.Salary = S;
}
void setName(String N){
	this.Name=N;

}void setSalary(double S){
	this.Salary = S;

}
static double setCompanyBounsRate(double CBR){

	return CompanyBounsRate = CBR;
}

String getName(){

	return this.Name;
}
double getSalary()
{
	
	return this.Salary;
}

double setCompanyBounsRate(){

return this.CompanyBounsRate;

}
double CalculateTotalSalary(){
	return Salary+(Salary * CompanyBounsRate/100);
}
void Display(){

System.out.println(" Emp Name:"+this.Name);

System.out.println("Emp Salary:"+this.Salary);

System.out.println("CompanyBounsRate:"+this.CompanyBounsRate);

System.out.println(" Total CalculateTotalSalary:"+this.CalculateTotalSalary());


}
}//employee end here


class Test{


public static void main(String[]args){
		Employee e1 = new Employee("Krutika", 12000);
		Employee e2 = new Employee();
Employee.setCompanyBounsRate(10.9);
e1.Display();
e2.Display();


e1.CalculateTotalSalary();
e2.CalculateTotalSalary();
}//main end here






}//test end here