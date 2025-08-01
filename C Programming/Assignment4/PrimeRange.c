#include<stdio.h>
int main(){
	int n,i,j,isPrime;
	printf("Enter the value of n:");
	scanf("%d",&n);
	printf("Prime num from 1 to %d are: \n",n);
	for(i=1;i<=n;i++){
		//if(i<2)
		//continue;
		isPrime=1;
		for(j=2;j<i;j++){
			if(i%j==0){
				isPrime=0;
				break;
			}
		}
		if(isPrime==1){
			printf("%d \n",i);
		}
	}
	
	}
	