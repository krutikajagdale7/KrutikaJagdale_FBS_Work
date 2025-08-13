#include<stdio.h>
int Printevenodd(int*);
void main(){
	int no;
	printf("Enter Num:");
	scanf("%d", &no);
	Printevenodd(&no);
	
}
int Printevenodd(int* a){
	if(*a%2==0){
		printf(" no is even");
	}
	else
	{
		printf(" no is odd");
	}
}