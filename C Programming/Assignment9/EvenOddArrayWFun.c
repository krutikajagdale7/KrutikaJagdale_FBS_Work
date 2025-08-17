// find odd even among the no
#include<stdio.h>
void main(){
	int arr[5];
	
	printf(" enter number for array:");
	ScanArray(arr,5);
    EvenOddFun(arr,5);
	
}

void ScanArray(int* ptr, int size){
	for(int i=0;i<size;i++){
		scanf("%d", &ptr[i]);
		
	}
}
void EvenOddFun(int* ptr, int size, int num){
		for(int i=0;i<size;i++){
		if(ptr[i] % 2 == 0){
			printf("\n  at position %d - No is %d Even ",i, ptr[i]);
		}
		else{
			printf("\n  at position %d - No is %d Odd ",i, ptr[i]);
		}
		
	}
}