#include<stdio.h>
double Total_salary(double*);
void main(){
	double basic_salary;
	printf("enter Basic Salary:");
	scanf("%lf", &basic_salary);
	Total_salary(&basic_salary);
}
double Total_salary(double* b_s){
	double da, ta, hra, total_salary;
	if(*b_s<=5000){
		da = *b_s * 0.10;
		ta = *b_s * 0.15;
		hra = *b_s * 0.20;
	}
	else{
		da = *b_s * 0.15;
		ta = *b_s * 0.25;
		hra = *b_s * 0.30;
	}
	total_salary =*b_s+da+ta+hra;
	printf("Total_Salary: %lf",total_salary );
}

