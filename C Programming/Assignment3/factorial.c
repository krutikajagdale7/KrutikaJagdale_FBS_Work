#include<stdio.h>
int main(){
	int n = 5;
	int fact = 1;
	int i = 1;
	while(i<=n)
	{
		fact = fact*i;//1=1*1, 1=1*2=2, 2*3=6, 6*4=24, 24*5=120;
		i++;
	}
	printf("factorial of 5 is %d %d",n, fact);
}