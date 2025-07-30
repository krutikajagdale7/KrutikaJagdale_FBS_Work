#include<stdio.h>
void main(){
	int age = 90;
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