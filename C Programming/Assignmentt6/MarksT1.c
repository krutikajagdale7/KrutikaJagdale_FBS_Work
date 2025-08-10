#include<stdio.h>
void Marks();
void main(){
	Marks();
}
void Marks(){
	int marks = 35;
	if(marks >= 75){
		printf("A+ grade");
	}
	else if (marks >= 55)
	{
		printf("B+ grade");
	}else if (marks >= 45){
		printf("C+ grade");
	}
	else if (marks >=35){
		printf("Pass");
	}else{
		printf("Fail");
	}
}