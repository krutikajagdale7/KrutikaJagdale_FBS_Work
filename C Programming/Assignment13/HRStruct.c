#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct HR{
	int id;
	char name[40];
	double salary;
	double commission;
};
void main(){
	struct HR h1, h2;
	h1.id = 1;
	strcpy(h1.name ,"krutika jagdale");
	h1.salary = 50000.60;
	h1.commission = 4000;

    printf("*HR Details*\n");
    
    printf("Details Of HR1 :\n");
    printf("HR_id: %d\n",h1.id);
    printf("HR_Name: %s\n",h1.name);
    printf("HR_Salary: %lf\n", h1.salary);
    printf("HR_Commission: %lf\n",h1.commission);
    
    printf("Details Of HR2 :\n");
    printf("HR_id:");
    scanf("%d",&h2.id);
    printf("HR_name:");
    scanf("%s",&h2.name);
    printf("HR_salary:");
    scanf("%lf",&h2.salary);
    printf("HR_commission:");
    scanf("%lf",&h2.commission);
    
    printf("\nHR_ID:%d\nHR_Name:%s\nHR_Salary:%lf\nHR_Commision %lf\n",h2.id,h2.name,h2.salary,h2.commission);
    
      
}