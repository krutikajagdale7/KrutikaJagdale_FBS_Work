#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Admin
{
	int id;
	char name[30];
	double salary;
	double allowance;
	
};
void store(struct Admin *a);
void display(struct Admin a);
void main(){
	struct Admin a;
	store(&a);//pass by address
	display(a);//pass by value

}
void store(struct Admin *a){
	printf("Enter Details of Admin:\n");
	printf("Admin_Id:");
	scanf("\n%d",&a->id);
	printf("Admin_Name: ");
	scanf("\n%s",&a->name);
	printf("Admin_Salary: ");
	scanf("\n%lf",&a->salary);
	printf("Admin_Allowance: ");
	scanf("\n %lf",&a->allowance);
	
	
}
void display(struct Admin a){
	
	printf("\n Admin_Id: %d",a.id);
	printf("\n Admin_Name:%s",a.name);
	printf("\n Admin_Salary:%lf",a.salary);
	printf("\n Admin_Allowance:%lf",a.allowance);
}