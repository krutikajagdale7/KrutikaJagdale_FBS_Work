#include<stdio.h>
int Divisible();
int main(){
	int res = Divisible();
	if(res==1){
		printf(" both are divisible");
	}
		else if(res==2){
	printf("divisible by 3 but not 5");
	}else if(res==3)
	{
		printf("divisible by 5 but not 3");
	}
	else if(res==4){
		printf("divisible by none");
	}
	
}
int Divisible(){
	int  num = 30;
	if (num%3==0 && num%5==0){
		return 1;
	}else if (num%3==0){
		return 2;
	}
	else if (num%5==0){
		return 3;
	}
	else {
		return 5;
	}
}






