#include<stdio.h>
int main(){
	int n,i,j,sum,temp,digit,fact;
	printf("Enter the value of n:");
	scanf("%d",&n);
	printf("Strong num from 1 to %d are: \n",n);
	
	for(i=1;i<=n;i++){
		temp=i;
		sum=0;
		while(temp>0){
			digit = temp%10;
			fact=1;
			for(j=1;j<=digit;j++){
				fact= fact*j;
			}
			sum =sum +fact;
			temp=temp/10;
		}
		if(sum==i){
			printf("%d \n",i);
		}
	}
	
}