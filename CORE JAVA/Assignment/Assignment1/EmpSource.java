class Employee{
int ID;
String Name;
double salary;
void setID(int I){
 	this.ID = I;

}
void setName(String N)
{ 
	this.Name= N;
}
void setSalary(double D){
 	this.salary = D;
}
}//Employee Ends here
class TestEmployee{
	public static void main(String[]args){
		Employee e1;//ref
		e1= new Employee();//object
		e1.setID(101);
		e1.setName("Krutika");
		e1.setSalary(50000);
		System.out.println("ID is:"+e1.ID);
		System.out.println("Name is:"+e1.Name);
		System.out.println("Salary is:"+e1.salary);
		


}//main ends here

}//TestEmplkoyee ends here
