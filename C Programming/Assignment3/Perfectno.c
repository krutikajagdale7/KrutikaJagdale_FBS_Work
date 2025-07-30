//perfect no is positive no equal to the sum of its proper divisors
#include<stdio.h>
int main(){
	int num = 28;
	int i = 1;
	int sum = 0;
	while(i< num){
		if(num%i==0){
			sum = sum+i;
		}
		i++;
		
	}
	if(sum == num){
		printf("no is Strong", num);
	}
	else{
		printf("no is NOT Strong", num);
	}
	
	
}