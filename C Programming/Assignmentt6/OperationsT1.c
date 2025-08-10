#include<stdio.h>
void Operations();
void main(){
	Operations();
	
}
void Operations(){
	int a =10, b= 20;
	char ch ='-';
	if(ch =='+'){
		printf("addition of a and b is %d ", a+b);
	}
	else if(ch== '-'){
		printf("sub of a and b is %d ",a-b);
	}
	else if(ch == '*'){
		printf("mul of a and b is  %d", a*b);
	}
	else if(ch == '/'){
		printf("div of and b is %d", a/b);
	}
	else if (ch == '%'){
		printf("mod of a and b");
	}
}