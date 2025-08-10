#include<stdio.h>
#include<math.h>
void Armstrong(int n);
void main(){
	int n;
	printf("Enter the value of n:");
	scanf("%d",&n);
	Armstrong(n);
	return 0;
}
void Armstrong(int n){
    
	int i,j,sum,num,temp,rem, digits;
     
	printf("Armstrong num from 1 to %d are: \n",n);
	for(int i =1;i<=n;i++){
		int num = i;
	    int	sum = 0;
	    digits=0;
	    temp = num;
	    while(temp>0){
	    digits++;
	    temp = temp/10;
		}
		temp = num;
		while(temp>0){
			rem = temp%10;
			sum += pow(rem,digits);
			temp = temp/10;
		}
		if(sum == num){
			printf(" \n %d",num);
		}
	    
	}

	
	
}