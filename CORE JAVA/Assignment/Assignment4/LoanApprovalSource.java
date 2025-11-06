class Student{

int rollno;
String name;
int percentage;
Student(int R, String str, int p){

System.out.println(" Parameterized Constructor Called");
this.rollno=R;
this.name=str;
this.percentage=p;

}


}//student end here

class Employee{

int id;
String name;
double AnnualSalary;



Employee(int I, String N, double AS)//Parameterizedconstructor
{

System.out.println(" Parameterized Constructor Called");
this.id =I;
this.name = N;
this.AnnualSalary= AS;

}
}//employee end here


class Bank{

void Loan(Student s){

System.out.println("fun1");
if(s.percentage >80)
System.out.println("Loan Approved for 2 lakh");
else if(s.percentage >=60)

System.out.println("Loan Aproved For 1 lakh");

else if (s.percentage >=40)
System.out.println("Loan Aproved For 50k");

else 
System.out.println("Loan not  Aproved");

}
void Loan(Employee e){
//double Salary = AnnualSalary;

System.out.println("fun2");
if(e.AnnualSalary >12)
System.out.println("Loan Approved for 2 lakh");
else if(e.AnnualSalary>=12)

System.out.println("Loan Aproved For 7 lakh");

else if (e.AnnualSalary >10)
System.out.println("Loan Aproved For 6 lakh");

else if(e.AnnualSalary >6)
System.out.println("Loan Aproved for 5 lakh");
else if(e.AnnualSalary >4)
System.out.println("Loan Aproved for 4lakh ");
else
System.out.println("Loan not  Aproved");

}


public static void main(String[] args){

Bank b = new Bank();
Student s = new Student(1,"Krutika",75);
Employee e = new Employee(101,"Vijeta",3.5);
b.Loan(s);
b.Loan(e);

}



}//class bank end here


