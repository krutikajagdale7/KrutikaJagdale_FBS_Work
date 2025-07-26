#include<stdio.h>
void main(){
	int a, b, c;
	a=10, b=20;
	c = a;//a store in c
	a=b;
	b=c;
	
	printf("Swap Two Numbers: %d %d",a,b);
}