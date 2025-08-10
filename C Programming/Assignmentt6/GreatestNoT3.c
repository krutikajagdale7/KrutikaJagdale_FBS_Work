#include<stdio.h>
void PrintGreatestNo(int , int , int );
void main(){
	int n1, n2, n3;
	printf("Enter n1, n2, n3:");
	scanf("%d %d %d", &n1, &n2, &n3);
	PrintGreatestNo(n1, n2, n3);
}
void PrintGreatestNo(int a , int b , int c ){

	if(a>b){
		if(a>c)
		{
				printf("a is greater");
		}
		else
		{
				printf("c is greater");
		}
	}
	
		else
		{
		 
		if(b>c){
				printf("b is greater");
		}
			else{
			printf("c is greater");
		}
	}
}

