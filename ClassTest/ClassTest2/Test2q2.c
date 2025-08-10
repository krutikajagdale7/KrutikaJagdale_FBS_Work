//alternate numbers from given range
#include<stdio.h>
void AlternateSum(int,int);
void main(){
	int start, end;
    printf("Enter the start number:");
	scanf("%d",&start);
	printf("Enter the end number:");
	scanf("%d",&end);
	AlternateSum(start, end);
}
void AlternateSum(int start,int end){
    int sum=0;
	for(int i=start;i<=end;i=i+2){
		sum = sum+i;
	}
	
	printf("Alternate sum from %d to %d is: %d\n ", start, end, sum);
	

}
