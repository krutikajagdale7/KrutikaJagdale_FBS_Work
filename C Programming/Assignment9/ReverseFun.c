#include<stdio.h>
void main(){
	int arr[5];
	printf("Enter No for array:");
	for(int i=0;i<5;i++){
		scanf("%d", &arr[i]);
	}
	int start =0;
	int end =4;

	while(start<end){
		int temp ;
		temp = arr[start];
		arr[start]=arr[end];
		arr[end]= temp;
		start++;
		end--;
		
	}
	printf("Reverse Array:");
	for(int i=0;i<5;i++)
		{
	     printf(" [%d]",arr[i]);
		}}


