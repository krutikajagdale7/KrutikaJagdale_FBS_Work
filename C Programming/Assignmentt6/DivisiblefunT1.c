#include<stdio.h>
// fun declaration
void divisible();
void main(){
	
	divisible();
}//main fun ends here
void divisible(){
	int num = 20;
	if(num%3==0&&num%5==0){
		printf(" divisible for both");
	}else if(num%5==0){
		printf(" divisible by 5 only ");
		
	}else if(num%3==0){
		printf("divisible by 3 only");
	}else{
		printf("No divisible by both");
	}
}