#include<stdio.h>
void main(){
	int SE = 80;
	int OS = 50;
	int DBMS = 70; 
	int Java = 60;
	int OOP = 100;
	float T = SE+OS+DBMS+Java+OOP;
	int Total = 500;
	float Percentage = (T/500)*100;
	
	//printf("Total Marks and Percentage: %d %d",T,Percentage);
	printf("print Marks Total: %f, Percentage of marks: %f",T,Percentage);
}