
#include<stdio.h>
int age();
void main(){
	int res = age();
	if(res==1){
		printf("\n Eligible for Voting");
	}
	else{
	printf(" \n NOT Eligible for Voting");
	}
}
int age(){
int age = 19;
	if(age>=18){
		return 1;
		
	}
	else{
		return 2;
	}
}