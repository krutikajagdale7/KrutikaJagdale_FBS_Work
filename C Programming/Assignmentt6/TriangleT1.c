#include<stdio.h>
void Triangle();
void main(){
	Triangle();
}
void Triangle(){
	int a=10, b=10,c =10;
	if(a==b&&b==c){
		printf("Triangle is eqi");
	}else if(a==b||b==c||a==c){
		printf("Triangle is iso");
		
	}else {
		printf("Triangle is scalane");
	}
}
	
