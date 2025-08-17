//find sum of all num.
#include<stdio.h>
void SumOfArray(int*,int);
void main(){
	int arr[5];
	printf("enter num:");
	SumOfArray(arr,5);
}
void SumOfArray(int * ptr, int size){
	
	for(int i=0;i<size;i++){
		scanf("%d",&ptr[i]);
	}
	int sum =0;
	for(int i=0;i<5;i++){
		
		sum = sum+ptr[i];
		
	}
	printf("sum of array:%d",sum);

	
}