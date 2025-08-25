#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct SalesManager{
	int id;
	char name[40];
	double salary;
	double incentive;
	double target;
};
void main(){
	struct SalesManager SM1, SM2;
	SM1.id=101;
	strcpy(SM1.name,"Krutika");
	SM1.salary = 80000;
	SM1.incentive = 6000;
	SM1.target = 1;
	printf("*Details Of SalesManager*");
	
    printf("Details Of SalesManager1 :\n");
    printf("ID: %d\n",SM1.id);
    printf("Name: %s\n",SM1.name);
    printf("Salary: %lf\n", SM1.salary);
    printf("Incentive: %lf\n",SM1.incentive);
    printf("Target: %lf\n",SM1.target);
    
    
    printf("Details Of SalesMAnager2 :\n");
    printf("Id:");
    scanf("%d",&SM2.id);
    printf("Name:");
    scanf("%s",&SM2.name);
    printf("Salary:");
    scanf("%lf",&SM2.salary);
     printf("Intencive:");
   scanf("%lf",&SM2.incentive);
    printf("Target:");
    scanf("%lf",&SM2.target);
    
    
    printf("\nID:%d\nName:%s\nSalary:%lf\nIncentive: %lf\nTarget:%lf\n",SM2.id,SM2.name,SM2.salary,SM2.incentive,SM2.target);
    
      
	
	
}