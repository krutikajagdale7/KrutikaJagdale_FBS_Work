#include<stdio.h>
int Triangle();
void main(){
	int res = Triangle();
	if(res==1){
			printf("Triangle is eqi");
	}else if(res==2){
		printf("Triangle is iso");
	}else if (res==3){
		printf("Triangle is scalane");
	}
}
int Triangle(){
	int a=10, b=10,c =10;
	if(a==b&&b==c){
	return 1;
	}else if(a==b||b==c||a==c){
		
		return 2;
	}else {
		return 3;
	}
}
	
