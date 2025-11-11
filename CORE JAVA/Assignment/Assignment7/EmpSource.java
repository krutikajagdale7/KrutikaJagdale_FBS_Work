import java.util.Scanner;

class Employee{
int ID;
String Name;
double salary;

Employee()//default constructor
{

System.out.println(" Default Constructor Called");
this.ID =102;
this.Name = "Vijeta";
this.salary= 50500;


}

Employee(int I, String N, double S)//Parameterizedconstructor
{

System.out.println(" Parameterized Constructor Called");
this.ID =I;
this.Name = N;
this.salary= S;


}


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



Employee arr[]=new Employee[3];
arr[0] = new Employee();
arr[1] = new Employee(12,"ABC", 23000);
arr[2] = new Employee();

for(int i=0;i<arr.length;i++){
//System.out.println(arr[i]);
arr[i].Display();


}
		Employee e1;
		Employee e2;//ref
		
		  e2=new Employee();
	e1= new Employee(101,"Krutika",900000);//object
		//e1.setID(101);
		//e1.setName("Krutika");
		//e1.setSalary(50000);

		e2.setID(102);
		e2.setName("Vijeta");
		e2.setSalary(50500);
		System.out.println("\nHere e1 Object Start ->");

		//e1.getID();
		//e1.getName();
		//e1.getSalary();
		  e1.Display();

		System.out.println("-------------------------------------");

		System.out.println("\nHere e2 Object Start ->");
		e2.getID();
		e2.getName();
		e2.getSalary();
		e2.Display();
		

		//System.out.println("ID is:"+e1.ID);
		//System.out.println("Name is:"+e1.Name);
		//System.out.println("Salary is:"+e1.salary);

Scanner sc = new Scanner(System.in);
System.out.println("Here Details of Empoyee-----------");
System.out.println("Enter the ID:");
int a= sc.nextInt();
sc.nextLine();
System.out.println("Enter the Name:");
String str = sc.nextLine();
System.out.println("Enter the Salary:");
double D = sc.nextDouble();
Employee e3 = new Employee(a,str,D);

e3.Display();

		


}//main ends here

}//TestEmplkoyee ends here
