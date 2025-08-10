#include<stdio.h>


void PrintArmstrongNo(int);

void main(){
	int n ;
	printf("Enter Num:");
	scanf("%d", &n);
	PrintArmstrongNo(n);
	
	
}
void PrintArmstrongNo(int a){
	int original, reminder, sum = 0;
	original = a;
	while(a != 0){
		reminder = a %10;
		sum = sum+(reminder *reminder*reminder);
		a = a/10;
	}
	if(sum == original){
		printf("No. is Armstrong");
	}
	else{
		printf("No. is NOT Armstrong");
	}
}