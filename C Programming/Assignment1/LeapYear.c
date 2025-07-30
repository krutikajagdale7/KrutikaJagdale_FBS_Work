#include<stdio.h>
void main(){
	int year = 2000;
	if((year % 4==0 && year % 100 !=0|| year %400 == 0 )){
		printf(" This year is Leap Year");
	}
	else{
		printf("This year is NOT Leap Year");
	}
}