#include<stdio.h>
void Triangle(int, int, int);
void main(){
	int n1, n2,n3;
	printf("Enter a b c:");
	scanf("%d %d %d", &n1, &n2,&n3);
	Triangle(n1, n2, n3);
}
void Triangle(int a, int b, int c){
	//a=10, b=10,c =10;
	if(a==b&&b==c){
		printf("Triangle is eqi");
	}else if(a==b||b==c||a==c){
		printf("Triangle is iso");
		
	}else {
		printf("Triangle is scalane");
	}
}
	
