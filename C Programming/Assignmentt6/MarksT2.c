#include<stdio.h>
int Marks();
void main(){
	int res = Marks();
	if(res==1){
		printf("A+ grade");
	}else if(res==2){
		printf("B+ grade");
	}else if(res==3){
		printf("C+ grade");
	}else if(res==4){
		printf("Pass");
	}else{
		printf("Fail");
	}
}
int Marks(){
	int marks = 35;
	if(marks >= 75){
		return 1;
	}
	else if (marks >= 55)
	{
		return 2;
	}else if (marks >= 45){
		return 3;
	}
	else if (marks >=35){
		return 4;
	}else{
		return 0;
	}
}