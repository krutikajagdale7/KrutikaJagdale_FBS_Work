//sort array - logic Compare first no to all

#include<stdio.h>
void ScanArray(int* , int);
void SortFun( int* , int);
void main(){
	int arr[5];
    
	printf("Enter No in array:");
	ScanArray(arr, 5);
	printf("Sorting Array:");
	SortFun(arr, 5);
}
void ScanArray(int* ptr, int size){
	for(int i =0;i<size;i++){
		scanf("%d", &ptr[i]);
	}
	
}

void SortFun(int* ptr, int size){
	int ptr1[5];
	for(int i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(ptr[i]>ptr[j]){
				int temp = ptr[i];
				ptr[i]=ptr[j];
				ptr[j]=temp;
			}	
		}
	}
	
	for(int i=0;i<size;i++){
		printf("[%d]",ptr[i]);
	}
}