#include<stdio.h>
int CheckAge();
void main(){
	int res = CheckAge();
	if(res==1){
		printf(" Child");
	}
	else if(res==2){
		printf(" Teenager");
	}else if(res==3)
	{
		printf(" Adult");
	}
	else if(res==4){
		printf("Senior");
	}
	
}
int CheckAge(){
	int age = 90;
	if(age<12){
		return 1;
	}else if(age>=19 && age<=19){
		return 2;
	}else if(age >=20 && age<=59){
		return 3;
	}else if(age>=60){
		return 4;
	}
}