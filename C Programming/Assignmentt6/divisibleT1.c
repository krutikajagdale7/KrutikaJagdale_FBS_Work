#include<stdio.h>
void Divisible();
void main(){
	
	Divisible();
	
}
void Divisible(){
	int  num = 30;
	if (num%3==0 && num%5==0){
		printf(" both are divisible");
	}else if (num%3==0){
		printf("divisible by 3 but not 5");
	}
	else if (num%5==0){
		printf("divisible by 5 but not 3");
	}
	else {
		printf("divisible by none");
	}
}






