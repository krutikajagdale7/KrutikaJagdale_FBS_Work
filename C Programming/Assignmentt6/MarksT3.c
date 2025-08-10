#include<stdio.h>
void Marks(int);
void main(){
	int n;
	printf("Enter Marks:");
	scanf("%d", &n);
	Marks(n);
}
void Marks(int marks){
	//int marks = 35;
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