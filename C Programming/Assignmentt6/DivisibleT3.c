#include<stdio.h>
void Divisible(int);
void main(){
	int n;
	printf("Enter Num:");
	scanf("%d", &n);
	Divisible(n);
	
}
void Divisible(int num){
	
	if (num%3==0 && num%5==0){
		printf("divisible by both");
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






