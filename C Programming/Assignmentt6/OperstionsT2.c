#include<stdio.h>
double Operations();
void main(){
	double a =10.0 , b = 20.0;
	double res = Operations();
	if(res==1){
		printf("addition of a and b is %lf ", a+b);
	}else if(res ==2 ){
		printf("sub of a and b is %lf ",a-b);
	}else if(res == 3){
		printf("mul of a and b is  %lf", a*b);
	}
	else if(res ==4 ){
		printf("div of and b is %lf", a/b);
	}else if(res ==5 ){
		printf("mod of a and b %lf");
	}
	
}
double Operations(){
	 char ch;
	 printf("enter char: ");
	scanf("%c", &ch);
	
	if(ch =='+'){
		return 1;
	}
	else if(ch== '-'){
		return 2;
	}
	else if(ch == '*'){
		return 3;
	}
	else if(ch == '/'){
		return 4;
	}
	else if (ch == '%'){
		return 5;
	}
}