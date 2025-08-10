#include<stdio.h>
#include<math.h>
void Armstrong(int);
void main(){
	int n;
	printf("Enter the value of n:");
	scanf("%d",&n);
	printf("Armstrong num from 1 to %d are: \n",n);
	 Armstrong(n);

}
void Armstrong(int a){
    
	int i,j,sum,num,temp,rem;
     int digits;
	for(int i =1;i<=a;i++){
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