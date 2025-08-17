#include<stdio.h>
void ScanArray(int*, int);
void MinMaxFun(int*,int);
void main(){
	int arr[5];
	printf("Enter Number For Array :");
	ScanArray(arr,5);
	MinMaxFun(arr,5);
}
void ScanArray(int* ptr, int size){
	for(int i=0;i<size;i++){
		scanf("%d",&ptr[i]);
	}
}
void MinMaxFun(int* ptr, int size){
	int min = ptr[0];
	int max = ptr[0];
	for(int j=0;j<size;j++){
		//printf("%d\n ", arr[j]);
if(ptr[j]<min){
		min = ptr[j];
	}
	if(ptr[j]> max){
		max = ptr[j];
	}
	
}
printf("\n min no.:%d", min);
	printf("\n max no.:%d", max);
		
}
