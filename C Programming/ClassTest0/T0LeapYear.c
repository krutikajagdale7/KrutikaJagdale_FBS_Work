#include<stdio.h>
void main(){
	int year = 2025;
	if((year%4==0 && year% 100!=0)||(year %400 ==0)){
		printf("This Year is Leap year");
	}
	else{
		printf("This Year is NOT leap year");
	}
}