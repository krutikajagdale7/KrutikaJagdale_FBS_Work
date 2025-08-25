#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Admin{
	int Admin_Id;
	char Admin_Name[30];
	double Admin_Salary;
	double Admin_Allowance;
	
};
void main(){
	
	struct Admin A1, A2;
	A1.Admin_Id = 101;
	strcpy(A1.Admin_Name,"Krutika Jagdale");
	A1.Admin_Salary = 75000;
	A1.Admin_Allowance = 500;
	
	printf("# Admin Details #\n");
	printf("\nDetails Of First Admin:\n");
	printf("\nAdmin_Id: %d", A1.Admin_Id);
	printf("\nAdmin_Name: %s", A1.Admin_Name);
	printf("\nAdmin_Salary: %lf\n", A1.Admin_Salary);
	printf("\nAdmin_Allowance: %lf\n", A1.Admin_Allowance);
	
	printf("\nEnter Details Of Second Admin:\n");
	printf("Admin_Id:");
	scanf("%d",&A2.Admin_Id);
	printf("Admin_Name:");
	scanf("%s",&A2.Admin_Name);
	printf("Admin_Salary:");
	scanf("%lf",&A2.Admin_Salary);
	printf("Admin_Allowance:");
	scanf("%lf",&A2.Admin_Allowance);
	
	printf("\nDetails Of Second Admin:\n");
	
	printf("\nAdmin_Id: %d\nAdmin_Name: %s\nAdmin_Salary: %lf\nAdmin_Allowance:%lf", A2.Admin_Id,  A2.Admin_Name, A2.Admin_Salary, A2.Admin_Allowance);
	
	
}