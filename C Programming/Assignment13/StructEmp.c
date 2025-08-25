#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Employee{
	int Emp_Id;
	char Emp_Name[30];
	double Emp_Salary;
	
};
void main(){
	
	struct Employee Emp1, Emp2;
	Emp1.Emp_Id = 101;
	strcpy(Emp1.Emp_Name,"Krutika Jagdale");
	Emp1.Emp_Salary = 55000;
	
	printf("# Employee Details #\n");
	printf("\nDetails Of First Employee:\n");
	printf("\nEmp_Id: %d", Emp1.Emp_Id);
	printf("\nEmp_Name: %s", Emp1.Emp_Name);
	printf("\nEmp_Salary: %lf\n", Emp1.Emp_Salary);
	
	printf("\nEnter Details Of Second Employee:\n");
	printf("Emp_Id:");
	scanf("%d",&Emp2.Emp_Id);
	printf("Emp_Name:");
	scanf("%s",&Emp2.Emp_Name);
	printf("Emp_Salary:");
	scanf("%d",&Emp2.Emp_Salary);
	
	printf("\nDetails Of Second Employee:\n");
	
	printf("\nEmp_Id: %d\nEmp_Name: %s\nEmp_Salary: %d", Emp2.Emp_Id, Emp2.Emp_Name,Emp2.Emp_Salary);
	
	
}