#include<stdio.h>
int PrimeNo(int);
void main(){
	
	int n;
	printf("Enter Number:");
	scanf("%d",&n);
	int res = PrimeNo(n);
	if(res==1){
			printf(" \n No is Prime Number");
	}else if(res==2)
	{
		printf("\n No is  Prime Number");
	}
	else{
		printf("\n No is NOT Prime Number");

	}
}

int PrimeNo(int n){
	//int n = 3;
	int i=2;
	int isPrime=1;
	while(i<=n/2){
		if(n%i==0){
			isPrime=0;
		}
		i++;
	}
	if(n<=1){
		return 1;
		
	}else if(isPrime==1){
		return 2;
	}else{
		return 3;
	}
}