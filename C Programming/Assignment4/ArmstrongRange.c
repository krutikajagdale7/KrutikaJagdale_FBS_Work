#include<stdio.h>
#include<math.h>
int main(){
	int n, rem, temp, digits;
	printf("Enter the value of n:");
	scanf("%d",&n);
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
	return 0;
	
	
}