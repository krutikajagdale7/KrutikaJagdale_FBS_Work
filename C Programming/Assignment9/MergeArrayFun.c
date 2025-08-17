#include<stdio.h>
void ScanArray(int*, int);
void MergeArray(int*, int,int*,int, int*);
void main(){
	
	int arr1[5];
	int arr2[5];
	int arr3[10];
	printf("Enter no. for Array1:");
	ScanArray(arr1,5);
	printf("Enter no. for Array2:");
	ScanArray(arr2,5);
	printf("Merge Array is:");
	MergeArray(arr1,5,arr2,5, arr3);
	
}
void ScanArray(int* ptr, int size){
	for(int i=0;i<size;i++){
		scanf("%d",&ptr[i]);
	}
}
void MergeArray(int* ptr, int size, int* ptr1, int size1,int* ptr2){
	
	for(int i=0;i<size;i++){
		ptr2[i]=ptr[i];
	}
	
	for(int i=0;i<size1;i++){
		ptr2[i+size1]=ptr1[i];
	}
	
	for(int i=0;i<size+size1;i++){
		printf("[%d]",ptr2[i]);
	}
}

