#include<stdio.h>
int CheckAge(int);
void main(){
	int n;
	printf("Enter age:");
	scanf("%d", &n);
	CheckAge(n);
	
}
int CheckAge(int age){
	
	if(age<12){
		printf(" Child");
	}else if(age>=19 && age<=19){
		printf(" Teenager");
	}else if(age >=20 && age<=59){
		printf(" Adult");
	}else if(age>=60){
		printf("Senior");
	}
}