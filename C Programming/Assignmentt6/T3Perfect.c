//perfect no is positive no equal to the sum of its proper divisors
#include<stdio.h>
int PrintPerfectNo(int a);
int main(){
	int num;
		printf("Enter Num:");
	scanf("%d", &num);
	PrintPerfectNo(num);
	
	
}
int PrintPerfectNo(int a){
	int i = 1;
	int sum = 0;
	while(i< a){
		if(a%i==0){
			sum = sum+i;
		}
		i++;
		
	}
	if(sum == a){
		printf("no is Perfect", a);
	}
	else{
		printf("no is NOT Perfect", a);
	}
	
}