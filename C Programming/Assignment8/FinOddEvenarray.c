// find odd even among the no
#include<stdio.h>
void main(){
	int arr[5];
	int num;
	printf(" enter number for array:");
	
	
	
	for(int i=0;i<5;i++){
		scanf("%d", &arr[i]);
	}
	
	for(int i=0;i<5;i++){
		if(arr[i] % 2 == 0){
			printf("\n  at position %d - No is %d Even ",i, arr[i]);
		}
		else{
			printf("\n  at position %d - No is %d Odd ",i, arr[i]);
		}
		
	}
	
}