//Que 1: electricity bill

#include<stdio.h>
void main(){
	int n;
	printf("enter unit:");
	scanf("%d",&n);
	if(n<=1||n<=50){
		int bill=30*n;
		printf("The unit Rs %d:",bill);
	}
	else if(n<=51||n<=150){
		int bill = 40*n;
		printf("The unit cost %d:",bill);
	}else if(n>=151){
		int bill = 50*n;
		printf("The unit Rss %d:",bill);
	}
	else{("Invalid Input");
	}
}


//que2
//#include<stdio.h>
//void main(){
//int n;
//printf("enter num:");
//scanf("%d", &n);
//if(n>0){
//	printf("No is Positive");
//}
//else if(n<0){
//	printf("No is Negative");
//}
//else{
//	printf("No is Neutral");
//}
//
//}

//#include<stdio.h>
//void main(){
//	int n = -9;
//	n>0?n<0?printf("No is Negative"):printf("No is Neutral"):printf("No is Positive");;
//}

