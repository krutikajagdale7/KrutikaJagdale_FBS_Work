//Prime no: No is divisible by 1 and itself.
#include<stdio.h>
int main(){
	int num = 28;
	int i = 2;
	int isPrime = 1;//assume prime 
	
	while(i<= num /2){
		if(num%i==0){
			isPrime = 0;
			
		}
		i++;
	}
		if(num<=1)
		
		printf("Number is  NOT Prime Number %d",num);
		
		else if(isPrime==1)
			
			printf("Number is Prime Number %d",num);
			
		else 
			printf("Number is NOT Prime Number %d",num);
			
		
			
	
}
