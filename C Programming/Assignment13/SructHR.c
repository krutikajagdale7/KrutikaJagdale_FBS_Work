#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct HR
{
	int id;
	char name [20];
	double salary;
	double commission;
	
};
//void store(struct HR *h1 );
//void display(struct HR h1);
// store(struct HR *h1);
// display(struct HR h2);
 
void main(){
 	struct HR h1, h2;
 	store(&h1);
 	display(h1);

 	printf("===  Details of HR1 ===\n");
    store(&h1);   // pass by address
     
    printf("===  Details of HR2 ===\n");
    store(&h2);   // pass by address
    
    printf("\n=== Displaying Details of HR1 ===\n");
    display(h1);
    
    printf("\n=== Displaying Details of HR2 ===\n");
    display(h2);  //pass by value
 	
 }
void store(struct HR *h1, struct HR *h2){
	
	printf("Enter Details of HR1:\n");
	printf("HR_Id:");
	scanf("\n%d",&h1->id);
	printf("HR_Name: ");
	scanf("\n%s",&h1->name);
	printf("HR_Salary: ");
	scanf("\n%lf",&h1->salary);
	printf("HR_commission: ");
	scanf("\n %lf",&h1->commission);
	
	
	printf("Enter Details of HR2:\n");
	printf("HR_Id:");
	scanf("\n%d",&h2->id);
	printf("HR_Name: ");
	scanf("\n%s",&h2->name);
	printf("HR_Salary: ");
	scanf("\n%lf",&h2->salary);
	printf("HR_commission: ");
	scanf("\n %lf",&h2->commission);
	
}
void display(struct HR h1, struct HR h2 ){

	printf("\n HR_Id: %d",h2.id);
	printf("\n HR_Name:%s",h2.name);
	printf("\n HR_Salary:%lf",h2.salary);
	printf("\n HR_Commission:%lf",h2.commission);
	
	
		printf("\n HR_Id: %d",h2.id);
	printf("\n HR_Name:%s",h2.name);
	printf("\n HR_Salary:%lf",h2.salary);
	printf("\n HR_Commission:%lf",h2.commission);
	
	
}