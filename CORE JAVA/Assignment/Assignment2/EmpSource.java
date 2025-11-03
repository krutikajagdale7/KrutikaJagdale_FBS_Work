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
int getID(){
	return this.ID;
}
String getName(){
	return this.Name;
}
double getSalary(){
	return this.salary;
}
void Display(){
	System.out.println("ID is:"+this.ID);
	System.out.println("Name is:"+this.Name);
	System.out.println("Salary is:"+this.salary);
}

}//Employee Ends here
class TestEmployee{
	public static void main(String[]args){
		Employee e1, e2;//ref
		e1= new Employee();//object
		e2=new Employee();
		e1.setID(101);
		e1.setName("Krutika");
		e1.setSalary(50000);

		e2.setID(102);
		e2.setName("Vijeta");
		e2.setSalary(50500);
		System.out.println("\nHere e1 Object Start ->");

		e1.getID();
		e1.getName();
		e1.getSalary();
		e1.Display();

		System.out.println("-------------------------------------");
		System.out.println("\nHere e2 Object Start ->");
		e2.getID();
		e2.getName();
		e2.getSalary();
		e2.Display();
		

		System.out.println("ID is:"+e1.ID);
		System.out.println("Name is:"+e1.Name);
		System.out.println("Salary is:"+e1.salary);
		


}//main ends here

}//TestEmplkoyee ends here
