#include<stdio.h>
void PrintEven(int , int);
void PrintOdd(int, int);
void main(){
	int  start, end;
printf("Enter the start: ");
scanf("%d",&start);
printf("Enter the end: ");
scanf("%d",&end);
PrintEven(start, end);
printf("\n Enter the start: \n");
scanf("%d",&start);
printf("\n Enter the end: ");
scanf("%d",&end);
	 PrintOdd(start, end);
	
}
void PrintEven(int start, int end){
	printf("\n Even No :");
	for(int i=start;i<=end;i++){
	
    if(i%2==0){
    	printf("\n  %d ",i);
		
	}
}
	
}
void PrintOdd(int start, int end){
	printf("\n Odd No :");
	for(int i=start;i<=end;i++){
	
	if(i%2!=0){
		printf("\n%d",i);
	}
}

}